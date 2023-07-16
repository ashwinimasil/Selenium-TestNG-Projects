package week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class TC03_mobile {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://dev70206.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("g=Sl+bJvA99D");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow1 = new Shadow(driver);
		//Thread.sleep(10000);
		shadow1.setImplicitWait(30);
		shadow1.findElementByXPath("//div[@id='all']").click();
		shadow1.setImplicitWait(20);
		shadow1.findElementByXPath("//span[text()='Service Catalog']").click();
		//shadow1.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
		//shadow1.setImplicitWait(10);	
		//shadow1.findElementByXPath("//div[@id='all']").click();
		//shadow1.findElementByXPath("//mark[text()='Service Catalog']").click();
		Thread.sleep(5000);
		WebElement frame = shadow1.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 6s']")).click();
		WebElement storage = driver.findElement(By.id("IO:e0b15e33d7033100a9ad1e173e24d4a1"));
		Select select1 = new Select(storage);
		select1.selectByVisibleText("128GB");
		
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String SuccessText = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		System.out.println(SuccessText);
		if(SuccessText.contains("request has been submitted")) {
			System.out.println("order placed");
		}
		//Shadow shadow2 = new Shadow(driver);
		WebElement reqno = driver.findElement(By.id("requesturl"));
		//shadow2.findElementByXPath("//a[text()='requesturl']");
		System.out.println(reqno.getText());
		
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/shoeselection.png");
		FileUtils.copyFile(source, destination);
		//driver.close();
				
	}

}
