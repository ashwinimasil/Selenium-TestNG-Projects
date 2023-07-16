package week1;

public class Mycalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc =  new Calculator();
		System.out.println(calc.add(1, 2, 5));
		System.out.println(calc.multiply(13, 14));
		calc.subtract(1, 3);
}
}