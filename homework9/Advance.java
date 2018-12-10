
public class Advance extends Ticket {
	
//	defining event date 
	public int eventDate = 12;
//	defining date the ticket is being sold
	public int sellingDate = 1;
	
	
	//override ticket number for Advance ticket
	@Override
	public int TicketNumber() {
		return 18;
	}

	//set the event date
	public void setEventDate(int eventDate) {
		this.eventDate = eventDate;
	}

	//set the selling date
	public void setSellingDate(int sellingDate) {
		this.sellingDate = sellingDate;
	}

	//if the tickets are purchase 10 days or more before the event return 30, 
	//otherwise return 40
	@Override
	public double getPrice() {
		if (sellingDate <= (eventDate - 10)) {
			return 30;
		}else {//tickets purchase fewer than 10 days
			return 40;
		}
	}

}
