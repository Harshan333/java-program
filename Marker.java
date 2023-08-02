class Marker{

String brandName;
String color;
static double price;


public Marker(){
	
	System.out.println("invoke the default constructor");
	
}
public Marker(String brandName,String color){
		this(1000.00);

	this.brandName=brandName;
	this.color=color;
		System.out.println("invoke Marker const");
}
public Marker(double price){
	this.price=price;
	}


}