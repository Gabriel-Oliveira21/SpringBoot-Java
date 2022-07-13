package subsistem1.crm;

public class CrmService {
	private CrmService() {
		super();
	}
	
	public static void recordClient(String name, String cep, String city, String estate, String country, String languages, String university, String course) {
		System.out.println("Save client in the  CRM:");
		System.out.println(name);
		System.out.println(cep);
		System.out.println(city);
		System.out.println(estate);
		System.out.println(country);
		System.out.println(languages);
		System.out.println(university);
		System.out.println(course);
	}

}
