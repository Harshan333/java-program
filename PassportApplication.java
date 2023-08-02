class PassportApplication{

private int passportApplicationId;
private String firstName;
private String middleName;
private String lastName;
private String email;
private long phoneNo;
private String dob;
private String address;

public void setPassportApplicationId(int passportApplicationId){
	this.passportApplicationId=passportApplicationId;
}
public int getPassportApplicationId(){
return passportApplicationId;
}

public void setFirstName(String firstName){
	this.firstName=firstName;
	
}
public String getFirstName(){
	return firstName;
	
}
public void setMiddleName(String middleName){
	this.middleName= middleName;
}
public String getMiddleName(){
	return middleName;
}
public void setLastName(String lastName){
	this.lastName=lastName;
}
public String getLastName(){
	return lastName;
	
}
public void setEmail(String email){
	this.email=email;
}
public String getEmail(){
	return email;
}
public void setPhoneNo(long phoneNo){
	this.phoneNo=phoneNo;
}
public long getPhoneNo(){
	return phoneNo;
}
public void setDob(String dob){
	this.dob=dob;
}
public String getDob(){
	return dob;
}
public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
	return address;
}
 
 
}



