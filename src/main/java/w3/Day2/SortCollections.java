package w3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Google","Microsoft","TestLeaf","Maverick"};
		int len= names.length;
		
		//Set <String> myset = new LinkedHashSet<String>();
		List <String> mylist = new ArrayList<String>();
		for (String var : names) 
		{
			mylist.add(var);
		}
		Collections.sort(mylist);
		//Collections.reverse(mylist);
		System.out.println(mylist);
		List <String > ReverseArray = new ArrayList<String>();	
		
	for (int i=mylist.size()-1;i>=0; i--) 
	{
		
		String Reverse = mylist.get(i);
		ReverseArray.add(Reverse);
	}
	System.out.print(ReverseArray);
	}
	//System.out.println(mylist);
}
