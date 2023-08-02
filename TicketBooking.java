class TicketBooking{

private int ticketBookingId;
private int noOfSeats;
private String source;
private String destination;
private String date;
private String timings;
private String className;
private String transportname;

public void setTicketBookingId(int ticketBookingId){
	this.ticketBookingId=ticketBookingId;
}
public int getTicketBookingId(){
return ticketBookingId;
}

public void setNoOfSeats(int noOfSeats){
	this.noOfSeats=noOfSeats;
	
}
public int getNoOfSeats(){
	return noOfSeats;
	
}
public void setSource(String source){
	this.source= source;
}
public String getSource(){
	return source;
}
public void setDestination(String destination){
	this.destination=destination;
}
public String getDestination(){
	return destination;
	
}
public void setDate(String date){
	this.date=date;
}
public String getDate(){
	return date;
}
public void setTimings(String timings){
	this.timings=timings;
}
public String getTimings(){
	return timings;
}
public void setClassName(String className){
	this.className=className;
}
public String getClassName(){
	return className;
}
public void setTransportname(String transportname){
	this.transportname=transportname;
}
public String getTransportname(){
	return transportname;
}
 
 
}



