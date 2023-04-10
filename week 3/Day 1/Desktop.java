package week3day1;

public class Desktop extends Computer{

	protected void desktopSize(){
		System.out.println("Desktop size is: 17");

	}
	public static void main(String[] args) {
		
		
		Desktop a=new Desktop();
		a.computermodel();
		a.desktopSize();
}
}
