class Television{

static String name ="LG";
static int minbrightness;
static int currentbrightness;
static int maxbrightness = 50;
static boolean isconnected;


//method

public static boolean onOrOff(){

System.out.println("invoking on or off");
System.out.println("parameter" + 0);
if(isconnected == false){
      isconnected = true;
	  System.out.println("Television is turned onnnnnnnnnn");
	  }else if(isconnected == true) {
	  isconnected = false;
	  System.out.println("Television is turned offfff.thank you");
	  }
	  return isconnected;
}
	  
	  
   public static void increasebrightness(){
	System.out.println("start of increasebrightness");
	System.out.println("list of parameters"+0);
	  if(isconnected == true){		  
		  if(currentbrightness<maxbrightness){
			  currentbrightness = currentbrightness + 1;
			  System.out.println("the current brightness is"+ currentbrightness);
		  }else{
			  System.out.println("max brightness reTelevisionhed");
		  }
	  }else{
		  System.out.println("turn onn the Television first");
	  }
		  
	  }
	  public static void  decreasebrightness(){
		  System.out.println("invoking decreasebrightness()");
		  System.out.println("list of parameter"+0);
		  if(isconnected==true){
			  if(currentbrightness>minbrightness){
			  currentbrightness = currentbrightness - 1;
			  System.out.println("the current brightness is"+ currentbrightness);
			 
		  }else{
			  System.out.println("min brightness reTelevisionhed");
		  }
		  }else{
		  System.out.println("turn onn the Television first ");
	  }
}

}
