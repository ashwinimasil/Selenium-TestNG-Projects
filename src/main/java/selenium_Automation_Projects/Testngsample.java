package selenium_Automation_Projects;

import org.testng.annotations.*;


public class Testngsample {
	
	@BeforeTest
	  public void before_test()  
	  {  
		System.out.println("Before Test");
	  }
	  
	@Test
	 public void test()  
	  { 
	System.out.println("Test");
	  }
	@AfterTest
	 public void after_test()  
	  { 
		
System.out.println("After Test");

}
	}