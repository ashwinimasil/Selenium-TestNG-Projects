package week8;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrimeNumbersinNewSet {
	public static void main(String[] args) {
		int[] nums = {4, 6, 7, 8, 9, 10 };
		boolean isPrime = true;
		Set<Integer> uniquePrime = new LinkedHashSet<>();
		Set<Integer> notPrime = new LinkedHashSet<>();

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] % i == 0) {
				isPrime = false;
				break;
			}
			if (isPrime = false) {
				notPrime.add(nums[i]);
			} else {
				uniquePrime.add(nums[i]);
			}
		}
		 System.out.println("Numbers are prime"+uniquePrime);
		 System.out.println("Numbers are not prime"+notPrime);
	}
}