package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare your input as 5
		// Declare an integer variable fact as 1
		int i,fact=1;
		int number=5;
		// Iterate from 1 to your input (tip: using loop concept)
		for(i=1;i<=number;i++) {
		
// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
	fact=fact*i;
		}
	System.out.println("factorial of "+number+"is:"+fact);
		
		}
		

	}

