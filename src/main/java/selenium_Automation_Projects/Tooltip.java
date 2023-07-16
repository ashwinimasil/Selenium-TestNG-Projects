package selenium_Automation_Projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tooltip {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl= "https://www.w3schools.com";
		driver.get(baseurl);
		driver.findElement(By.id("accept-choices")).click();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		WebElement upgrade = driver.findElement(By.xpath("(//a[text()='Upgrade'][1])"));
		System.out.println(upgrade.getAttribute("title"));//popuptooltip
		//TakesScreenshot webdriver = null;
		//TakesScreenshot screenshot =((TakesScreenshot)webdriver);
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//screenshot
		File webelementscrshot = upgrade.getScreenshotAs(OutputType.FILE);//webelementscreenshot
		FileUtils.copyFile(srcfile,new File("C:\\Users\\rajas\\paint.png"));
		FileUtils.copyFile(srcfile, new File("C:\\\\Users\\\\rajas\\\\webelement.png"));
		
		
		}

}
