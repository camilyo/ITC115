
public class StudentAdvance extends Advance {
	
	//override ticket number for Student Advance ticket
	@Override
	public int TicketNumber() {
		return 19;
	}
	
	//If the Student Advance ticket was purchase within 10 or more days before the event
	//return half of the price of the Advance ticket
	//otherwise, return the value of the ticket  purchase with less than 10 days of the event
	//divided by 2
	@Override
	
	public double getPrice() {
		return super.getPrice() / 2;
	}
	
//	public double getPrice() {
//		if (sellingDate <= (eventDate - 10)) {
//		return super.getPrice() / 2;
//		}else {//tickets purchase fewer than 10 days
//			return super.getPrice() / 2;
//		}
	//}
}
