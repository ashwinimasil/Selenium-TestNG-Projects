package week1;

public class FirstLettertoappearTwice {

	public static void main(String[] args) {
		String input = "abccbaacz";
		char[] convertedtext = input.toCharArray();
		for (int i=0;i<=convertedtext.length;i++) 
		{
			for (int j = i+1; j < convertedtext.length; j++) 
			{
				if (convertedtext[i]!= convertedtext[j]) {
			System.out.println(convertedtext[i]);
			break;
		}
		
	}

}
}
}