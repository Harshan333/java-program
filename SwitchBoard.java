class SwitchBoard{

String brandNames;
int nOfSwitches;
String type;
String color;
double price;

public  SwitchBoard(String brandNames,int nOfSwitches,String type,String color,double price){
	/*brandNames=bn;
	nOfSwitches=nos;
	type=tp;
	color=clr;
	price=pr;*/
	this.brandNames=brandNames;
	this.nOfSwitches=nOfSwitches;
	this.type=type;
	this.color=color;
	this.price=price;
	System.out.println("Switch board conmtrusctor is invoked");
	
}

}