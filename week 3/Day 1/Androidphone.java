package week3day1;

public class Androidphone extends Mobile {

	public void takevideo() {
		System.out.println("Video Taken");

	}
	
	public static void main(String[] args) {
		
	
	Androidphone a=new Androidphone();
	a.sendMsg();
	a.makecall();
	a.savecontact();
	a.takevideo();
}
}