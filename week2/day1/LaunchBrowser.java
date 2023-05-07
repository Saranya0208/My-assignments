package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		//to load an url
		driver.get("https://login.salesforce.com/");

		//to maximize
		driver.manage().window().maximize();

		//to enter username
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");

		//to enter password
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");

		//click login
		driver.findElement(By.id("Login")).click();

		// to verify with title
		String title = driver.getTitle();	
		System.out.println(title);

	}

}
