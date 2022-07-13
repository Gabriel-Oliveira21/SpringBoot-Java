package one.digitalinnovation.gof_Facade;

import subsistem1.crm.*;
import subsistem2.crm.*;
public class Facade {
	 
	public void studentExchange(String name, String cep, String languages, String university, String course) {
		String city = CepApi.getInstance().recordCity(cep);
		String estate = CepApi.getInstance().recordEstate(cep);
		String country = CepApi.getInstance().recordCountry(cep);
		
		
		CrmService.recordClient(name, cep, city, estate, country, languages, university, course);
	}
}
