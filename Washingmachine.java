class Washingmachine{

static String name ="LG";
static int minrotatespeed;
static int currentrotatespeed;
static int maxrotatespeed = 50;
static boolean isconnected;


//method

public static boolean onOrOff(){

System.out.println("invoking on or off");
System.out.println("parameter" + 0);
if(isconnected == false){
      isconnected = true;
	  System.out.println("Washingmachine is turned onnnnnnnnnn");
	  }else if(isconnected == true) {
	  isconnected = false;
	  System.out.println("Washingmachine is turned offfff.thank you");
	  }
	  return isconnected;
}
	  
	  
   public static void increaserotatespeed(){
	System.out.println("start of increaserotatespeed");
	System.out.println("list of parameters"+0);
	  if(isconnected == true){		  
		  if(currentrotatespeed<maxrotatespeed){
			  currentrotatespeed = currentrotatespeed + 1;
			  System.out.println("the current rotatespeed is"+ currentrotatespeed);
		  }else{
			  System.out.println("max rotatespeed reWashingmachinehed");
		  }
	  }else{
		  System.out.println("turn onn the Washingmachine first");
	  }
		  
	  }
	  public static void  decreaserotatespeed(){
		  System.out.println("invoking decreaserotatespeed()");
		  System.out.println("list of parameter"+0);
		  if(isconnected==true){
			  if(currentrotatespeed>minrotatespeed){
			  currentrotatespeed = currentrotatespeed - 1;
			  System.out.println("the current volume is"+ currentrotatespeed);
			 
		  }else{
			  System.out.println("min rotatespeed reWashingmachinehed");
		  }
		  }else{
		  System.out.println("turn onn the Washingmachine first ");
	  }
}

}
