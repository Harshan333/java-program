class supermarket{

static String vegetables[]={"onion","tomato","bitroot","beans","carrot","ginger","potato","cauliflower","ladies finger"};

static String perfumes[]={"denver","wattagirl","indian","beardo","ks","fogg","axe","spring"};

static String biscuits[]={"goodday","unibick","parle-g","hide and sick","chaskamakska","50-50","horlicks","oreo"};

public static void main (String market[]){

System.out.println("main started");
System.out.println("list of perfumes");
//invoking methods
getperfumes();
System.out.println("list of vegetables");
getvegetables();
System.out.println("list of biscuits");
getbiscuits();
System.out.println("main ended");
}
//using methods
public static void getperfumes(){
System.out.println("inside perfumes");
for(String perfume : perfumes){
System.out.println(perfume);
}
}
public static void getvegetables(){
	System.out.println("inside vegetables");
	for(String vegetable : vegetables){
		System.out.println(vegetable);
	}
	
}
public static void getbiscuits(){
	System.out.println("inside biscuits");
	for(String biscuit : biscuits){
		System.out.println(biscuit);
}
}
}
