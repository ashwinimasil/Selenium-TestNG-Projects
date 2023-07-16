package ashwini_JavaProjects;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Happy Halloween guys";
		String s1 = new String("Happy Diwali people");
		String[] Splitted_string = s1.split("Diwali");
		System.out.println(Splitted_string[0]);
		System.out.println(Splitted_string[1].trim());
		/*for (int i=0; i<=s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
		*/
		//char output = 0;
		System.out.println(s1.toUpperCase());
		for (int i=s.length()-1;i>=0; i--)
		{
		System.out.print(s.charAt(i));
		}
	}

}
