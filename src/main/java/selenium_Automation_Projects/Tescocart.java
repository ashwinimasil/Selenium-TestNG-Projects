package selenium_Automation_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tescocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tesco.com");	
		driver.manage().deleteAllCookies();
		//driver.findElement(By.className("base-components__BaseElement-sc-1mosoyj-0 styled__InnerContainer-rsekm1-1 dZOmBy klyITS beans-button__inner-container")).click();
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/form/button/span")).click();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(1000);
		String actText=driver.findElement(By.linkText("Register for an account")).getText();
		System.out.println(actText);
		String expText="Register for an account";
		Assert.assertEquals(expText,actText);
		String jdown = "window.scrollBy(0,1000)";
		JavascriptExecutor javascriptexecutor = (JavascriptExecutor)driver;
		javascriptexecutor.executeScript(jdown);
		driver.findElement(By.id("email")).sendKeys("ashwinimasil@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Masil123$");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("email")).sendKeys("ashwinimasil@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Masil123$");
		driver.findElement((By.xpath("//button[@id='signin-button']//span[@class='base-components__BaseElement-sc-1mosoyj-0 styled__InnerContainer-rsekm1-1 oznwo fuFres beans-button__inner-container']"))).click();
		String welcomename ="Ashwini";
		Assert.assertEquals(driver.findElement(By.xpath("div h1")), welcomename);
		System.out.println(welcomename);
		driver.close();
		

	}

}
