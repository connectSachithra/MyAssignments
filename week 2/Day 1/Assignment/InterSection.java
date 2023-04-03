package week2.day1;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[]={3,2,11,4,6,7};
		int data1[]={1,2,8,4,9,7};
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data1.length;j++) {
				if(data[i]==data1[j]) {
					System.out.println("The matching arrays are :"+data[i]);
				
				}
			}
			
		}
		
		
		
	}

}
