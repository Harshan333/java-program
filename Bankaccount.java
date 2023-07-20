class Bankaccount{

 
static double currentbalance;
 

public static boolean credit(int amount){
	 boolean iscredited=false;
	 if(amount>=0){
		currentbalance=currentbalance + amount;
		iscredited=true;
		System.out.println("amount is"+currentbalance);
}
		return iscredited;
}
	
	
	public static boolean debit(int amount){
			System.out.println("invoking debit");
			 boolean isdebited=false;
			 if(amount<=currentbalance){
		currentbalance=currentbalance - amount;
		isdebited=true;
		System.out.println("amount is"+currentbalance);
	}
			return isdebited;

}
public static double getbalance(){
	System.out.println("");
	return currentbalance;
}

}