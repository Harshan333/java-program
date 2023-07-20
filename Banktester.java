class Banktester{

public static void main(String account[]){
	Bankaccount.credit(500);
		double currentbalance=Bankaccount.getbalance();
		System.out.println(currentbalance);
	Bankaccount.debit(500);
  currentbalance=Bankaccount.getbalance();
		System.out.println(currentbalance);
}

}