package week2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=5;
		int factorial=1;
		int product=1;
		for (int i=1; i<=5; i++) {
				factorial = product * no ;
				product = factorial;
				no=no-1;
				
	}
		System.out.println(product);
		System.out.println(no);
	}
	
}
