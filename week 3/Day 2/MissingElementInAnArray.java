package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {
	
	


public static void main(String[] args) {
		
		List <Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(7);
		arr.add(6);
		arr.add(8);
		int size =arr.size();
		Collections.sort(arr);
		System.out.println("sorting number:"+arr);
         int ar[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			ar[i]=arr.get(i);
		}
		for(int i=0;i<size;i++)
		{
			int j = i + 1;
			if (ar[i] != j) {
				System.out.println("Missing element is: " + j);
				break;
		}
}

}
}




	


	



