package ashwini_JavaProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Flightbooking_search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Git\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// country search
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		Thread.sleep(3000);
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				System.out.println(option.getText());
				option.click();
				break;
			}

		}
		// checkbox
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		// Roundtrip Radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// From and To city selection
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(5000);
		// Future date

		// passengers
		driver.findElement(By.id("divpaxinfo")).click();
		for (int i = 1; i <= 3; i++) {
			Thread.sleep(1000);
			driver.findElement(By.id("hrefIncAdt")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}

		// currency
		WebElement Staticdropdown = (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// search

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
