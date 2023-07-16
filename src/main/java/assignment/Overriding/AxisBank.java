package assignment.Overriding;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposits is from 9 to 5PM");
}
	public static void main(String[] args) {
		
	BankInfo bi = new BankInfo();
	bi.deposit();
	bi.fixed();
	bi.savings();
	
	AxisBank axis = new AxisBank();
	axis.deposit();
	axis.fixed();
	axis.savings();
	
	}
	
}