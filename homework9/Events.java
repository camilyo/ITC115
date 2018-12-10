
public interface Events {
	
	//Each ticket has a unique identifier
	public int TicketNumber();
	
	//The price of the ticket will depend if it's walk up, advance 
	//or student advance
	public double getPrice();
	
}
