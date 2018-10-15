
public class Math {

	public static void main(String[] args) {
		printPowersOfN(2,7);   
		printPowersOfN(5,3);
		printPowersOfN(-2,10);
		

	}
	
	public static void printPowersOfN(int base, int count) {
		
		int firstnumber = 1;
		System.out.print(firstnumber + " ");
		for(int i = 1; i <= count; i++) {
			firstnumber *=base;
			System.out.print(firstnumber + " ");
		}
		
		System.out.println();
	}
	
	
	}


