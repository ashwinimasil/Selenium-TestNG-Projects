package w3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class MissingNumber {
		public static void main(String[] args) {
		int [] nums = {1,2,3,4,6,7,8,9,10};
		List<Integer> arraylist = new ArrayList<Integer>();
		for (Integer mylist : nums) 
		{
			arraylist.add(mylist);
					
		}
		for (int k=0;k<=arraylist.size()-1;k++)
		{
		if (arraylist.get(k)+1 !=arraylist.get(k+1)) 
		{
			System.out.println(arraylist.get(k)+1);
			break;	
		}
		}
	}
}