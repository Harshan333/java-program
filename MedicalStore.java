class  MedicalStore{

static String Medicinelist[]={null,null,null,null,null,null,};
static int index;
public static boolean getMedicines(String Medicine){
	boolean isMedicineAdedd=false;
	if(Medicine!=null){
		Medicinelist[index]=Medicine;
		index++;
		isMedicineAdedd=true;
	}else{
		System.out.println("cannot add null to list of medicines");
	}
	return isMedicineAdedd;
}

public static void getallMedicines(){
	
	for(int Medicine=0;Medicine<Medicinelist.length;Medicine++){
		String reference="";
		reference=Medicinelist[Medicine];
		System.out.println("accesing the "+ reference + " at "+ Medicine);	
	}
}
public static boolean updatedMedicineName(String oldMedicinelist,String newMedicinelist){
	
	boolean isUpdated=false;
	for(int Medicineindex=0;Medicineindex < Medicinelist.length;Medicineindex++){
		if(Medicinelist[Medicineindex].equals(oldMedicinelist)){
			Medicinelist[Medicineindex]=newMedicinelist;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deleteMedicinelist(String Medicinelist){
	System.out.println("invoking deleteCityname");
	System.out.println("no of parameters:2,type of parameter:String,String");
	boolean isDeleted=false;
	int medicineindex;
	
	int noOfElements=Medicinelist.length;
	
	for(medicineindex =0;medicineindex < Medicinelist.length;medicineindex++){
		if(Medicinelist[medicineindex].equals(Medicinelist)){
			break;
		}
	}
	if(medicineindex<noOfElements){
		noOfElements=noOfElements-1;
		for(int newmedicineindex=medicineindex;newmedicineindex<noOfElements;newmedicineindex++){
			Medicinelist[newmedicineindex]=Medicinelist[newmedicineindex+1];
			
		}
 	}
	System.out.println(Medicinelist[medicineindex]);
	return noOfElements;
}
public static void getAllgetMedicinelistPostDeletion(int newLength){
for(int medicineindex=0;medicineindex<newLength;medicineindex++){
	System.out.println(Medicinelist[medicineindex]);
}
}
}