package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {

		//Setup chrome driver
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		//Launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize the chrome browser
		driver.manage().window().maximize();
		//Load url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//Create Lead Section
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Rheinbrucke");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subburaj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
		WebElement srcDrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select slct1 = new Select(srcDrop);
		slct1.selectByValue("LEAD_EMPLOYEE");
		WebElement marketDrop = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select slct2 = new Select(marketDrop);
		slct2.selectByValue("DEMO_MKTG_CAMP");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Vel");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/15/86");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Department");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("200000");
		WebElement curDrop = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select slct3 = new Select(curDrop);
		slct3.selectByValue("CAD");		
		WebElement indDrop = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select slct4 = new Select(indDrop);
		slct4.selectByValue("IND_FINANCE");	
		WebElement ownDrop = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select slct5 = new Select(ownDrop);
		slct5.selectByValue("OWN_PARTNERSHIP");	
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SIC1234");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("##");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description of the Company");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Note for this Company");
		//Contact Information Section
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0451");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("5605601234");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("004");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Person");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("info@email.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		//Primary Address Section
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Attention");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3/27 A, Royal Street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Madurai East");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Madurai");
		WebElement stateDrop = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select slct6 = new Select(stateDrop);
		slct6.selectByValue("RI");	
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("50042");
		WebElement counDrop = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select slct7 = new Select(counDrop);
		slct7.selectByValue("USA");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("04266");
		//Create Lead Button
		driver.findElement(By.name("submitButton")).click();

		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Firstname: "+firstName);
		
		String pgTitle = driver.getTitle();
		System.out.println(pgTitle);

		if (pgTitle.contains("View Lead")) {
			System.out.println("Page title verified");
		}else {
			System.out.println("Page title is not verified");
		}

	}

}
