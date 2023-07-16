class KarnatakaTester{

public static void main(String[] city){
	
	Karnataka.insertCity("Bangalore");
	Karnataka.insertCity("Tumkur");
	Karnataka.insertCity("Mangalore");
	Karnataka.insertCity("Hassan");
	Karnataka.insertCity("Mandya");
	Karnataka.insertCity("Belagavi");
		Karnataka.insertCity("Bellary");
		Karnataka.insertCity("Huballi");

	Karnataka.getCityNames();
	
	Karnataka.updatedCityName("Tumkur","Tumakuru");
		Karnataka.getCityNames();
		
	Karnataka.deleteCityName("Bellary");
		Karnataka.getCityNames();
Karnataka.getAllgetCityNamesPostDeletion(8);
}

}