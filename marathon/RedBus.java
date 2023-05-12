package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("dest")).sendKeys("Banglore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("onward_cal")).click();
		WebElement currentdate = driver.findElement(By.xpath("//td[@class='current day']"));

		String currd = currentdate.getText();

		int currday = Integer.parseInt(currd);
		int nextday = 1 + currday;

		System.out.println(nextday);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[contains(text(),'"+nextday+"')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(8000);
		WebElement buses = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']/span"));
		String noofbuses = buses.getText();
		System.out.println(noofbuses);

		driver.findElement(By.xpath("//ul[@class='list-chkbox']//label[@title='SLEEPER']")).click();
		Thread.sleep(5000);
		WebElement bus = driver.findElement(By.xpath("//*[@class='bus-items']/div[2]//div[@class='travels lh-24 f-bold d-color']"));
		String busName = bus.getText();
		System.out.println(busName);
		String title = driver.getTitle();
		System.out.println(title);
	}
}
