package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftab {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");


		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select newelement1 = new Select(findElement);

		//dropdown using index
		newelement1.selectByIndex(4);

		WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select newelement2 = new Select(findElement2);

		//dropdown using visibletext
		newelement2.selectByVisibleText("Automobile");

		WebElement findElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select newelement3 = new Select(findElement3);

		//dropdown using values
		newelement3.selectByValue("OWN_CCORP");

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println(title);

	}

}
