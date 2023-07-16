package week1;

public class DuplicateNumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums = {2,4,7,7,5,5,2,5};
//System.out.println(nums.length);
	for (int i=0; i< nums.length; i++) {
		
		for (int j=i+1; j<nums.length; j++) {
			
			if (nums[i]==nums[j]) {
			System.out.println(nums[i]);
				}
			}
		}
	}
}

