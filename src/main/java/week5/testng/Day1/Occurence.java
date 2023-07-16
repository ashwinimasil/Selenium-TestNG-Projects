package week5.testng.Day1;

public class Occurence {

	public static void main(String[] args) {
		String input = "apple";
		char[] name = input.toCharArray();
		
		int Occurence = 0;
		for (int i = 0; i < name.length; i++) 
		{
			
			for (int j = i+1; j < name.length;j++) 
			{
				if (name[i]==name[j]){
				{
					Occurence +=1;
				}
			}
				
		}
			System.out.println(name[i]+"="+Occurence);	
	}
}
	

}



