package week8;

public class SampleProject{
	public static void main(String[] args) {
		int[] num = { 12, 4, 3, 6, 7, 8, 5, 28 };
		int largest = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					largest = num[i];
				}
				else 
				{
				largest = num[j];			
			}
		}

	} 

}
}