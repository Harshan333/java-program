class Ecart{

static String platForm="Ecart delivery service";
private String product;
 double price;
int noOfItems;

public Ecart(double price,int noOfItems){

this.price=price;
this.noOfItems=noOfItems;
System.out.println("informaton list");
}


//setter
public void setProduct(String product){
	this.product=product;
}
//getter
public String getProduct(){
	return product;
}

}