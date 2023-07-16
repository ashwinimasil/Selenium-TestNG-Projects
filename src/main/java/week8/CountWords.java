package week8;

import java.util.LinkedHashSet;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {
		/*pseudo code
		 * input in string
		 * cut each word by space and count 1
		 * doubt
		 */
		int count =0;
		String input ="I have a beautiful face";
	
			String[] cutInput = input.split(" ");
			Set<String> stringSet = new LinkedHashSet<>();
			for (String each : cutInput) {
				stringSet.add(each);
					count++;
		}
			System.out.println(stringSet);
			System.out.println(count);
	}

}
