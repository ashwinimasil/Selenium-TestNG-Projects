package w3.Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframeHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chroption = new ChromeOptions();
		chroption.addArguments("--disable Notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.findElement(By.id("accept-choices")).click();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert Text = driver.switchTo().alert();
		System.out.println(Text.getText());
		Text.accept();
		
		
		
		
	}

}
