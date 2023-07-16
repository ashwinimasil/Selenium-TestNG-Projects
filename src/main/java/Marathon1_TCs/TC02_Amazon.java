package Marathon1_TCs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://www.amazon.in");
// type bags in search box
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");

//select bag for boys
driver.findElement(By.xpath("//span[text()=' for boys']")).click();

//printing the result
System.out.println(driver.findElement(By.xpath("//span[contains(text(),'50,000')]")).getText());

//selecting first 2 brands
driver.findElement(By.xpath("//span[contains(text(),'American')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Safari')]")).click();

//sort by newest arrivals
driver.findElement(By.xpath("//span[contains(text(),'Sort')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Arrivals')]")).click();

//print the first 2 bags info
System.out.println(driver.findElement(By.xpath("//span[contains(text(),'waterproof')]")).getText());
System.out.println(driver.findElement(By.xpath("(//span[contains(text(),'waterproof')])[2]")).getText());


	}

}
