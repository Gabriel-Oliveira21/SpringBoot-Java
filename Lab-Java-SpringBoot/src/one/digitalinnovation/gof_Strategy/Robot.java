package one.digitalinnovation.gof_Strategy;

public class Robot {
	

		private Emotions emotions;

		public void setEmotions(Emotions emotions) {
			this.emotions = emotions;
		}
		
		public void action() {
			emotions.action();
		}
}


