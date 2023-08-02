class Aeroplane{
String name;
String noOfSeats;

public Aeroplane(String name,String noOfSeats){
this.name=name;
this.noOfSeats=noOfSeats;
}
public void instanceMethod(){
	   Aeroplane  areoplane=new Aeroplane("tata",50);
  Aeroplane  areoplane=new Aeroplane("spicejet",50);
	System.out.println(areoplane.name+"  "+areoplane.noOfSeats );
System.out.println(areoplane.name+"  "+areoplane.noOfSeats );
	
}
}