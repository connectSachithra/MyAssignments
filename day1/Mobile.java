package week1.day1;

public class Mobile {

	//type methodname-ctrl + space
	public void sendSms() {
		System.out.println("From Oppo");
	}
	
	public void makeCall() {
		System.out.println("Calling My Friend");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//classname objectname= new classname();
		Mobile abc=new Mobile();
		
		//objectname.method();
		abc.sendSms();
		abc.makeCall();
		
		
	}

}
