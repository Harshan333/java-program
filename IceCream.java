class IceCream{

static String listOfflavors[]={null,null,null,null,null,null};
static int index;
public static boolean addflavors(String flavors){
	boolean isadded=false;
	if(flavors!=null){
		listOfflavors[index]=flavors;
		index++;
		isadded=true;
		
	}else{
		System.out.println("null cannot be a flavors");
		
	}return isadded;	
}

public static void getallflavors(){
	
	for(int flavors=0;flavors<listOfflavors.length;flavors++){
		String reference="";
		reference=listOfflavors[flavors];
		System.out.println("accesing the "+ reference + " at "+ flavors);

	}
}
public static boolean updatedIceName(String oldlistOfflavors,String newlistOfflavors){
	
	boolean isUpdated=false;
	for(int Iceindex=0;Iceindex < listOfflavors.length;Iceindex++){
		if(listOfflavors[Iceindex].equals(oldlistOfflavors)){
			listOfflavors[Iceindex]=newlistOfflavors;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteflavors(String deletedflavors){
	System.out.println("invoking deleteflavors");
	System.out.println("no of parameters:2,type of parameter:String,String");
	boolean isDeleted=false;
	int flavorsindex;
	int noOfElements=listOfflavors.length;
	
	for(flavorsindex =0;flavorsindex < listOfflavors.length;flavorsindex++){
		if(listOfflavors[flavorsindex].equals(deletedflavors)){
			break;
		}
	}
	if(flavorsindex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newflavorsindex=flavorsindex;newflavorsindex<noOfElements;newflavorsindex++){
			listOfflavors[newflavorsindex]=listOfflavors[newflavorsindex+1];
			
		}
 	}
	System.out.println(listOfflavors[flavorsindex]);
	return noOfElements;
}
public static void getAllgetlistOfflavorsPostDeletion(int newLength){
for(int flavorsindex=0;flavorsindex<newLength;flavorsindex++){
	System.out.println(listOfflavors[flavorsindex]);
}
}
}