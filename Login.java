package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		//Setup chrome driver
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		//Launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize the chrome browser
		driver.manage().window().maximize();
		//Load url
		driver.get("http://leaftaps.com/opentaps");
		//Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Rheinbrucke");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subburaj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
		//Dropdown
		WebElement drp = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select slct = new Select(drp);
		
		slct.selectByVisibleText("Public Relations");
		
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String srcText = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(srcText);

	}

}
