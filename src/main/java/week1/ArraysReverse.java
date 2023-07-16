package week1;

public class ArraysReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] namelist = {"Karthik", "Ramya", "Ashwini", "Arun","Gowtham","Pratheep"};
//System.out.println(namelist[3]);
int len =namelist.length;
for (int i=len-1;i>=0;i--) {
	System.out.println(namelist[i]);
}
	}

}
