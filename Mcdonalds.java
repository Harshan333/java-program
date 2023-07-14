class Mcdonalds{


public static double search(String foodname){
if("mcspicy chicken burger" == foodname){
System.out.println("search food name is "+ foodname);
return 159.00;
}
if("mcspicy panner burger"==foodname){
System.out.println("search of food is "+ foodname);
return 159.90;
}
if("mcveggie"== foodname){
	System.out.println("search of food name is " + foodname);
	return 118.00;
}
if("mcchiken"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 112.25;
}
if("big spic paneer"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 184.55;
}
if("big spicy chicken"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 184.99;
}
if("big spicy chicken" == foodname){
System.out.println("search food name is" + foodname);
return 304.50;
}
if("chicken mc" == foodname){
System.out.println("search food name is" + foodname);
return 171.00;
}
if("chiken 9pcs" == foodname){
System.out.println("search food name is" + foodname);
return 138.00;
}
if("filetofishburger" == foodname){
System.out.println("search food name is" + foodname);
return 138.33;
}
if("chicken mcnuggets 9pcs" == foodname){
System.out.println("search food name is" + foodname);
return 193.33;
}
if("chicken mcnuggets 20pcs" == foodname){
System.out.println("search food name is" + foodname);
return 304.00;
}
if("chicken mcnuggets 6pcs" == foodname){
System.out.println("search food name is" + foodname);
return 137.00;
}
if("chicken mcnuggets piri 9pcs" == foodname){
System.out.println("search food name is" + foodname);
return 255.00;
}
if("chicken mcnuggets piri 6pcs" == foodname){
System.out.println("search food name is" + foodname);
return 161.36;	
}
if("2mcaloo tikki" == foodname){
	System.out.println("search of food name is " + foodname);
	return 293.65;
}
if("2american cheese" == foodname){
System.out.println("search food name is"+ foodname);
return 688.00;
}
if("american supreme" == foodname){
System.out.println("search food name is"+ foodname);
return 913.00;
}
if("coke medum" == foodname){
System.out.println("search food name is"+ foodname);
return 89.00;
}
if("2strawberry" == foodname){
System.out.println("search food name is"+ foodname);
return 270.00;
}
return 0.00;
}

//methodoverloading

public static double search(String foodname,int quatity){
if("mcspicy chicken burger" == foodname){
System.out.println("search food name is "+ foodname);
return 159.00*quatity;
}
if("mcspicy panner burger"==foodname){
System.out.println("search of food is "+ foodname);
return 159.90*quatity;
}
if("mcveggie"== foodname){
	System.out.println("search of food name is " + foodname);
	return 118.00*quatity;
}
if("mcchiken"==foodname){
	System.out.println("search of foodname is " + foodname);
	return 112.25*quatity;
}
if("big spic paneer"==foodname){
	System.out.println("search of fodname is   " +foodname);
	return 184.55*quatity;
}
if("big spicy chicken"==foodname){
	System.out.println("search of foodname is" + foodname);
	return 184.99*quatity;
}
if("big spicy chicken" == foodname){
System.out.println("search food name is" + foodname);
return 304.50*quatity;
}
if("chicken mc" == foodname){
System.out.println("search food name is" + foodname);
return 171.00*quatity;
}
if("chiken 9pcs" == foodname){
System.out.println("search food name is" + foodname);
return 138.00*quatity;
}
if("filetofishburger" == foodname){
System.out.println("search food name is" + foodname);
return 138.33*quatity;
}
if("chicken mcnuggets 9pcs" == foodname){
System.out.println("search food name is" + foodname);
return 193.33*quatity;
}
if("chicken mcnuggets 20pcs" == foodname){
System.out.println("search food name is" + foodname);
return 304.00*quatity;
}
if("chicken mcnuggets 6pcs" == foodname){
System.out.println("search food name is" + foodname);
return 137.00*quatity;
}
if("chicken mcnuggets piri 9pcs" == foodname){
System.out.println("search food name is" + foodname);
return 255.00*quatity;
}
if("chicken mcnuggets piri 6pcs" == foodname){
System.out.println("search food name is" + foodname);
return 161.36*quatity;	
}
if("2mcaloo tikki" == foodname){
	System.out.println("search of food name is " + foodname);
	return 293.65*quatity;
}
if("2american cheese" == foodname){
System.out.println("search food name is"+ foodname);
return 688.00*quatity;
}
if("american supreme" == foodname){
System.out.println("search food name is"+ foodname);
return 913.00*quatity;
}
if("coke medum" == foodname){
System.out.println("search food name is"+ foodname);
return 89.00*quatity;
}
if("2strawberry" == foodname){
System.out.println("search food name is"+ foodname);
return 270.00*quatity;
}
return 0.00*quatity;
}
}