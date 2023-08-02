class Child extends Parent{

public void contentCreator(){
System.out.println("the creater");
}
public Child(){
	super(123);
	System.out.println("child constructor is invoked");
}
}
