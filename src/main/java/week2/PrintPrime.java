package week2;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no = 25;
boolean isPrime = true;
for (int i=2;i<no;i++) {
	if (no%i==0) {
		isPrime=false;
		}
	}
if (isPrime) {
System.out.println("The given no is prime" +no);
}
else{
System.out.println("Not a prime"+no);
}
	}
}