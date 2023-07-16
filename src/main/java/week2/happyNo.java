package week2;

public class happyNo {
public static void main(String[] args) {
// TODO Auto-generated method stub
int no = 19;
int r = no/10 ;
int q = no%10 ;
boolean isHappy = true;
for (int i=1;i<=(r+q);i++) 
{
	int r2 = r * r;
	int q2 = q*q;
	int sum = r2+q2;
	//System.out.println(sum);
if (sum == 1) 
	{
		break;
	}
else
	r = sum%10;
	q = sum/10;
	isHappy = false;
continue;
}
if (isHappy=true) {
System.out.println("Its a Happy number" + "\t" +no);
	}
}
		}

