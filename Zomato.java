class Zomato{


public static double search(String foodname){
if("pizza" == foodname){
System.out.println("search food name is "+ foodname);
return 99.00;
}

if("veg biriyani"==foodname){
System.out.println("search of food is "+ foodname);
return 245.90;
}
if("chiken"== foodname){
	System.out.println("search of food name is " + foodname);
	return 300.00;
}
if("samosa"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 25.25;
}
if("rice"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 50.55;
}
if("kushka"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 99.99;
}
if("chiken fry" == foodname){
System.out.println("search food name is" + foodname);
return 149.50;
}
if("mushroom fry" == foodname){
System.out.println("search food name is" + foodname);
return 160.00;
}
if("mutton fry" == foodname){
System.out.println("search food name is" + foodname);
return 255.00;
}
if("pepper fish" == foodname){
System.out.println("search food name is" + foodname);
return 106.33;
}
if("chiken masala" == foodname){
System.out.println("search food name is" + foodname);
return 146.33;
}
if("fish sambar" == foodname){
System.out.println("search food name is" + foodname);
return 199.00;
}
if("kaima" == foodname){
System.out.println("search food name is" + foodname);
return 156.00;
}
if("mutton chakna" == foodname){
System.out.println("search food name is" + foodname);
return 255.00;
}
if("liver fry" == foodname){
System.out.println("search food name is" + foodname);
return 70.36;	
}
if("boti fry" == foodname){
	System.out.println("search of food name is " + foodname);
	return 175.65;
}
if("chiken mandi" == foodname){
System.out.println("search food name is"+ foodname);
return 299.00;
}
if("ambur" == foodname){
System.out.println("search food name is"+ foodname);
return 999.00;
}
if("mutton thali" == foodname){
System.out.println("search food name is"+ foodname);
return 599.00;
}
if("chiken pepper fry with extra chilli" == foodname){
System.out.println("search food name is"+ foodname);
return 189.00;
}
return 0.00;
}


//methodoverloading
public static double search(String foodname, int quantity){
if("pizza" == foodname){
System.out.println("search food name is "+ foodname );
return 99.00 * quantity;
}

if("veg biriyani"==foodname){
System.out.println("search of food is "+ foodname);
return 245.90* quantity;
}
if("chiken"== foodname){
	System.out.println("search of food name is " + foodname);
	return 300.00* quantity;
}
if("samosa"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 25.25* quantity;
}
if("rice"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 50.55* quantity;
}
if("kushka"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 99.99* quantity;
}
if("chiken fry" == foodname){
System.out.println("search food name is" + foodname);
return 149.50* quantity;
}
if("mushroom fry" == foodname){
System.out.println("search food name is" + foodname);
return 160.00* quantity;
}
if("mutton fry" == foodname){
System.out.println("search food name is" + foodname);
return 255.00* quantity;
}
if("pepper fish" == foodname){
System.out.println("search food name is" + foodname);
return 106.33* quantity;
}
if("chiken masala" == foodname){
System.out.println("search food name is" + foodname);
return 146.33* quantity;
}
if("fish sambar" == foodname){
System.out.println("search food name is" + foodname);
return 199.00* quantity;
}
if("kaima" == foodname){
System.out.println("search food name is" + foodname);
return 156.00* quantity;
}
if("mutton chakna" == foodname){
System.out.println("search food name is" + foodname);
return 255.00* quantity;
}
if("liver fry" == foodname){
System.out.println("search food name is" + foodname);
return 70.36* quantity;	
}
if("boti fry" == foodname){
	System.out.println("search of food name is " + foodname);
	return 175.65* quantity;
}
if("chiken mandi" == foodname){
System.out.println("search food name is"+ foodname);
return 299.00* quantity;
}
if("ambur" == foodname){
System.out.println("search food name is"+ foodname);
return 999.00* quantity;
}
if("mutton thali" == foodname){
System.out.println("search food name is"+ foodname);
return 599.00* quantity;
}
if("chiken pepper fry with extra chilli" == foodname){
System.out.println("search food name is"+ foodname);
return 189.00* quantity;
}
return 0.00* quantity;
}
}
