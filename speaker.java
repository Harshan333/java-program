class speaker{

static String name ="jbi";
static int minVolume;
static int currentVolume;
static int maxVolume = 30;
static boolean isconnected;


//method

public static boolean onOrOff(){

System.out.println("invoking on or off");
System.out.println("parameter" + 0);
if(isconnected == false){
      isconnected = true;
	  System.out.println("speaker is turned onnnnnnn. enjoyyyyy");
	  }else if(isconnected == true) {
	  isconnected = false;
	  System.out.println("speaker is turned offfff.thank you");
	  }
	  return isconnected;
}
	  //increase the volume
	  
   public static void increaseVolume(){
	System.out.println("start of increasevolume");
	System.out.println("list of parameters"+2);
	  if(isconnected == true){		  
		  if(currentVolume<maxVolume){
			  currentVolume = currentVolume + 1;
			  System.out.println("the current volume is"+ currentVolume);
		  }else{
			  System.out.println("max volume reached");
		  }
	  }else{
		  System.out.println("turn onn the speaker first");
	  }
		  
	  }
	  public static void  decreaseVolume(){
		  System.out.println("invoking decreasevolume()");
		  System.out.println("list of parameter"+0);
		  if(isconnected==true){
			  if(currentVolume>minVolume){
			  currentVolume = currentVolume - 1;
			  System.out.println("the current volume is"+ currentVolume);
			 
		  }else{
			  System.out.println("min volume reached");
		  }
		  }else{
		  System.out.println("the volume");
	  }
}

}
