class LensKart{

String brandName;
double powerOfLens;
  double price;


public LensKart(){
	
	System.out.println("invoke the default constructore");
	
}
public LensKart(String brandName,double powerOfLens){
		this(2000.00);

	this.brandName=brandName;
	this.powerOfLens=powerOfLens;
		System.out.println("invoke LensKart const");
}
public LensKart(double price){
	this.price=price;
	}


}