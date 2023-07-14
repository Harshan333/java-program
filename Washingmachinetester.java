class Washingmachinetester{

public static void main(String test[]){
boolean connected = Washingmachine.onOrOff();
System.out.println(" is washingmachine is connected"+connected);
Washingmachine.onOrOff();
Washingmachine. increaserotatespeed();
Washingmachine. increaserotatespeed();
Washingmachine. increaserotatespeed();

boolean connected1 = Washingmachine.onOrOff();
System.out.println(" is washingmachine is connected"+connected1);

Washingmachine.onOrOff();
Washingmachine.decreaserotatespeed();
Washingmachine.decreaserotatespeed();
Washingmachine.decreaserotatespeed();

}

}