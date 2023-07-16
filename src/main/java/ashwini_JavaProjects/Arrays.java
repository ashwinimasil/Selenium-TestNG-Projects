package ashwini_JavaProjects;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays
		int[] array = new int[5];
		array[0] =1;
		array[1] =2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		int[] array2 = {11,22,33,44,55,66,77,88,99};
		System.out.println(array2[4]);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
			
		}
			
		for (int i=0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
}
		
		String [] Alphabets = {"Apple","Ball","Cat","Doll","Elephant"};
		for (int i=0; i<Alphabets.length; i++)
		{
		System.out.println(Alphabets[i]);
}
		for (String S : Alphabets)
		{
			System.out.println(S);
		}
}
}