package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();
		String[] split = text.split("\\D");
		String string = "";
		for (int i = 10; i < split.length; i++) {
			string = string + split[i];
		}
		System.out.println(string);

		driver.findElement(By.xpath("((((//span[text()='Brand'])/parent::div)/following-sibling::ul)/span)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(((((//span[text()='Brands'])/parent::div)/following-sibling::ul)/span)[2]//span)[3]")).click();
		//Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement firstitem = driver.findElement(By.xpath("(//div[contains(@class,'none a-spacing-top-small s-title-instructions-style')])[1]//span[@class='a-size-base-plus a-color-base']"));
		System.out.println(firstitem.getText());

		WebElement disprice = driver.findElement(By.xpath("(//div[contains(@class,'none a-spacing-top-small s-price')]//span[@class='a-price-whole'])[1]"));
		System.out.println(disprice.getText());
		driver.close();

	}
}

