package week3;

public class MyGadgets implements android{
	public void samsung() {
		 System.out.println("Samsung");
	}
	public void onePlus() {
		System.out.println("onePlus from MyGadgets");
	}

	@Override
	public void openApp() {
			// TODO Auto-generated method stub
		System.out.println(" openApp from MyGadgets");	
		}
	@Override
	public void playvideo() {
	// TODO Auto-generated method stub
		System.out.println("Playvideo from MyGadgets");
				}
	
	public static void main(String[] args) {
		MyGadgets myp = new MyGadgets();
		myp.openApp();
		myp.onePlus();
		myp.playvideo();
		
		
	}

}
