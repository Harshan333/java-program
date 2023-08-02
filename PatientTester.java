class PatientTester{
	public static void main (String[] args){
	Patient	patient=new Patient();
	patient.setAddress("rajajinagar");
	patient.setAge(34);
	patient.setAttenderName("girish");
	patient.setBloodGroup("b+");
	patient.setConsultant("dr agarwals");
	patient.setContactNo(984425897L);
	patient.setDiseaseName("corona");
	patient.setFees(2500000);
	patient.setGender("male");
	patient.setHospitalName("narayana");
	patient.setPatientName("manoj");
	patient.setWardNo("A54");
	
	System.out.println(patient.getAddress()+"  "+patient.getAge()+"  "+patient.getAttenderName()+"  "+patient.getBloodGroup()+"  "+patient.getConsultant()+"  "+patient.getContactNo()+"  "+patient.getDiseaseName()+"  "+patient.getFees()+"  "+patient.getGender()+"  "+patient.getHospitalName()+"  "+patient.getPatientName()+"  "+patient.getWardNo() );
	}
}