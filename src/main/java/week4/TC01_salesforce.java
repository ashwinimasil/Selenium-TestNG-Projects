package week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.sukgu.Shadow;

public class TC01_salesforce {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		//Learnmore
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		//confirm direct
		System.out.println(driver.getWindowHandle());
		String Ptitle = driver.getTitle();
		System.out.println(Ptitle);
		
		Set<String> windowhandles = driver.getWindowHandles();
		List<String>winlist=new ArrayList<>(windowhandles);
		System.out.println("Window size"+ winlist.size());
		driver.switchTo().window(winlist.get(1));
	//String ctitle = driver.getTitle();
	//System.out.println("Child title"+ctitle);
	//confirm button
		Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	
	Shadow shadow1=new Shadow(driver);
	Thread.sleep(5000);
	shadow1.findElementByXPath("//span[text()='Learning']").click();
	WebElement trailhead = shadow1.findElementByXPath("//span[text()='Learning on Trailhead']");
	Actions trail=new Actions(driver);
	Thread.sleep(5000);
	trail.moveToElement(trailhead).perform();
	
	//sales force administration- javascript
	
	WebElement salesforcecert = shadow1.findElementByXPath("//a[text()='Salesforce Certification']");
		
	driver.executeScript("arguments[0].click();", salesforcecert);
	System.out.println("sales force cert clicked");
	//driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	
	//scroll administrator
	WebElement scrolladmincert = driver.findElement(By.xpath("//a[text()='Administrator']"));
	trail.moveToElement(scrolladmincert).perform();

	System.out.println("Administrator clicked");
	//driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	System.out.println("out");
	
	Thread.sleep(5000);
	WebElement cert =driver.findElement(By.xpath("(//div[@class='credentials-card '])[1]"));
	System.out.println(cert.getText());
	trail.moveToElement(cert).perform();
	

	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	driver.switchTo().defaultContent();
	
	List<WebElement> certification = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	int certsize =certification.size();
	System.out.println();
	for (int i = 0; i <certsize; i++) {
		System.out.println(driver.findElements(By.xpath("//div[@class='credentials-card_title']")).get(i).getText());
			
	}
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination = new File("./screenshots/salesforce.png");
	FileUtils.copyFile(source, destination);
	System.out.println("screenshot captured");

	driver.close();
	
		}

}
