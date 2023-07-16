package Marathon1_TCs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class TC01_Thursday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//WebDriverManager.chromedriver().setup();


//allow cookies
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");		
		
ChromeDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.redbus.in/");
// From Textbox
WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
From.sendKeys("chennai");
driver.findElement(By.xpath("//li[@class='sub-city'][1]")).click();


// To Textbox
WebElement To = driver.findElement(By.xpath("//input[@id='dest']"));
To.sendKeys("Bangalore");
driver.findElement(By.xpath("//li[@class='sub-city'][1]")).click();

// Date selection
driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
driver.findElement(By.xpath("//td[text()='12']")).click();

//click search button
driver.findElement(By.xpath("//button[@id='search_btn']")).click();

//print no of busses searched
System.out.println(driver.findElement(By.xpath("//span[text()='102']")).getText());

//select sleeper checkbox
driver.findElement(By.xpath("//label[@title='SLEEPER']")).isSelected();

//print the second search result
System.out.println(driver.findElement(By.xpath("//div[text()='VHB Travels']")).getText());
	}

}
