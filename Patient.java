class Patient{

private String patientName;                               //5 rules     
private int age;                                          //1.public class
private String bloodGroup;                                 //2.default constructor
private String gender;                  //3.private variables/data members/states/fields
private String addres;                                 //4.public getter and setter
private long contactNo;
private String wardNo;
private String attenderName;
private String diseaseName;
private String consultant;
private String hospitalName;
private int fees;


public void setPatientName(String patientName){
	this.patientName=patientName;
}

public String getPatientName(){
	return patientName;
}
public void setAge(int age){
	this.age=age;
}
public int getAge(){
	return age;
}
public void setBloodGroup(String bloodGroup){
	this.bloodGroup=bloodGroup;
}
public String getBloodGroup(){
	return bloodGroup;
}
public void setGender(String gender){
	this.gender=gender;
}
public String getGender(){
	return gender;
}
public void setAddress(String addres){
	this.addres=addres;
}
public String getAddress(){
	return addres;
}
public void setContactNo(long contactNo){
	this.contactNo=contactNo;
}
public long getContactNo(){
	return contactNo;
	
}
public void setWardNo(String wardNo){
	this.wardNo=wardNo;
}
public String getWardNo(){
	return wardNo;
}
public void setAttenderName(String attenderName){
	this.attenderName=attenderName;
}
public String getAttenderName(){
	return attenderName;
}
public void setDiseaseName(String diseaseName){
	this.diseaseName=diseaseName;
}
public String getDiseaseName(){
	return diseaseName;
}
public void setConsultant(String consultant){
	this.consultant=consultant;
}
public String getConsultant(){
	return consultant;
}
public void setHospitalName(String hospitalName){
	this.hospitalName=hospitalName;
}
public String getHospitalName(){
	return hospitalName;
}
public void setFees(int fees){
	this.fees=fees;
}
public int getFees(){
	return fees;
}
}

