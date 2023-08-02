class Ac{

static String name ="LG";
static int mintemp;
static int currenttemp;
static int maxtemp = 50;
static boolean isconnected;


//method

public static boolean onOrOff(){

System.out.println("invoking on or off");
System.out.println("parameter" + 0);
if(isconnected == false){
      isconnected = true;
	  System.out.println("Ac is turned onnnnnnnnnn");
	  }else if(isconnected == true) {
	  isconnected = false;
	  System.out.println("Ac is turned offfff.thank you");
	  }
	  return isconnected;
}
	  //increase the volume
	  
   public static void increasetemp(){
	System.out.println("start of increasetemp");
	System.out.println("list of parameters"+0);
	  if(isconnected == true){		  
		  if(currenttemp<maxtemp){
			  currenttemp = currenttemp + 1;
			  System.out.println("the current temp is"+ currenttemp);
		  }else{
			  System.out.println("max temp reached");
		  }
	  }else{
		  System.out.println("turn onn the ac first");
	  }
		  
	  }
	  public static void  decreasetemp(){
		  System.out.println("invoking decreasetemp()");
		  System.out.println("list of parameter"+0);
		  if(isconnected==true){
			  if(currenttemp>mintemp){
			  currenttemp = currenttemp - 1;
			  System.out.println("the current volume is"+ currenttemp);
			 
		  }else{
			  System.out.println("min temp reached");
		  }
		  }else{
		  System.out.println("turn onn the ac first ");
	  }
}

}
