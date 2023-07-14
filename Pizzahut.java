class Pizzahut{


public static double search(String foodname){
if("triple pizza" == foodname){
System.out.println("search food name is "+ foodname);
return 299.00;
}
if("triple treat box"==foodname){
System.out.println("search of food is "+ foodname);
return 699.90;
}
if("triple treat box non veg"== foodname){
	System.out.println("search of food name is " + foodname);
	return 300.00;
}
if("triple treat box pure veg"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 25.25;
}
if("family fun meal 1"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 100.55;
}
if("family fun meal 2"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 199.99;
}
if("family fun meal 5" == foodname){
System.out.println("search food name is" + foodname);
return 749.50;
}
if("big pizza meal 2" == foodname){
System.out.println("search food name is" + foodname);
return 160.00;
}
if("big pizza meal 3" == foodname){
System.out.println("search food name is" + foodname);
return 255.00;
}
if("big pizza meal" == foodname){
System.out.println("search food name is" + foodname);
return 106.33;
}
if("magic pizza box" == foodname){
System.out.println("search food name is" + foodname);
return 146.33;
}
if("magic pizza box 1" == foodname){
System.out.println("search food name is" + foodname);
return 199.00;
}
if("magic pizza box non veg" == foodname){
System.out.println("search food name is" + foodname);
return 156.00;
}
if("magic pizza box 7" == foodname){
System.out.println("search food name is" + foodname);
return 655.00;
}
if("personal pan pizza" == foodname){
System.out.println("search food name is" + foodname);
return 470.36;	
}
if("personal pan pizza 2" == foodname){
	System.out.println("search of food name is " + foodname);
	return 175.65;
}
if("personal pan pizza non veg" == foodname){
System.out.println("search food name is"+ foodname);
return 899.00;
}
if("personal pan pizza veg" == foodname){
System.out.println("search food name is"+ foodname);
return 299.00;
}
if("big pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 999.00;
}
if("small pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 99.00;
}
return 0.00;
}
//methodoverriding
public static double search(String foodname,int quantity){
if("triple pizza" == foodname){
System.out.println("search food name is "+ foodname);
return 299.00*quantity;
}
if("triple treat box"==foodname){
System.out.println("search of food is "+ foodname);
return 699.90*quantity;
}
if("triple treat box non veg"== foodname){
	System.out.println("search of food name is " + foodname);
	return 300.00*quantity;
}
if("triple treat box pure veg"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 25.25*quantity;
}
if("family fun meal 1"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 100.55*quantity;
}
if("family fun meal 2"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 199.99*quantity;
}
if("family fun meal 5" == foodname){
System.out.println("search food name is" + foodname);
return 749.50*quantity;
}
if("big pizza meal 2" == foodname){
System.out.println("search food name is" + foodname);
return 160.00*quantity;
}
if("big pizza meal 3" == foodname){
System.out.println("search food name is" + foodname);
return 255.00*quantity;
}
if("big pizza meal" == foodname){
System.out.println("search food name is" + foodname);
return 106.33*quantity;
}
if("magic pizza box" == foodname){
System.out.println("search food name is" + foodname);
return 146.33*quantity;
}
if("magic pizza box 1" == foodname){
System.out.println("search food name is" + foodname);
return 199.00*quantity;
}
if("magic pizza box non veg" == foodname){
System.out.println("search food name is" + foodname);
return 156.00*quantity;
}
if("magic pizza box 7" == foodname){
System.out.println("search food name is" + foodname);
return 655.00*quantity;
}
if("personal pan pizza" == foodname){
System.out.println("search food name is" + foodname);
return 470.36*quantity;	
}
if("personal pan pizza 2" == foodname){
	System.out.println("search of food name is " + foodname);
	return 175.65*quantity;
}
if("personal pan pizza non veg" == foodname){
System.out.println("search food name is"+ foodname);
return 899.00*quantity;
}
if("personal pan pizza veg" == foodname){
System.out.println("search food name is"+ foodname);
return 299.00*quantity;
}
if("big pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 999.00*quantity;
}
if("small pizza" == foodname){
System.out.println("search food name is"+ foodname);
return 99.00*quantity;
}
return 0.00*quantity;
}
}