package week3;

public class Automation extends MultipleLanguage {
	
	@Override
	public void Selenium() {
		System.out.println("Selenium implementation");
	}
	@Override
	public void ruby() {
		System.out.println("Ruby implementation ");
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.python();
		auto.Selenium();
		auto.ruby();
		auto.Java();
		}
	@Override
	public void Java() {
		System.out.println("Java unimplemented one");
		
	}
}