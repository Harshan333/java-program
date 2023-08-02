class Binacular{

String brandName;
String typeOfLens;
static double price;


public Binacular(){
	
	System.out.println("invoke the default constructore");
	
}
public Binacular(String brandName,String typeOfLens){
		this(1000.00);

	this.brandName=brandName;
	this.typeOfLens=typeOfLens;
		System.out.println("invoke binacular const");
}
public Binacular(double price){
	this.price=price;
	}


}