package subsistem2.crm;

public class CepApi {
	
	private static CepApi instance = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstance() {
		return instance;
	}
	
	public String recordCity(String cep) {
		return "Araraquara";
	}
	
	public String recordEstate(String cep) {
		return "SP";
	}
	
	public String recordCountry(String cep) {
		return "SP";
	}

}
