package one.digitalinnovation.gof;
	
	import one.digitalinnovation.gof_Facade.*;
	import one.digitalinnovation.gof_Singleton.*;
	import one.digitalinnovation.gof_Strategy.*;
	

	public class Test {

		public static void main(String[] args) {
			
			// Singleton
			
			SingletonLazy lazy = SingletonLazy.getInstance();
			System.out.println(lazy);
			lazy = SingletonLazy.getInstance();
			System.out.println(lazy);
			
			SingletonEager eager = SingletonEager.getInstance();
			System.out.println(eager);
			eager = SingletonEager.getInstance();
			System.out.println(eager);
			
			SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
			System.out.println(lazyHolder);
			lazyHolder = SingletonLazyHolder.getInstance();
			System.out.println(lazyHolder);
			
			// Strategy
			
			Emotions angry = new EmotionsAngry();
			Emotions sad = new EmotionsSad();
			Emotions scary = new EmotionsScary();
			Emotions happy = new EmotionsHappy();
			Emotions disgusted = new EmotionsDisgusted();
			
			Robot robot = new Robot();
			robot.setEmotions(sad);
			robot.action();
			robot.setEmotions(disgusted);
			robot.action();
			robot.setEmotions(scary);
			robot.action();
			robot.action();
			robot.action();
			robot.setEmotions(angry);
			robot.setEmotions(happy);
			
			// Facade
			
			Facade facade = new Facade();
			facade.studentExchange("Venilton", "14801788", "Harvad", "Phisicologic");
		}

}
