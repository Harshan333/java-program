class Garden{

static String flowerslist[]={null,null,null,null,null,null,};
static int index;
public static boolean getflowers(String flower){
	boolean isflowerAdedd=false;
	if(flower!=null){
		flowerslist[index]=flower;
		index++;
		isflowerAdedd=true;
	}else{
		System.out.println("cannot add null to list");
	}
	return isflowerAdedd;
}

public static void getallFlowers(){
	
	for(int flower=0;flower<flowerslist.length;flower++){
		String reference="";
		reference=flowerslist[flower];
		System.out.println("accesing the "+ reference + " at "+ flower);	
	}
}
public static boolean updatedFlowerName(String oldflowerslist,String newflowerslist){
	
	boolean isUpdated=false;
	for(int Flowerindex=0;Flowerindex < flowerslist.length;Flowerindex++){
		if(flowerslist[Flowerindex].equals(oldflowerslist)){
			flowerslist[Flowerindex]=newflowerslist;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteflowerslist(String deletedflowerslist){
	System.out.println("invoking deleteflowerslist");
	System.out.println("no of parameters:2,type of parameter:String,String");
	boolean isDeleted=false;
	int Flowerindex;
	int noOfElements=flowerslist.length;
	
	for(Flowerindex =0;Flowerindex < flowerslist.length;Flowerindex++){
		if(flowerslist[Flowerindex].equals(deletedflowerslist)){
			break;
		}
	}
	if(Flowerindex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newFlowerindex=Flowerindex;newFlowerindex<noOfElements;newFlowerindex++){
			flowerslist[newFlowerindex]=flowerslist[newFlowerindex+1];
			
		}
 	}
	System.out.println(flowerslist[Flowerindex]);
	return noOfElements;
}
public static void getAllgetflowerslistPostDeletion(int newLength){
for(int Flowerindex=0;Flowerindex<newLength;Flowerindex++){
	System.out.println(flowerslist[Flowerindex]);
}
}
}