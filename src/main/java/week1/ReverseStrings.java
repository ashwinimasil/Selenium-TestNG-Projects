package week1;

public class ReverseStrings {
	public static void main(String[] args) {
		String name = "Ashwini";
		int len = name.length();
		char[] ch = name.toCharArray();
		for (int i=ch.length-1;i>=0; i--) 
		{
			
			System.out.println(ch[i]);
					
		}
	}
}
