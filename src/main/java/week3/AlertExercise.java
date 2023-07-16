package week3;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExercise {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert switchtext = driver.switchTo().alert();
		String AlertText =switchtext .getText();
		System.out.println(AlertText);
		switchtext.accept();
		if (AlertText.contains("simple alert")) {
		
		System.out.println("Alert accepted");
	}
	}
	}

