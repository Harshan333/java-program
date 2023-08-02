class BankTester{

public static void main (String[] bankdetail){
	
	
Bank bank=new Bank();

bank.setAddress("rajajinagar");
bank.setBankID(33);
bank.setBankName("union");
bank.setBranchCode("a52b");
bank.setBranchManager("harish");
bank.setHelpLineNo(565);
bank.setIfsc("u123");
bank.setMisc("UNI33");
bank.setWebsite("www.union.in");

System.out.println(bank.getAddress()+"   "+bank.getBankName()+"  "+bank.getBnakId()+"   "+bank.getBranchCode()+"   "+bank.getBranchMager()+"   "+bank.getHelpLineNo()+"   "+bank.getIfcs()+"   "+bank.getMisc()+"   "+bank.getWebsite());
}
 
}