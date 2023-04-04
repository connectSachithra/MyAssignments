package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] ch= test.toCharArray();
		for(int i=0;i<ch.length;i++) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
			System.out.println(ch);
		}
		
	}


