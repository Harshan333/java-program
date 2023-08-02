class IndianRupeeTester{

public static void main(String[] details){

 IndianRupee indianRupee=new IndianRupee();
indianRupee.setIndianRupeeId(66);
indianRupee.setRupeeName(100);
indianRupee.setPrintDate("25/05/2022");
indianRupee.setColor("pink");
indianRupee.setSerialNo(12667);
indianRupee.setNoOfLanguages(15);
indianRupee.setSize(2);
 System.out.println(indianRupee.getIndianRupeeId()+"  "+
indianRupee.getRupeeName()
+" "+indianRupee.getPrintDate()+" "+
indianRupee.getColor()+" "+
indianRupee.getNoOfLanguages()+" "+
indianRupee.getSerialNo()+" "+
indianRupee.getSize()+" "+
indianRupee.getLocation());


}


}