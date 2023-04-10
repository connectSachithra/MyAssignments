package week3day1;

public class Smartphone extends Androidphone {

	
	public void connectwhatsapp() {
		System.out.println("Connected Whatsapp");
	}
	
	public static void main(String[] args) {
		
		Smartphone c=new Smartphone();
		c.makecall();
		c.savecontact();
		c.sendMsg();
		c.connectwhatsapp();
		c.takevideo();
		
	}

}
