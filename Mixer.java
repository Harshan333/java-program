class Mixer{

static String name ="LG";
static int minspeed;
static int currentspeed;
static int maxspeed = 50;
static boolean isconnected;


//method

public static boolean onOrOff(){

System.out.println("invoking on or off");
System.out.println("parameter" + 0);
if(isconnected == false){
      isconnected = true;
	  System.out.println("Mixer is turned onnnnnnnnnn");
	  }else if(isconnected == true) {
	  isconnected = false;
	  System.out.println("Mixer is turned offfff.thank you");
	  }
	  return isconnected;
}
	  
	  
   public static void increasespeed(){
	System.out.println("start of increasespeed");
	System.out.println("list of parameters"+0);
	  if(isconnected == true){		  
		  if(currentspeed<maxspeed){
			  currentspeed = currentspeed + 1;
			  System.out.println("the current speed is"+ currentspeed);
		  }else{
			  System.out.println("max speed reMixerhed");
		  }
	  }else{
		  System.out.println("turn onn the Mixer first");
	  }
		  
	  }
	  public static void  decreasespeed(){
		  System.out.println("invoking decreasespeed()");
		  System.out.println("list of parameter"+0);
		  if(isconnected==true){
			  if(currentspeed>minspeed){
			  currentspeed = currentspeed - 1;
			  System.out.println("the current volume is"+ currentspeed);
			 
		  }else{
			  System.out.println("min speed reMixerhed");
		  }
		  }else{
		  System.out.println("turn onn the Mixer first ");
	  }
}

}
