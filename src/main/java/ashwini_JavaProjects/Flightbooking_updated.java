package ashwini_JavaProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flightbooking_updated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Git\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(3000);
		
		//List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); 
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		Thread.sleep(3000);
		for (WebElement option :options)
		{
			if (option.getText().equalsIgnoreCase("Australia"))
			{
				System.out.println(option.getText());
				option.click();
				break;
			}
			
		}		
		Thread.sleep(3000);
		System.out.println("The End");
		driver.close();
		}
}
