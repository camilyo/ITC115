
public class TicketMain {

	public static void main(String[] args) {
				
		Ticket[] tickets = new Ticket[3];
		tickets[0] = new WalkUp();
		tickets[1] = new Advance();
		tickets[2] = new StudentAdvance();
		
		//((Ticket) tickets[1]).setEventDate(23);
		//((Ticket) tickets[1]).setSellingDate(10);
				
		for (int i = 0; i < tickets.length; i++) {
		//System.out.println(tickets[i].TicketNumber());
		//System.out.println(tickets[i].getPrice());
		System.out.println(tickets[i].toString());
					
		System.out.println();

		}
	}

}
