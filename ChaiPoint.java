class  ChaiPoint{
	
	//static String tea="masala tea";
	//static String tea1="mango tea";
	//static String tea2="lemon tea";
	//static int index;
static String ChaiAvailable[]={null,null,null,null};
//method
		static int index;
//creating
public static boolean addchai(String chai){
	boolean isAdded = false;
	if(chai!=null){
		
		ChaiAvailable[index]=chai;
		index++;
		 return isAdded=true;
		
	}else{
		System.out.println("Cannot add chi is,asit is a null value");
	}
	return isAdded;
}

public static void getAllChaiAvailble(){
	
System.out.println("Invoking getallchaiavailbale");

for(int Chai=0;Chai<ChaiAvailable.length;Chai++){
	   String reference="";
	  reference=ChaiAvailable[Chai];
	System.out.println("accesing the "+ reference + " at "+ Chai);
}
System.out.println("end of the getallchaivailable");
}
}