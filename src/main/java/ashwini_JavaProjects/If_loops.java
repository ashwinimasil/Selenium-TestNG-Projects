package ashwini_JavaProjects;

import java.util.ArrayList;

public class If_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Numbers = {2,3,4,5,6,8,10,12};
		for (int i=0; i<Numbers.length;i++)
		{
			if (Numbers[i]%2 == 0)
			{
				System.out.println(Numbers[i]);
				break;
			}
			else
			{
				System.out.println(Numbers[i] + "\t"  + "is not a multiple of 2" );
			}
		}
		
		ArrayList a = new ArrayList<String>();
		a.add("cat");
		a.add("Fig");
		a.add("Nutella");
		a.add("Doughnuts");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.get(1));
	}
}	
