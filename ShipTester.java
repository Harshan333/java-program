class ShipTester{

public static void main(String[] book){
Ship ship=new Ship();
ship.name="USS Nimitz (CVN-68)";
ship.type="Aircraft Carrier";
ship.country="US";
ship.toSAIL();

System.out.println(ship.name +"  "+ ship.type +"   "+ ship.country +"" );

Ship ship1=new Ship();
ship1.name="Titanic";
ship1.type="Ocean Liner";
ship1.country="UK";

System.out.println(ship1.name +"  "+ ship1.type +"   "+ ship1.country +"" );

Ship ship2=new Ship();
ship2.name="Victory ";
ship2.type=" First-rate ship of the Line";
ship2.country="US";

System.out.println(ship2.name +"  "+ ship2.type +"   "+ ship2.country +"");

Ship ship3=new Ship();
ship3.name="Arizona ";
ship3.type="Battleship ";
ship3.country="US";

System.out.println(ship3.name +"  "+ ship3.type +"   "+ ship3.country +"" );

Ship ship4=new Ship();
ship4.name="Queen Mary 2";
ship4.type="Cruise ship";
ship4.country="United Kingdom";

System.out.println(ship4.name +"  "+ ship4.type +"   "+ ship4.country + "");



Ship ship5=new Ship();
ship5.name="Gerald ";
ship5.type="Aircraft Carrier";
ship5.country="US";

System.out.println(ship5.name +"  "+ ship5.type +"   "+ ship5.country +"" );

Ship ship6=new Ship();
ship6.name="Vikramaditya ";
ship6.type="Aircraft Carrier";
ship6.country="India";

System.out.println(ship6.name +"  "+ ship6.type +"   "+ ship6.country +"" );

Ship ship7=new Ship();
ship7.name="Yamato ";
ship7.type="Battleship ";
ship7.country="Japan";

System.out.println(ship7.name +"  "+ ship7.type +"   "+ ship7.country + "");

Ship ship8=new Ship();
ship8.name="Bounty ";
ship8.type="Tall ship";
ship8.country="UK";

System.out.println(ship8.name +"  "+ ship8.type +"   "+ ship8.country +"" );

Ship ship9=new Ship();
ship9.name="Queen Elizabeth 2";
ship9.type="Ocean Liner";
ship9.country="UK";

System.out.println(ship9.name +"  "+ ship9.type +"   "+ ship9.country +"" );
}




}