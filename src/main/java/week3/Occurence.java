package week3;

public class Occurence {
	
	public static void main(String[] args) {
	int[] input= {1,1,2,1,2,2,3};
	int size =input.length;
	int[] unique= new int[size];
	
	unique[0]=input[0];
	for (int i=0;i<size-1;i++) 
	{
		if (input[i]!=input[i+1]) 
		{
			continue;
			//System.out.println(unique[i]);
		}else
		{
			unique[i]=input[i];
		}
		
	}
	System.out.println(unique.length);
	for(int x=0;x<unique.length;x++)
	{
		System.out.println(unique[x]);
	}
}

}
