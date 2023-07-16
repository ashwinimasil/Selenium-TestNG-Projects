package selenium_Automation_Projects;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		String[] mylist = { "Cucumber", "Cauliflower", "Carrot", "Pumpkin" };
		int j = 0;

		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Addtocart ac = new Addtocart();
		addItems(driver, mylist);
	}
	public static void addItems(WebDriver driver, String[] mylist) throws InterruptedException {
		int j = 0;
		int no = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		List al = Arrays.asList(mylist);

		for (int i = 0; i < products.size(); i++) {
			String[] productName = products.get(i).getText().split("-");
			String fText = productName[0].trim();

			if (al.contains(fText)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				j++;
				if (j == mylist.length) {
					no = mylist.length;
					String check = driver.findElement(By.xpath("//td[text()='Items']/parent::tr/td/strong")).getText();
					int cartText = Integer.parseInt(check);
					System.out.println(no);
					System.out.println(check);
					Assert.assertEquals(no, cartText);
					break;
				}
			}

		}
		String promocode = "rahulshettyacademy";
		WebElement check = driver.findElement(By.xpath("//td[text()='Items']/parent::tr/td/strong"));

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys(promocode);
		// apply
		driver.findElement(By.cssSelector(".promoBtn")).click();

		String promoText = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(promoText);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		WebElement countrychoose = driver.findElement(By.xpath("//div[@class='wrapperTwo']//select"));
		Select dropdown = new Select(countrychoose);
		dropdown.selectByValue("India");
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@class='chkAgree']")).isSelected());

		driver.findElement(By.className("//a[@class='ui-state-default']/parent::td/a[text()='26']")).click();

		driver.findElement(By.xpath("//button[@text()='Proceed']")).click();// search

		System.out.println("The End");
		driver.close();
	}
}
