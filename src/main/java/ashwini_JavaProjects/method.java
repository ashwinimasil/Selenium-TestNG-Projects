package ashwini_JavaProjects;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method gm = new method();
		gm.newmethod();
		trymethod();
		String name = gm.trymethod();
		System.out.println(name);
		
	}
	public void newmethod()
	{
		System.out.println("Good Morning");
	}
	
	public static String trymethod()
	{
		System.out.println("Good Evening");
		return "Ashwini";
	}

}
