package week3.day2;

public class Automation extends MultipleLangauge{

	@Override
	public void ruby() {
		System.out.println("Unimplemented ruby");
	}

	public void Java() {
		System.out.println("Unimplemented java");
		
	}

	public void Selenium() {
		System.out.println("Unimplemented selenium");
		
	}
public static void main(String[] args) {
	Automation a=new Automation();
	a.Java();
	a.Selenium();
	a.ruby();
	a.python();
}
}

