class Oven{

static String name ="LG";
static int minheat;
static int currentheat;
static int maxheat = 50;
static boolean isconnected;


//method

public static boolean onOrOff(){

System.out.println("invoking on or off");
System.out.println("parameter" + 0);
if(isconnected == false){
      isconnected = true;
	  System.out.println("Oven is turned onnnnnnnnnn");
	  }else if(isconnected == true) {
	  isconnected = false;
	  System.out.println("Oven is turned offfff.thank you");
	  }
	  return isconnected;
}
	  
	  
   public static void increaseheat(){
	System.out.println("start of increaseheat");
	System.out.println("list of parameters"+0);
	  if(isconnected == true){		  
		  if(currentheat<maxheat){
			  currentheat = currentheat + 1;
			  System.out.println("the current heat is"+ currentheat);
		  }else{
			  System.out.println("max heat reOvenhed");
		  }
	  }else{
		  System.out.println("turn onn the Oven first");
	  }
		  
	  }
	  public static void  decreaseheat(){
		  System.out.println("invoking decreaseheat()");
		  System.out.println("list of parameter"+0);
		  if(isconnected==true){
			  if(currentheat>minheat){
			  currentheat = currentheat - 1;
			  System.out.println("the current heat is"+ currentheat);
			 
		  }else{
			  System.out.println("min heat reOvenhed");
		  }
		  }else{
		  System.out.println("turn onn the Oven first ");
	  }
}

}
