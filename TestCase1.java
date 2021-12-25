package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

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
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Subburaj");
		driver.findElement(By.id("lastNameField")).sendKeys("Thangavel");
		driver.findElement(By.name("submitButton")).click();
		
		String srcText = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("Firstname: "+srcText);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();

	}

}
