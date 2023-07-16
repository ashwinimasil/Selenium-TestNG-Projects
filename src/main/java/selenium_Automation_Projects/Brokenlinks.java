package selenium_Automation_Projects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl ="https://rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.get(baseurl);
		WebElement footer = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		
		/*For single link
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);*/
		String jsexecutor = "window.scrollBy(0,1800)";
		JavascriptExecutor javaExecutor = (JavascriptExecutor) driver;
		javaExecutor.executeScript(jsexecutor);
		SoftAssert sa = new SoftAssert();		
		List <WebElement> urls = footer.findElements(By.tagName("a"));
		
		for (WebElement urls1:urls) {
			String link =urls1.getAttribute("href");
			//System.out.println(link);
			HttpURLConnection conn1 = (HttpURLConnection) new URL(link).openConnection();
			conn1.setRequestMethod("HEAD");
			conn1.setConnectTimeout(3000);
			conn1.connect();
			int responsecode = conn1.getResponseCode();
			System.out.print(responsecode + "\t");
			System.out.print( link + "\n");
			if(responsecode==404) {
				System.out.println("link to be fixed \n" +link);
					}
				
		/*Another way of writing Enhanced loop
		 for (int i=0;i<urls.size();i++) {
		String urls1 = footer.findElements(By.tagName("a")).get(i).getAttribute("href");
		HttpURLConnection conn1 = (HttpURLConnection) new URL(urls1).openConnection();
		conn1.setRequestMethod("HEAD");
		conn1.setConnectTimeout(3000);
		conn1.connect();
		int responsecode = conn1.getResponseCode();
		String Titlename =	urls.get(i).getAttribute("href");
		System.out.print(responsecode + "\t");
		System.out.print( Titlename + "\n");
		if(responsecode==404) {
			System.out.println("link to be fixed \n" +Titlename);
		}
		}*/
	}
	}
}
