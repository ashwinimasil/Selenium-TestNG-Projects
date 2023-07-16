package week3;

public class FirstLetterToappearTwice {

	public static void main(String[] args) {
		String input = "abccbaacz";
		char[] convertedtext = input.toCharArray();
		for (int i=0;i<=convertedtext.length;i++) 
		{
			if (convertedtext[i]== convertedtext[i+1]) 
				{
					System.out.println(convertedtext[i]);
					break;
				}
			
		}
		
}
}