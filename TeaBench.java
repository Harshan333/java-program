class TeaBench{
static String location="Banagalore";
static String tea="Pan tea";
static String tea1="Mango tea";
static String tea2="Straberry tea";
static String tea3="Dum tea";
static String tea4="Masala tea";
static String tea5="Cardamon tea";
static String tea6="Kashmir tea";
static String tea7="Grapes tea";
static String tea8="Orange tea";
static String tea9="Rose tea";
static String ChaiAvailableInTeaBench[]={tea,tea1,tea2,tea3,tea4,tea5,tea6,tea7,tea8,tea9};
public static void getChaiAvailableInTeaBench(){
	System.out.println("Welcome To Teabench");
System.out.println("Branch  "+ location);
String reference ="";
	for(int tea=0;tea<ChaiAvailableInTeaBench.length;tea++){
		     reference=ChaiAvailableInTeaBench[tea];
		System.out.println(reference);
	}
	System.out.println("Thank You");

}

}