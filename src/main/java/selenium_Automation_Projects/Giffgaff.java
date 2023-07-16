package selenium_Automation_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Giffgaff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Git\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Git\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.giffgaff.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[text()='Accept all cookies']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("span//[@class='gg-c-btn__switch']")).click();
		 
		 //System.out.println("offer clicked");
		 Thread.sleep(5000);
		 List<WebElement> choosebrand = driver.findElements(By.xpath("//span[@class='gg-c-checkbox__text']"));
		 
		 for(int i=0; i<=choosebrand.size();i++)
			 
		 {
			 
			 System.out.println(choosebrand.get(i).getText());
			 			 
		 }
		System.out.println("The End");		 
		 //System.out.println(choosebrand);
		 //System.out.println("samsung clicked");
		 //driver.close();
		 
	}

}
