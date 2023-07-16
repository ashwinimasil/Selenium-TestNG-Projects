package selenium_Automation_Projects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		int no =FooterDriver.findElements(By.tagName("a")).size();
		for(int i=0;i<=no;i++) {
			String linkclick = Keys.chord(Keys.CONTROL,Keys.ENTER);
			System.out.println(FooterDriver.findElements(By.tagName("a")).get(i).getText());
			FooterDriver.findElements(By.tagName("a")).get(i).sendKeys(linkclick);	
			//Thread.sleep(3000);
			//System.out.println(driver.getTitle());
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
	}

}
