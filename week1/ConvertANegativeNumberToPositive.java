package week1.day2;

public class ConvertANegativeNumberToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number =-40;
if(number>0) {
	System.out.println("The Positive Number:"+number);
}
else if (number<0) {
	System.out.println("The Negative number:"+number);
	number =-(number);
	System.out.println("The converted Positive number:"+number);
	
}
else {
	System.out.println("Check the Numberr:"+number);
}
		
	}

}
