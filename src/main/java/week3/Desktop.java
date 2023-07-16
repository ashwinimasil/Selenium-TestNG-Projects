package week3;

public class Desktop extends Computer{
	public void desktopSize(){
	System.out.println("My Desktop size is 14 inches");
	}
	
	public static void main(String[] args) {
		Desktop dkp = new Desktop();
		dkp.desktopSize();
		dkp.computerModel();
}
}