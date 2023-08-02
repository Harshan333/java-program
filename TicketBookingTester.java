class TicketBookingTester{

public static void main(String[] details){

 TicketBooking ticketBooking=new TicketBooking();
ticketBooking.setTicketBookingId(54);
ticketBooking.setNoOfSeats(900);
ticketBooking.setSource("bangalore");
ticketBooking.setDestination("mangalore");
ticketBooking.setTimings("12-30");
ticketBooking.setDate("25/09/2023");
ticketBooking.setClassName("First class");
ticketBooking.setTransportname("mangalore express");
System.out.println(ticketBooking.getTicketBookingId()+"  "+
ticketBooking.getNoOfSeats()
+" "+ticketBooking.getSource()+" "+
ticketBooking.getDestination()+" "+
ticketBooking.getDate()+" "+
ticketBooking.getTimings()+" "+
ticketBooking.getClassName()+" "+
ticketBooking.getTransportname());


}


}