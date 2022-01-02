package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Noesys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ahalya");		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S K");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(source);
//		dropdown.selectByIndex(4);
		dropdown1.selectByValue("LEAD_CONFERENCE");
		WebElement mCampegion = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2 = new Select(mCampegion);
		dropdown2.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ahalya");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("SK");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/17/96");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000000");
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown3 = new Select(currency);
		dropdown3.selectByVisibleText("INR - Indian Rupee");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown4 = new Select(industry);
		dropdown4.selectByIndex(7);
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown5 = new Select(ownership);
		dropdown5.selectByValue("OWN_SCORP");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0987");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("for testing purpose");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("34");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("45");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("ww");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aa@mail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("45654567");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("rtgrt");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("ertre");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("aa");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("bb");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("werew");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("werew");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Madikeri");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("234321");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("34444");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown6 = new Select(state);
		dropdown6.selectByValue("AZ");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown7 = new Select(country);
		dropdown7.selectByValue("DZA");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String firstName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println(firstName);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			System.out.println(title+" - contains View Lead");
		}else {
			System.out.println(title+" - does not conatins View Lead");
		}

		driver.close();
		

		
		
	}

}
