package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		
		Set<Integer> num1=new LinkedHashSet<Integer>();
		for(Integer i:num) {
			num1.add(i);
			}
		System.out.println(num1);
		}

}
