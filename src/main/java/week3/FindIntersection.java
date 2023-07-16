package week3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindIntersection 
{
  public static void main(String[] args) 
	{
	  int[] a={3,2,11,4,6,7};
	  		// 0 1 2  3 4 5
	  int[] b={1,2,8,4,9,7};
	  		// 0 1 2  3 4 5
	List<Integer> List1 = new ArrayList<Integer>();
	List<Integer> List2 = new ArrayList<Integer>();
	/*for (Integer Array1 : a) 
	{
		List1.add(Array1);
		System.out.println(List1);
	}
	for (Integer Array2 : b) 
	{
		List2.add(Array2);
		System.out.println(List2);
	} */
	List<Integer> intersectionArray = new ArrayList<Integer>();
	for (int x = 0; x <=a.length; x++) 
	{
		for (int y=x+1; y<=b.length ;y++) 
		{
			if(a[x]!=b[y]) {
			intersectionArray.add(b[y]);
			System.out.println(b.length+1);
			
		}
		else
			continue;
		}	
		
	}				
}
}
