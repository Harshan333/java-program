class TravelAgency{

static String touristPlaces[]={null,null,null,null,null,null,};
static int index;
public static boolean addPlaces(String  Places){
	boolean isPlacesAdded=false;
	if(Places!=null){
		touristPlaces[index]=Places;
		index++;
		isPlacesAdded=true;
	}else{
		System.out.println("null value cannot be a Places name");
	}
	return isPlacesAdded;
}

public static void getPlacesNames(){
	
	
	for(int Places=0;Places<touristPlaces.length;Places++){
		String reference="";
	reference=touristPlaces[Places];
System.out.println("accesing the "+ reference + " at "+ Places);
	}
}
public static boolean updatedPlaceName(String oldtouristPlaces,String newtouristPlaces){
	
	boolean isUpdated=false;
	for(int Placeindex=0;Placeindex < touristPlaces.length;Placeindex++){
		if(touristPlaces[Placeindex].equals(oldtouristPlaces)){
			touristPlaces[Placeindex]=newtouristPlaces;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletetouristPlaces(String deletedtouristPlaces){
	System.out.println("invoking deleteCityname");
	System.out.println("no of parameters:2,type of parameter:String,String");
	boolean isDeleted=false;
	int Placesindex;
	int noOfElements=touristPlaces.length;
	
	for(Placesindex =0;Placesindex < touristPlaces.length;Placesindex++){
		if(touristPlaces[Placesindex].equals(deletedtouristPlaces)){
			break;
		}
	}
	if(Placesindex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newPlacesindex=Placesindex;newPlacesindex<noOfElements;newPlacesindex++){
			touristPlaces[newPlacesindex]=touristPlaces[newPlacesindex+1];
			
		}
 	}
	System.out.println(touristPlaces[Placesindex]);
	return noOfElements;
}
public static void getAllgettouristPlacesPostDeletion(int newLength){
for(int Placesindex=0;Placesindex<newLength;Placesindex++){
	System.out.println(touristPlaces[Placesindex]);
}
}
}