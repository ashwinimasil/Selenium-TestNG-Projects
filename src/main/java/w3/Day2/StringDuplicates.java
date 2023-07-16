package w3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringDuplicates{
	public static void main(String[] args) {
		String name ="google";
		
		char[] character = name.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		
		 for (int i=0;i<name.length();i++) {
			 
		unique.add(character[i]);		
}
		 System.out.println(unique);
}
}