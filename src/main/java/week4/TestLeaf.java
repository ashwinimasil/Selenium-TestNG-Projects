package week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLeaf {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =  new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println("Click and confirm new window opens");
		//new window
		Set<String> windowhandles = driver.getWindowHandles();
		List<String>Listarray = new ArrayList<>(windowhandles);
		driver.switchTo().window(Listarray.get(1));
		
		WebElement videoviews =driver.findElement(By.xpath("(//div[@class='overview-numbers'])[2]"));
		System.out.println(videoviews.getText());
		driver.close();
		
		driver.switchTo().window(Listarray.get(0));
		
		System.out.println("close all windows primary");
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowhandles1 = driver.getWindowHandles();
		List<String>Listarray1 = new ArrayList<>(windowhandles1);
		int size = Listarray1.size();
		for (String string : Listarray1) {
			driver.switchTo().window(string).close();
		}
		//driver.switchTo().window(Listarray.get(0));
		System.out.println("closed all windows");
		
		
	}

}
