class TelecommTester{

public static void main(String sim[]){

Telecomm.addsim("airtel");
Telecomm.addsim("idea");
Telecomm.addsim("vi");
Telecomm.addsim("bsnl");
Telecomm.addsim("jio");
Telecomm.addsim("spice");
Telecomm.getsimcompany();

Telecomm.updatedSimName("airtel","new airtel");
Telecomm.getsimcompany();
Telecomm.deletesimcompany("bsnl");
Telecomm.getAllgetsimcompanyPostDeletion(5);
}


}