package week2.day1;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		int length=arr.length;
		System.out.println("The length of the array:"+length);
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("The Matching value is : " +  arr[i]);
			}
			
	}
	}
	}
}
