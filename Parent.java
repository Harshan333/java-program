class Parent{
public void business(){
System.out.println("phrmacetical");
}
public Parent(){
	System.out.println("parent contructor is invoked");
}
public Parent(int i){
	this();
	System.out.println("single parameter in parent invoked");
}
}