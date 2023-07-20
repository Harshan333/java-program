class BarTester{

public static void main(String[] book){
Bar bar=new Bar();
bar.brandName="Vodka";
bar.spiritLevel=400;
bar.price=324;
bar.toDrink();

System.out.println(bar.brandName +"  "+ bar.spiritLevel +"   "+ bar.price +"" );

Bar bar1=new Bar();
bar1.brandName="Whiskey ";
bar1.spiritLevel=350;
bar1.price=328;

System.out.println(bar1.brandName +"  "+ bar1.spiritLevel +"   "+ bar1.price +"" );

Bar bar2=new Bar();
bar2.brandName="Rum ";
bar2.spiritLevel=200;
bar2.price=524;

System.out.println(bar2.brandName +"  "+ bar2.spiritLevel +"   "+ bar2.price +"");
Bar bar3=new Bar();
bar3.brandName="Tequila ";
bar3.spiritLevel=4575;
bar3.price=4454;

System.out.println(bar3.brandName +"  "+ bar3.spiritLevel +"   "+ bar3.price +"" );

Bar bar4=new Bar();
bar4.brandName="Gin";
bar4.spiritLevel=545;
bar4.price=575;

System.out.println(bar4.brandName +"  "+ bar4.spiritLevel +"   "+ bar4.price + "");



Bar bar5=new Bar();
bar5.brandName="Brandy ";
bar5.spiritLevel=4552;
bar5.price=324;

System.out.println(bar5.brandName +"  "+ bar5.spiritLevel +"   "+ bar5.price +"" );

Bar bar6=new Bar();
bar6.brandName="Wine ";
bar6.spiritLevel=400;
bar6.price=575;

System.out.println(bar6.brandName +"  "+ bar6.spiritLevel +"   "+ bar6.price +"" );

Bar bar7=new Bar();
bar7.brandName="Beer ";
bar7.spiritLevel=8252;
bar7.price=5235;

System.out.println(bar7.brandName +"  "+ bar7.spiritLevel +"   "+ bar7.price + "");

Bar bar8=new Bar();
bar8.brandName="Champagne";
bar8.spiritLevel=585;
bar8.price=5785;

System.out.println(bar8.brandName +"  "+ bar8.spiritLevel +"   "+ bar8.price +"" );

Bar bar9=new Bar();
bar9.brandName="Sake";
bar9.spiritLevel=5755;
bar9.price=457;

System.out.println(bar9.brandName +"  "+ bar9.spiritLevel +"   "+ bar9.price +"" );
}




}