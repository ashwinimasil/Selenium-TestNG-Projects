package selenium_Automation_Projects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlesnewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("Webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://rahulshettyacademy.com/angularpractice/";
		driver.get(baseurl);
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String Firstwindow = it.next();
		String secondwindow = it.next();
		driver.switchTo().window(secondwindow);
		driver.get("https://rahulshettyacademy.com");
		String Firstcourse = driver.findElements(By.xpath("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(Firstwindow);
		driver.findElement(By.cssSelector("[name='name']"));
		
		driver.close();
	}

}
