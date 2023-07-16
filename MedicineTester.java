class  MedicineTester{

public static void main(String Medicine[]){

MedicalStore.getMedicines("acetaminophen");
MedicalStore.getMedicines("adderall");
MedicalStore.getMedicines("amitriptyline");
MedicalStore.getMedicines("ativa");
MedicalStore.getMedicines("atorvataciasn");
MedicalStore.getMedicines("amoxicillin");
MedicalStore.getallMedicines();

MedicalStore.updatedMedicineName("ativa","ativa 500");
MedicalStore.getallMedicines();
MedicalStore.deleteMedicinelist("adderall");
MedicalStore.getAllgetMedicinelistPostDeletion(5);
}

}