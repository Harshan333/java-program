class Dominos{


public static double search(String foodname){
if("marghreta pizza" == foodname){
System.out.println("search food name is "+ foodname);
return 99.00;
}
if("cheese n tomatopizza"==foodname){
System.out.println("search of food is "+ foodname);
return 169.90;
}
if("double cheese pizza"== foodname){
	System.out.println("search of food name is " + foodname);
	return 189.00;
}
if("fresh veggie"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 225.25;
}
if("peppy paneer pizza"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 229.55;
}
if("veggie paradise"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 229.99;
}
if("veg extravaganza" == foodname){
System.out.println("search food name is" + foodname);
return 249.50;
}
if("cheese dominator" == foodname){
System.out.println("search food name is" + foodname);
return 319.00;
}
if("4 cheese pizza" == foodname){
System.out.println("search food name is" + foodname);
return 319.00;
}
if("deluxe veggie pizza" == foodname){
System.out.println("search food name is" + foodname);
return 249.33;
}
if("paneer makhani" == foodname){
System.out.println("search food name is" + foodname);
return 249.33;
}
if("indi tandoori" == foodname){
System.out.println("search food name is" + foodname);
return  255.00;
}
if("achari" == foodname){
System.out.println("search food name is" + foodname);
return 178.00;
}
if("pepper barbecue pizza" == foodname){
System.out.println("search food name is" + foodname);
return 255.00;
}
if("pepper barbecue pizza chiken" == foodname){
System.out.println("search food name is" + foodname);
return 570.36;	
}
if("pepper barbecue pizza veg" == foodname){
	System.out.println("search of food name is " + foodname);
	return 275.65;
}
if("pepper barbecue family pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 999.00;
}
if("pepper barbecue onion pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 399.00;
}
if("chicken golden delight pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 539.00;
}
if("non veg supreme pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 679.00;
}
return 0.00;
}

//methodoverriding

public static double search(String foodname,int quantity){
if("marghreta pizza" == foodname){
System.out.println("search food name is "+ foodname);
return 99.00*quantity;
}
if("cheese n tomatopizza"==foodname){
System.out.println("search of food is "+ foodname);
return 169.90*quantity;
}
if("double cheese pizza"== foodname){
	System.out.println("search of food name is " + foodname);
	return 189.00*quantity;
}
if("fresh veggie"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 225.25*quantity;
}
if("peppy paneer pizza"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 229.55*quantity;
}
if("veggie paradise"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 229.99*quantity;
}
if("veg extravaganza" == foodname){
System.out.println("search food name is" + foodname);
return 249.50*quantity;
}
if("cheese dominator" == foodname){
System.out.println("search food name is" + foodname);
return 319.00*quantity;
}
if("4 cheese pizza" == foodname){
System.out.println("search food name is" + foodname);
return 319.00*quantity;
}
if("deluxe veggie pizza" == foodname){
System.out.println("search food name is" + foodname);
return 249.33*quantity;
}
if("paneer makhani" == foodname){
System.out.println("search food name is" + foodname);
return 249.33*quantity;
}
if("indi tandoori" == foodname){
System.out.println("search food name is" + foodname);
return  255.00*quantity;
}
if("achari" == foodname){
System.out.println("search food name is" + foodname);
return 178.00*quantity;
}
if("pepper barbecue pizza" == foodname){
System.out.println("search food name is" + foodname);
return 255.00*quantity;
}
if("pepper barbecue pizza chiken" == foodname){
System.out.println("search food name is" + foodname);
return 570.36*quantity;	
}
if("pepper barbecue pizza veg" == foodname){
	System.out.println("search of food name is " + foodname);
	return 275.65*quantity;
}
if("pepper barbecue family pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 999.00*quantity;
}
if("pepper barbecue onion pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 399.00*quantity;
}
if("chicken golden delight pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 539.00*quantity;
}
if("non veg supreme pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 679.00*quantity;
}
return 0.00*quantity;
}
}