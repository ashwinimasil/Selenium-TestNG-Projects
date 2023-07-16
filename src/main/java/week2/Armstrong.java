package week2;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
		int sum=0;
		int r =no%100;
		int q =no/100;
		boolean isArmstrong=true;
		for (int i=0;i<=(r+q);i++) {
				
			
			int rem =r*r*r;
			int quo = q*q*q;
			sum = r + q;
			
			q=q/10;
			r=r%10;
		}								
			if (sum==no)
			{
			System.out.println(sum);
			System.out.println("true");
			 
			}
			else
				System.out.println("false");					
		}
	}

