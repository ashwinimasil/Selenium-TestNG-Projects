package w3.Day2;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
	String[] split =	text.split(" ");
	
		Set<String> duptext = new LinkedHashSet<String>();
		
		for (String abc : split) 
		 { 
			 duptext.add(abc); 
		  }
		  System.out.println(duptext);
		 }
	
}
// comma is allowed if  we use use split