class Bank{

private int bankId;
static String bankname;
private String branch;
private String branchCode;
private String address;
private int helpLineno;
private String branchManager;
private String ifsc;
private String misc;
static int noOfLockers;
static int noOfEmployees;
private int timings;
private String websiteDetailes;


public void setBankID(int bankId){
	this.bankId=bankId;
}
public int getBnakId(){
	return bankId;
}
public void setBankName(String bankname){
	this.bankname=bankname;
}
public String getBankName(){
	return bankname;
}
public void setBranchCode(String branchCode){
	this.branchCode=branchCode;
}
 public String getBranchCode(){
	 return branchCode;
 }
public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
	return address;
}
public void setHelpLineNo(int helpLineno){
	this.helpLineno=helpLineno;
}
public int getHelpLineNo(){
	return helpLineno;
}
public void setBranchManager(String branchManager){
	this.branchManager=branchManager;
}
public String getBranchMager(){
	return branchManager;
}
public void setIfsc(String ifsc){
	this.ifsc=ifsc;
}
public String getIfcs(){
	return ifsc;
}
public void setMisc(String misc){
	this.misc=misc;
}
public String getMisc(){
	return misc;
}
public void setWebsite(String websiteDetailes){
	this.websiteDetailes=websiteDetailes;
}
public String getWebsite(){
	return websiteDetailes;
}

}
	


