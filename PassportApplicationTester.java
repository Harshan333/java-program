class PassportApplication{

public static void main(String[] args){

 PassportApplication passportApplication=new PassportApplication();
 
passportApplication.setPassportApplicationId(54);
passportApplication.setFirstName("HARSHAN");
passportApplication.setMiddleName("VARDHAN ");
passportApplication.setLastName("GOWDA");
passportApplication.setPhoneNo(334562178L );
passportApplication.setEmail("hgowdakh5667@gmail.com");
passportApplication.setDob("25/80/2001");
passportApplication.setAddress("tumkur");
System.out.println(passportApplication.getPassportApplicationId()+"  "+
passportApplication.getFirstName()
+" "+passportApplication.getMiddleName()+" "+
passportApplication.getLastName()+" "+
passportApplication.getEmail()+" "+
passportApplication.getPhoneNo()+" "+
passportApplication.getDob()+" "+
passportApplication.getAddress());


}


}