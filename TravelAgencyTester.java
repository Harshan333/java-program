class TravelAgencyTester{

public static void main(String Places[]){

TravelAgency.addPlaces("mangalore");
TravelAgency.addPlaces("coorg");
TravelAgency.addPlaces("mysore");
TravelAgency.addPlaces("gokarna" );
TravelAgency.addPlaces("sakaleshpura" );
TravelAgency.addPlaces("agumbe");
TravelAgency.getPlacesNames();

TravelAgency.updatedPlaceName("agumbe","new ghat");
TravelAgency.getPlacesNames();
TravelAgency.deletetouristPlaces("coorg");
TravelAgency.getAllgettouristPlacesPostDeletion(5);
}


}