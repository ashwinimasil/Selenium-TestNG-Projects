package ashwini_JavaProjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Selenium_Introduction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Git\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				//driver.getPageSource();
				driver.close();
				//driver.quit();
				
				

	}

}








