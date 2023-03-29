package week1.day1;

public class Car {

	//To declare the multiple methods
	public void driveCar() {
		System.out.println("DriveCar");
	}
	
	public void applyBreak() {
		System.out.println("ApplyBreak");
	}
	
	public void soundHorn() {
		System.out.println("SoundHorn");
	}
	
	public void isPuncture() {
		System.out.println("IsPuncture");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//className objectName=new  classname();
		Car abc=new Car();
		
		//objectName.method();
		abc.driveCar();
		abc.applyBreak();
		abc.soundHorn();
		abc.isPuncture();
		
		
		
		
	}

}
