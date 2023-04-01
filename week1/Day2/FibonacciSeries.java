package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range=8,num1=0,num2=1;
// Print first number
		
     System.out.println("FibonacciSeries "+ range + " num: ");
		//Iterate from 1 to the range
     
      for (int i = 1; i <= 8 ; i++) {
			System.out.println(num1 +", ");
      
		//add first and second number assign to sum
      int sum=num1+num2;
   // Assign second number to the first number
      num1=num2;
  	// Assign sum to the second number
      num2=sum;
      
      }

		
	}
		
		
		
	}


