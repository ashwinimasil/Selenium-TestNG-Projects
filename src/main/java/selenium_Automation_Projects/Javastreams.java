package selenium_Automation_Projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;
public class Javastreams{

public static void main(String[] args){
		{
		// TODO Auto-generSTRINGethod stub
		int count =0;
		ArrayList <String> name =new ArrayList<String>();
		name.add("Roja");
		name.add("Reyan");
		name.add("Reena");
		name.add("Giri");
		name.add("syan");
		for(int i=0;i<name.size();i++) {
			String actual = name.get(i);
			if(actual.startsWith("R")) {
				count++;
			}
			System.out.println(count);
			
		}
		List<String> name1 = Arrays.asList("Roja","Reyan","Reena","Giri");
		
		
	}
}
}
