class Kfc{


public static double search(String foodname){
if("5leg pc & 2 dips bucket" == foodname){
System.out.println("search food name is "+ foodname);
return 499.00;
}
if("peri peri 10pcs"==foodname){
System.out.println("search of food is "+ foodname);
return  498.90;
}
if("peri peri 4pcs"== foodname){
	System.out.println("search of food name is " + foodname);
	return 300.00;
}
if("classic chicken roll"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 176.25;
}
if("double chicken roll"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 225.55;
}
if("double chiken roll meal for 1"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 379.99;
}
if("mini chiken roll" == foodname){
System.out.println("search food name is" + foodname);
return 119.50;
}
if("classic chiken rool meal for 2" == foodname){
System.out.println("search food name is" + foodname);
return 548.00;
}
if("2 classic chiken roll" == foodname){
System.out.println("search food name is" + foodname);
return 228.00;
}
if("2 double chiken roll" == foodname){
System.out.println("search food name is" + foodname);
return 328.33;
}
if("the allu arjun combo" == foodname){
System.out.println("search food name is" + foodname);
return 448.33;
}
if("buket for two" == foodname){
System.out.println("search food name is" + foodname);
return 448.00;
}
if("stay home buket" == foodname){
System.out.println("search food name is" + foodname);
return 788.00;
}
if("peri peri 10 leg" == foodname){
System.out.println("search food name is" + foodname);
return 914.00;
}
if("peri peri 5leg" == foodname){
System.out.println("search food name is" + foodname);
return 628.36;	
}
if("big 12" == foodname){
	System.out.println("search of food name is " + foodname);
	return 748.65;
}
if("ultimate saving bucket" == foodname){
System.out.println("search food name is"+ foodname);
return 699.00;
}
if("big 8" == foodname){
System.out.println("search food name is"+ foodname);
return 684.00;
}
if("5pc smoky red chiken" == foodname){
System.out.println("search food name is"+ foodname);
return 528.00;
}
if("mingles bucket meal" == foodname){
System.out.println("search food name is"+ foodname);
return 499.00;
}
return 0.00;
}


//methodoveridig
public static double search(String foodname,int quantity){
if("5leg pc & 2 dips bucket" == foodname){
System.out.println("search food name is "+ foodname);
return 499.00*quantity;
}
if("peri peri 10pcs"==foodname){
System.out.println("search of food is "+ foodname);
return  498.90*quantity;
}
if("peri peri 4pcs"== foodname){
	System.out.println("search of food name is " + foodname);
	return 300.00*quantity;
}
if("classic chicken roll"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 176.25*quantity;
}
if("double chicken roll"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 225.55*quantity;
}
if("double chiken roll meal for 1"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 379.99*quantity;
}
if("mini chiken roll" == foodname){
System.out.println("search food name is" + foodname);
return 119.50*quantity;
}
if("classic chiken rool meal for 2" == foodname){
System.out.println("search food name is" + foodname);
return 548.00*quantity;
}
if("2 classic chiken roll" == foodname){
System.out.println("search food name is" + foodname);
return 228.00*quantity;
}
if("2 double chiken roll" == foodname){
System.out.println("search food name is" + foodname);
return 328.33*quantity;
}
if("the allu arjun combo" == foodname){
System.out.println("search food name is" + foodname);
return 448.33*quantity;
}
if("buket for two" == foodname){
System.out.println("search food name is" + foodname);
return 448.00*quantity;
}
if("stay home buket" == foodname){
System.out.println("search food name is" + foodname);
return 788.00*quantity;
}
if("peri peri 10 leg" == foodname){
System.out.println("search food name is" + foodname);
return 914.00*quantity;
}
if("peri peri 5leg" == foodname){
System.out.println("search food name is" + foodname);
return 628.36*quantity;	
}
if("big 12" == foodname){
	System.out.println("search of food name is " + foodname);
	return 748.65*quantity;
}
if("ultimate saving bucket" == foodname){
System.out.println("search food name is"+ foodname);
return 699.00*quantity;
}
if("big 8" == foodname){
System.out.println("search food name is"+ foodname);
return 684.00*quantity;
}
if("5pc smoky red chiken" == foodname){
System.out.println("search food name is"+ foodname);
return 528.00*quantity;
}
if("mingles bucket meal" == foodname){
System.out.println("search food name is"+ foodname);
return 499.00*quantity;
}
return 0.00*quantity;
}
}