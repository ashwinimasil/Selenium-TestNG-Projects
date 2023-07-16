package week3;

public class Calculator {
public int add(int a,  int b) {
System.out.println(a+b);
return(a+b);
}

public	int add(int num1, int num2, int num3) {
	int sum=num1+num2+num3;
	System.out.println(sum);
	return sum;
	
}
public double multiply(double a, double b) {
	System.out.println(a+b);
	return a+b;
}
public float multiply(float a, float b) {
	System.out.println(a*b);
	return a*b;
}

public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(3,6);
	cal.add(35,45,68);
	cal.multiply(3,8);
	cal.multiply(46,89);
	
}
}