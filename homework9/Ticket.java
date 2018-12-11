
public abstract class Ticket {
	
	
	
	//return the TicketNumber of each ticket
	public abstract int TicketNumber();
	//return the price value 
	public abstract double getPrice();
	

	public String toString() {
		return "Number: " + TicketNumber() + ", " + "Price: " + getPrice();
	}
	
	
	
}
