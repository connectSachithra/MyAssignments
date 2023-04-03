package week2.day1;

import java.util.Arrays;

public class FirstSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		System.out.println("The array in ascending order:");
		//index-[0]--->0 to 5
		Arrays.sort(data);
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		//Pick the 2nd element from the last and print it
		int length=data.length;
		System.out.println("Second Element:" +data[length-2]);
		}
	}


