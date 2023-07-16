class IceCreamTester{

public static void main(String flavors[]){

IceCream.addflavors("vanilla");
IceCream.addflavors("chocholate");
IceCream.addflavors("strawberry");
IceCream.addflavors("pista");
IceCream.addflavors("mango");
IceCream.addflavors("orange");
IceCream.getallflavors();

IceCream.updatedIceName("pista","new pista");
IceCream.getallflavors();
IceCream.deleteflavors("mango");

IceCream.getAllgetlistOfflavorsPostDeletion(5);

}

}