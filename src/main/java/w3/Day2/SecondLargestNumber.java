package w3.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class SecondLargestNumber 
{
		public static void main(String[] args) 
		{
			int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set <Integer> myset = new TreeSet<Integer>();
		for (int i=0;i<data.length;i++) 
		{
			myset.add(data[i]);
			myset.toString();
		}
		List<Integer> list =  new ArrayList<Integer>();
		list.addAll(myset);
		list.size();
		System.out.println("Print a set"+myset);
		Collections.sort(list);
		System.out.println(list);
		SecondLargestNumber sln = new SecondLargestNumber();
		int output[]= {3, 4, 7, 11,6,2};
		Arrays.sort(output);
		//System.out.println("sorted output"+output.toString());
		System.out.println("Second Largest Number in the array" +"\t" +output[output.length-2]);
		sln.largest(output);
		Set<Integer> outputarray =  new TreeSet<Integer>();
		for (int x=0; x<output.length;x++) 
		{
			
			outputarray.add(output[x]);
		}
		System.out.println("output array" +outputarray.toString());
		}
		public int largest(int list[]) {
		//List <Integer> secd = new ArrayList<Integer>();
		int max=list[0];
		for (int x=1;x<list.length;x++) 
		{
			if (max<list[x]) 
					{
						max = list[x];
					}
		}
			System.out.println("Largest no in the array"+ "\t" + max);
			//secd.toArray(max);
			
			return max;
		}
	}
