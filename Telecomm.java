class Telecomm{

static String simcompany[]={null,null,null,null,null,null,};
static int index;
public static boolean addsim(String Sim){
	boolean isSimAdded=false;
	if(Sim!=null){
		simcompany[index]=Sim;
		index++;
		isSimAdded=true;
	}else{
		System.out.println("null value cannot be a sim name");
	}
	return isSimAdded;
}

public static void getsimcompany(){
	
	
	for(int Sim=0;Sim<simcompany.length;Sim++){
		String reference="";
	reference=simcompany[Sim];
System.out.println("accesing the "+ reference + " at "+ Sim);
	}
}
public static boolean updatedSimName(String oldsimcompany,String newsimcompany){
	
	boolean isUpdated=false;
	for(int Simindex=0;Simindex < simcompany.length;Simindex++){
		if(simcompany[Simindex].equals(oldsimcompany)){
			simcompany[Simindex]=newsimcompany;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletesimcompany(String deletedsimcompany){
	System.out.println("invoking deletesimcompanye");
	System.out.println("no of parameters:2,type of parameter:String,String");
	boolean isDeleted=false;
	int Simindex;
	int noOfElements=simcompany.length;
	
	for(Simindex =0;Simindex < simcompany.length;Simindex++){
		if(simcompany[Simindex].equals(deletedsimcompany)){
			break;
		}
	}
	if(Simindex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newSimindex=Simindex;newSimindex<noOfElements;newSimindex++){
			simcompany[newSimindex]=simcompany[newSimindex+1];
			
		}
 	}
	System.out.println(simcompany[Simindex]);
	return noOfElements;
}
public static void getAllgetsimcompanyPostDeletion(int newLength){
for(int Simindex=0;Simindex<newLength;Simindex++){
	System.out.println(simcompany[Simindex]);
}
}
}