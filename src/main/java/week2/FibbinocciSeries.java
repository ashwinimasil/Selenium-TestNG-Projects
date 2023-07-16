package week2;
public class FibbinocciSeries {
	public static void main (String[] args) {
		
		int number = 11;
		int firstNum = 0;
		int secNum =1;
		int sum = 0;
				
		
		for (int i=0;i<=56;i++) {
		sum=firstNum + secNum ;
		firstNum = secNum  ;
		secNum=sum ;
		System.out.println(sum);
		}
}
}