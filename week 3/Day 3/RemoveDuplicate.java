package week3.day3;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		String companyName = "google" ;
		char[] charArray = companyName.toCharArray();
		Set<Character>name=new LinkedHashSet<Character>();
		for (Character c : charArray) {
			name.add(c);
		}
		System.out.println("Unique Character is:"+name);
	}

}
