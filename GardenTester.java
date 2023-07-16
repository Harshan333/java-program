class GardenTester{

public static void main(String flower[]){

Garden.getflowers("ROse");
Garden.getflowers("mari gold");
Garden.getflowers("jasmine");
Garden.getflowers("snap dragon");
Garden.getflowers("cosmos");
Garden.getflowers("geranium");
Garden.getallFlowers();
Garden.updatedFlowerName("cosmos","new cosmos");
Garden.getallFlowers();
Garden.deleteflowerslist("jasmine");
Garden.getAllgetflowerslistPostDeletion(5);
}


}