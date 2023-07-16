package week1;

public class StringDuplicates{
	public static void main(String[] args) {
		String name ="google";
		
		char[] character = name.toCharArray();
		//Set<Character> unique = new LinkedHashSet<Character>();
		
		 for (int i=0;i<name.length();i++) 
		 {
			for (int j=i+1;j<name.length();j++) 
			{
				if (name.charAt(i)==name.charAt(j)) 
					{
					System.out.println(name.charAt(i));
						break;
			 
		//unique.add(character[i]);		
}
			 
		//System.out.println(unique);
}
}
}
}
/*
if (name.charAt(i)==name.charAt(i+1)) 
{
	System.out.println(name.charAt(i));
*/