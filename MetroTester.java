class MetroTester{

public static void main(String  metro[]){

Metro.addStation("Nagasandra");
Metro.addStation("dasarahalli");
Metro.addStation("jalahalli");
Metro.addStation("peenya industry");
Metro.addStation("peenya");
Metro.addStation("mejastic");
Metro.getallstation();

Metro.updatedStationName("peenya","new peenya");
Metro.getallstation();
Metro.deleteMetrostation("dasarahalli");
Metro.getAllgetlistOfMetrostationPostDeletion(5);
}

}