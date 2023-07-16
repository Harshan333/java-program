class Karnataka{
	
	
static String CityNames[]={null,null,null,null,null,null,null,null};
static int index;
public static boolean insertCity(String City){
	boolean iscityAdded=false;
	if(index < CityNames.length ){
	if(City!=null){
		CityNames[index]=City;
		index++;
		iscityAdded=true;
	}else{
		System.out.println("city name cannot be a nll value");	
	}}else{
		System.out.println("CityNames crossing index value");
	}
return iscityAdded;
}
public static void getCityNames(){
	
	System.out.println("invoking city names");
	for(int City=0;City<CityNames.length;City++){
		String reference="";
		reference=CityNames[City];
		System.out.println("accesing the "+ reference + " at "+ City);	
	}
	
	System.out.println("end of the getcity names");
}


public static boolean updatedCityName(String oldCityNames,String newCityNames){
	
	boolean isUpdated=false;
	for(int cityindex =0;cityindex < CityNames.length;cityindex++){
		if(CityNames[cityindex].equals(oldCityNames)){
			CityNames[cityindex]=newCityNames;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteCityName(String deletedStation){
	System.out.println("invoking deleteCityname");
	System.out.println("no of parameters:2,type of parameter:String,String");
	boolean isDeleted=false;
	int cityindex;
	int noOfElements=CityNames.length;
	
	for(cityindex =0;cityindex < CityNames.length;cityindex++){
		if(CityNames[cityindex].equals(deletedStation)){
			break;
		}
	}
	if(cityindex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newCityIndex=cityindex;newCityIndex<noOfElements;newCityIndex++){
			CityNames[newCityIndex]=CityNames[newCityIndex+1];
			
		}
 	}
	System.out.println(CityNames[cityindex]);
	return noOfElements;
}
public static void getAllgetCityNamesPostDeletion(int newLength){
for(int cityindex=0;cityindex<newLength;cityindex++){
	System.out.println(CityNames[cityindex]);
}
}
}