package selenium_Automation_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://rahulshettyacademy.com/angularpractice/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement namelabel = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(namelabel)).getText());
		namelabel.sendKeys("Ashwini");
		String jdown= "window.scrollBy(0,1700)";
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		jsexecutor.executeScript(jdown);
		
		Thread.sleep(3000);
		WebElement checkboxlabel = driver.findElement(By.className("form-check-label"));
		driver.findElement(with(By.tagName("label")).toRightOf(checkboxlabel)).click();
		System.out.println("checkbox");
		WebElement employedlabel = driver.findElement(By.xpath("//label[@for='inlineRadio2']"));
		driver.findElement(with(By.tagName("label")).toRightOf(employedlabel)).click();
		WebElement dateofbirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofbirth)).click();
		
		String jup="window.scrollBy(0,-350)";
		jsexecutor.executeScript(jup);
		String Actual = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		String Expected="Success! The Form has been submitted successfully!. ";
		Assert.assertEquals(Actual,Expected);
		System.out.println(Actual);
				
		
	}
}