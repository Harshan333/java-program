class  Metro{

static String listOfMetrostation[]={null,null,null,null,null,null};
static int index;
public static boolean addStation(String station){
	boolean isadded=false;
	if(station!=null){
		listOfMetrostation[index]=station;
		index++;
		isadded=true;
		
	}else{
		System.out.println("null cannot be a station");
		
	}return isadded;	
}

public static void getallstation(){
	
	for(int station=0;station<listOfMetrostation.length;station++){
		String reference="";
		reference=listOfMetrostation[station];
		System.out.println("accesing the "+ reference + " at "+ station);

	}
}
public static boolean updatedStationName(String oldlistOfMetrostation,String newlistOfMetrostation){
	
	boolean isUpdated=false;
	for(int Stationindex=0;Stationindex < listOfMetrostation.length;Stationindex++){
		if(listOfMetrostation[Stationindex].equals(oldlistOfMetrostation)){
			listOfMetrostation[Stationindex]=newlistOfMetrostation;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteMetrostation(String Metrostation){
	System.out.println("invoking deleteCityname");
	System.out.println("no of parameters:2,type of parameter:String,String");
	boolean isDeleted=false;
	int Metroindex;
	int noOfElements=listOfMetrostation.length;
	
	for(Metroindex =0;Metroindex < listOfMetrostation.length;Metroindex++){
		if(listOfMetrostation[Metroindex].equals(Metrostation)){
			break;
		}
	}
	if(Metroindex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newMetroindex=Metroindex;newMetroindex<noOfElements;newMetroindex++){
			listOfMetrostation[newMetroindex]=listOfMetrostation[newMetroindex+1];
			
		}
 	}
	System.out.println(listOfMetrostation[Metroindex]);
	return noOfElements;
}
public static void getAllgetlistOfMetrostationPostDeletion(int newLength){
for(int Metroindex=0;Metroindex<newLength;Metroindex++){
	System.out.println(listOfMetrostation[Metroindex]);
}
}
}