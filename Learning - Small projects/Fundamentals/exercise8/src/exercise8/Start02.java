package exercise8;

public class Start02 {

	public static void main(String[] args) {
		
		Account account = new Account();
		Adress adress = new Adress();

		
		adress.setStreet("Ružina 12");
		
		
		
		//account.getAdress().setPlace("Ružina 12"); NE RADI
		account.setAdress(adress);
		
		System.out.println(account.getAdress().getStreet());
		
		
		//na adresi postavite županiju osječko baranjsku
		//i ispišite naziv županije krenuvši od objekta account 
		
		County county = new County();
		
		
		county.setName("Osijek-Baranja County ");
		
		Place place = new Place();
		place.setCounty(county);
		
		adress.setPlace(place);
		
		System.out.println(account.getAdress().getPlace().getCounty().getName());
		
		
	}

}
