class CustomerTester{

public static void main(String[] details){

 Customer customer=new Customer();
customer.setCustomerId(33);
customer.setFirstName("harsha");
customer.setMiddleName("gowda");
customer.setLastName("K H");
customer.setPhoneNo(9945561406L);
customer.setEmail("hgowdakh87@gmail");
customer.setDob("28/05/2001");
customer.setAddress("kunigal");
System.out.println(customer.getCustomerId()+"  "+
customer.getFirstName()
+" "+customer.getMiddleName()+" "+
customer.getLastName()+" "+
customer.getEmail()+" "+
customer.getPhoneNo()+" "+
customer.getDob()+" "+
customer.getAddress());


}


}