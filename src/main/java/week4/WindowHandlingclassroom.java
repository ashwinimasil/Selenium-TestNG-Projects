package week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingclassroom {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String Parenttitle = driver.getTitle();
		System.out.println();
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		for (String each : windowHandles) 
		{
			System.out.println(each);
		}
		List<String> FromarrayList = new ArrayList<>(windowHandles);
		driver.switchTo().window(FromarrayList.get(1));
		String FromChildtitle = driver.getTitle();
		if (!Parenttitle.equals(FromChildtitle)) {
			System.out.println("its child window"+FromChildtitle+ "\t");
		}
		else {
			System.out.println("its the parent windonw"+Parenttitle);
		}	
		
	}

}



