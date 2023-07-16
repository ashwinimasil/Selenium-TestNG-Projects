package week8;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateNumbersInNewSet {

	public Set<Integer> inputDuplicates() {
		int[] nums = { 4, 5, 5,2,2,1,8,8, 9, 10, 25 };
		Set<Integer> duplicate = new LinkedHashSet<>();
		Set<Integer> uniqueNos = new LinkedHashSet<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j =i+1 ;j<nums.length;j++) {
			if (nums[i]== nums[j]) {
				duplicate.add(nums[i]);
			} else {
				uniqueNos.add(nums[i]);
			}

		}
		
	}
		System.out.println("Duplicates" +duplicate);
		System.out.println("Unique nos in the list"+uniqueNos);
		return duplicate;
		
	}
	public static void main(String[] args) {
		DuplicateNumbersInNewSet dnc = new 	DuplicateNumbersInNewSet();	
		dnc.inputDuplicates();
				
}
}