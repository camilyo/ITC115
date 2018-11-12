
public class SortingNumbers {

	public static void main(String[] args) {
		
	//Create list #1
	double [] list1 = {16.1, 12.3, 22.2, 14.4};
	//Create list #2
	double [] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
	
	//Defining a variable to call function isSorted using list #2
	boolean result1 = isSorted(list1);
	//Calling function
	System.out.println(result1);
	
	//Defining a variable to call function isSorted using list #2
	boolean result2 = isSorted(list2);
	//Calling function
	System.out.println(result2);
	
	}
	public static boolean isSorted(double [] list) {
		
		//Check the values inside the lists and if it's not sorted return false
		for(double i = 0.0; i < list.length - 1; i++) {
			if (list[(int)i] > list[(int)(i + 1)]) {	
				return false;
			}
				
		}//else, return true
		return true;
		
	}
}
	

