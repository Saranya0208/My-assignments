package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select pvrCity = new Select(city);
		pvrCity.selectByVisibleText("Chennai");
		WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select pvrGenre = new Select(genre);
		pvrGenre.selectByVisibleText("ANIMATION");
		WebElement lang = driver.findElement(By.xpath("//select[@name='lang']"));
		Select langPvr = new Select(lang);
		langPvr.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']/img)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(3000);
		WebElement cinema = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select cinemaPvr = new Select(cinema);
		cinemaPvr.selectByIndex(2);
		WebElement time = driver.findElement(By.xpath("//select[@name='timings']"));
		Select timePvr = new Select(time);
		timePvr.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Saranya");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9003181499");
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		WebElement date = driver.findElement(By.xpath("//div[@class='main-calendar-days']//span[contains(@class,'day-unit is-today is-selected')]"));
		String today = date.getText();
		int today1 = Integer.parseInt(today);
		int bookingDate = today1 + 7;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()= '"+bookingDate+"']")).click();
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rsaranya.rajan@gmail.com");
		WebElement food = driver.findElement(By.xpath("//select[@name='food']"));
		Select foodReq = new Select(food);
		foodReq.selectByIndex(0);
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Nil");
		driver.findElement(By.xpath("//span[@class='display-block']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		String title = driver.getTitle();
		System.out.println(title);       










	}

}
