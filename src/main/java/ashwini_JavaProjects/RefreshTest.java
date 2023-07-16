package ashwini_JavaProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name [] = {"Alligator","ball","cat"};
		for (int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
			}
		System.out.println("ILU");*/
		//System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL="www.google.com";
		driver.get(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		//driver.close();
		
	}
}
