package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		List <Integer> data=new ArrayList<Integer>();
		data.add(3);
		data.add(2);
		data.add(11);
		data.add(4);
		data.add(6);
		data.add(7);
		int size =data.size();
		Collections.sort(data);	
		for (int i = 0; i < size; i++) {
			
		}
		System.out.println("Ascending order:"+data);
		System.out.println("The 2nd element from the last : "+data.get(size-2));
		}

	}


