package week10;

public class ConstrDemo extends ConstructorChaining{
	
	ConstrDemo(){
		System.out.println("Derived prototype");
	}

	public static void main(String[] args) {
		ConstructorChaining cc = new ConstructorChaining();
		ConstrDemo cd = new ConstrDemo();
		
	}
}