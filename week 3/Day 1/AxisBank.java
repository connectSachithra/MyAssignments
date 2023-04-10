package week3day1;

public class AxisBank extends BankInfo {


	public void deposit(){
		System.out.println(" Interest Rate for deposit is: 7%");

	}

	public static void main(String[] args) {
		AxisBank d=new AxisBank();
				d.deposit();
				d.saving();
				d.fixed();
	}
}
