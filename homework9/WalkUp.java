
public class WalkUp extends Ticket {
	
	//override Ticket number for walk up ticket
	@Override
	public int TicketNumber() {
		return 17;
	}
	
	//return the value of walk up ticket
	@Override
	public double getPrice() {
		return 50;
	}
	
//	public String toString() {
//		return "Number: " + TicketNumber() + ", " + "Price: " + getPrice();
//	}
//	

}
