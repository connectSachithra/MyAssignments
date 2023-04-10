package week3day1;

public class Calculator {

	public int add (int a, int b) {
		return a+b;
	}
	public void add() {
		int a=15,b=15,c;
		System.out.println(c=a+b);
	}
		public void mul() {
			int a=8;
			double b=5;
			System.out.println(a*b);
		}
		public double mul(double a, double b) {
			return a*b;
		}
		public static void main(String[] args) {
			Calculator calc=new Calculator();
			System.out.println(calc.add(15, 15));
			calc.add();
			calc.mul();
			System.out.println(calc.mul(20, 20));

			
		}

	

}
