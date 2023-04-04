package week2.day1;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "We learn java basics as part of java sessions in java week1";	
		String temp=" ";
		int count=0;
		
		String[] split = text.split(" ");
		
		for(int i=0;i<split.length;i++) {
			
			//Inner loop
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					temp=split[i];
					count++;
					
					//System.out.println("Duplicate text are identified:"+split[i]);
					System.out.println("Duplicate text are identified:"+text.split(""));
				}
			}
			
		}
	}

}
