package week2.day1;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		int length= arr.length;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		int j=i+1;
		if(arr[i]!=j) {
			System.out.println("Missing Element is:"+j);
			break;
		}
		}
		
		}
		
	}
	
	


