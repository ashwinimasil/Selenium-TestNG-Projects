package week2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Marathon_TC03PVRCinemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click Movie library
		driver.findElement(By.xpath("//div[contains(text(),'Movie Library ')]")).click();
		System.out.println("Movie Library clicked");
		
		/*new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable
		(By.cssSelector("button.close.ng-star-inserted")).click();*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> arrayList = new ArrayList<>(windowhandles);
		driver.switchTo().window(arrayList.get(0));
		
		driver.findElement(By.xpath("//button[@class='close ng-star-inserted']")).click();
		
		//search by city
		WebElement city = driver.findElement(By.name("city"));
		Select cityDD = new Select(city);
		cityDD.selectByValue("Chennai");
						
		//select Genre
		WebElement genrelabel = driver.findElement(By.name("genre"));
		genrelabel.click();
		Select GenreSelect = new Select(genrelabel);
		GenreSelect.selectByVisibleText("ANIMATION");
		
		//select Language
		WebElement language = driver.findElement(By.name("lang"));
		language.click();
		Select LanguageSelection = new Select(language);
		LanguageSelection.selectByVisibleText("English");
		
		//Click Apply button
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		//select first movie
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		
		//proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		//cinematheatre
		driver.findElement(By.name("cinemaName")).click();
		WebElement CinemaTheatre = 	driver.findElement(By.xpath("//option[contains(text(),'ECR')]"));
		CinemaTheatre.click();
		
		//datepicker
		driver.findElement(By.className("datepicker-container datepicker-default")).click();
		driver.findElement(By.xpath("//span[contains(text(),'12')]")).click();
		
		//showtime
		driver.findElement(By.xpath("//label[contains(text(),'Time')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'12:00 PM')]")).click();
		
		//no of seats
		driver.findElement(By.name("noOfTickets")).sendKeys("4");
		
		//name
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ashwini",Keys.ENTER);
		
		//email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwinimasil@gmail.com");
		
		//mobile
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7871771225");
		
		//food
		WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
		Select freq =  new Select(food);
		freq.selectByValue("Yes");
		
		//other Requests
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("NA");
		
		//copy To self
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		
		//SEND REQUEST
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		//cancel button
		driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		
		//close the dialog box
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		
		//verify the title
		driver.getTitle();			
		
	}


}
