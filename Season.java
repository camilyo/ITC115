import java.util.Scanner;
public class Season {
	

//Indicating the season of an specific day and month of the year

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
//Collect the number that represents the month
		System.out.print("Enter a month (from 1 to 12): ");
		int month = console.nextInt();
//Collect the day of the month
		System.out.print("Enter the day (from 1 to 31): ");
		int day = console.nextInt();	
//Calling my Season1 and assigning it a variable
		String s = Season1(month, day);
		System.out.println();
//Printing the return value of my function
		System.out.print(s);
		
}	
	public static String Season1(int month, int day) {

		if ((month == 12) && (day >= 16 && day <= 31)) {
				return "Winter";
		} else if ((month == 1 || month == 2) && (day >= 1 && day <= 31)) {
				return "Winter"; 
		}else if ((month == 3 ) && ( day > 1 && day <= 15) ){
				return "Winter";
		}else if ((month == 3) && (day > 15 && day <= 31)) {
				return "Spring";
		}else if ((month == 4 || month == 5) && (day >= 1 && day <= 31)) {
				return "Spring";
		}else if ((month == 6) && (day >=1 && day <=15)) {
				return "Spring";
		}else if ((month == 6) && (day > 15 && day <= 31)) {
				return "Summer";
		}else if ((month == 7 || month == 8) && (day >=1 && day <=31)) {
				return "Summer";
		}else if((month == 9) && (day >= 1 && day <= 15)) {
				return "Summer";
		}else if ((month == 9) && (day >=16 && day<= 31)) {
				return "Fall";
		}else if ((month == 10 || month == 11) && (day >= 1 && day <= 31)) {
				return "Fall";
		}else if ((month == 12) && (day >= 1 && day <= 15)) {
				return "Fall";
		}else{
			return "Sorry, try again";	
		}
					
}
}

