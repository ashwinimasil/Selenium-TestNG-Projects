package week2;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {
		String input = "apple";
		char[] inputchararray = input.toCharArray();
		Map<Character, Integer> maps = new LinkedHashMap<>();
		//Method
		/*
		 * for (int i = 0; i < inputchararray.length; i++) { 
		 * if(maps.containsKey(inputchararray[i])) 
		 * { 
		 * Integer val = maps.get(inputchararray[i]);
		 *  val+=1; 
		 *  maps.put(inputchararray[i], val) ;
		 *  }
		 * else 
		 * maps.put(inputchararray[i],1);
		 *  } 
		 * System.out.println(maps);
		 */
		for (int i = 0; i < inputchararray.length; i++) {
			
			maps.put(inputchararray[i], maps.getOrDefault(inputchararray[i], 0)+1);//i=0 a=1
																				//i=1 p=1
			}
		System.out.println(maps);
}
}
