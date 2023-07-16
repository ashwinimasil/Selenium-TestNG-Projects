package week1;

public class StonesandJewels{
public static void main(String[] args) 
	{
		int count=0;	
		String stones = "aAAbbbb";
		char[] splitstones = stones.toCharArray();
		
		String jewels = "aA";
		char[] jewelsstones = jewels.toCharArray();
		
		for (int j=0; j<jewelsstones.length; j++)
		{
		for(int i=0+j;i<=splitstones.length-1;i++) 
		{
			if (jewels.charAt(j)==stones.charAt(i)){
				{
					count =+1;
				}	
		}
		}
			}
		System.out.println(count);
	}
}
	




