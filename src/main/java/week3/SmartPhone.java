package week3;

public class SmartPhone extends AndroidPhone {
	
	public void takevideo() {
		System.out.println("smartphone-- smartPhone");
	}
	public static void main(String[] args) {
		AndroidPhone aph = new AndroidPhone();
		aph.takevideo();
		
		SmartPhone smp = new SmartPhone();
		smp.takevideo();
	}
}
