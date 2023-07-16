package week2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no = { 2, 4, 6, 7, 8, 9, 10 };
		boolean isprime = true;
		Set<Integer> uniquePrime = new LinkedHashSet<>();
		Set<Integer> notPrime = new LinkedHashSet<>();
try {
	for (int i = 1; i <no.length; i++) 
	{
		if (no[i] % i == 0) 
		{
			isprime = false;
		}
			if (isprime == true) 
				{
					uniquePrime.add(no[i]);
				}
				else 
				{
					notPrime.add(no[i]);
				}
	}	
	System.out.println("Is a prime" + "\t " + uniquePrime);	
	System.out.println("Is not a prime" + "\t" + notPrime);

}
catch (ArithmeticException e ) 
{
	System.out.println(e);
	}
}
}