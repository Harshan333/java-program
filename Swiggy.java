class Swiggy{


public static double search(String foodname){
if("french fry" == foodname){
System.out.println("search food name is "+ foodname);
return 115.00;
}
if("papaya milkshake"==foodname){
System.out.println("search of food is "+ foodname);
return 65.90;
}
if("frtesh fruit"== foodname){
	System.out.println("search of food name is " + foodname);
	return 75.00;
}
if("classic buttermilk"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 40.25;
}
if("oreo milk shake"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 85.55;
}
if("fresh lemon juice"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 50.99;
}
if("badam milk" == foodname){
System.out.println("search food name is" + foodname);
return  45.50;
}
if("bannana milkshake" == foodname){
System.out.println("search food name is" + foodname);
return 65.00;
}
if("pine apple juice" == foodname){
System.out.println("search food name is" + foodname);
return 65.00;
}
if("pepper juice" == foodname){
System.out.println("search food name is" + foodname);
return 10.33;
}
if("water melon juice" == foodname){
System.out.println("search food name is" + foodname);
return 55.33;
}
if("bisleri" == foodname){
System.out.println("search food name is" + foodname);
return 30.00;
}
if("tea" == foodname){
System.out.println("search food name is" + foodname);
return 15.00;
}
if("ginger tea" == foodname){
System.out.println("search food name is" + foodname);
return 95.00;
}
if("black tea" == foodname){
System.out.println("search food name is" + foodname);
return 95.36;	
}
if("elaichi" == foodname){
	System.out.println("search of food name is " + foodname);
	return 45.65;
}
if("desi tea" == foodname){
System.out.println("search food name is"+ foodname);
return 59.00;
}
if("butter roti" == foodname){
System.out.println("search food name is"+ foodname);
return 30.00;
}
if("rotti" == foodname){
System.out.println("search food name is"+ foodname);
return 20.00;
}
if("chhole bhature" == foodname){
System.out.println("search food name is"+ foodname);
return 120.00;
}
return 0.00;
}


//methodoverloading
public static double search(String foodname,int quantity){
if("french fry" == foodname){
System.out.println("search food name is "+ foodname);
return 115.00*quantity;
}
if("papaya milkshake"==foodname){
System.out.println("search of food is "+ foodname);
return 65.90*quantity;
}
if("frtesh fruit"== foodname){
	System.out.println("search of food name is " + foodname);
	return 75.00*quantity;
}
if("classic buttermilk"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 40.25*quantity;
}
if("oreo milk shake"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 85.55*quantity;
}
if("fresh lemon juice"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 50.99*quantity;
}
if("badam milk" == foodname){
System.out.println("search food name is" + foodname);
return  45.50*quantity;
}
if("bannana milkshake" == foodname){
System.out.println("search food name is" + foodname);
return 65.00*quantity;
}
if("pine apple juice" == foodname){
System.out.println("search food name is" + foodname);
return 65.00*quantity;
}
if("pepper juice" == foodname){
System.out.println("search food name is" + foodname);
return 10.33*quantity;
}
if("water melon juice" == foodname){
System.out.println("search food name is" + foodname);
return 55.33*quantity;
}
if("bisleri" == foodname){
System.out.println("search food name is" + foodname);
return 30.00*quantity;
}
if("tea" == foodname){
System.out.println("search food name is" + foodname);
return 15.00*quantity;
}
if("ginger tea" == foodname){
System.out.println("search food name is" + foodname);
return 95.00*quantity;
}
if("black tea" == foodname){
System.out.println("search food name is" + foodname);
return 95.36*quantity;	
}
if("elaichi" == foodname){
	System.out.println("search of food name is " + foodname);
	return 45.65*quantity;
}
if("desi tea" == foodname){
System.out.println("search food name is"+ foodname);
return 59.00*quantity;
}
if("butter roti" == foodname){
System.out.println("search food name is"+ foodname);
return 30.00*quantity;
}
if("rotti" == foodname){
System.out.println("search food name is"+ foodname);
return 20.00*quantity;
}
if("chhole bhature" == foodname){
System.out.println("search food name is"+ foodname);
return 120.00*quantity;
}
return 0.00*quantity;
}

}