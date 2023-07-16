package w3.Day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ashwini";
		//char[] character = name.toCharArray();
		char[] obj = name.toCharArray();
		Set <Character> UniqueLetters= new LinkedHashSet<Character>();
		for (int i = 0; i < obj.length; i++) {
			UniqueLetters.add(obj[i]); 
		}
		
		System.out.println(UniqueLetters);
	}
}