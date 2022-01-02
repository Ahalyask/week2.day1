package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(3);
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByVisibleText("Loadrunner");
		
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select dropdown3 = new Select(dd3);
		dropdown3.selectByValue("2");
		
		WebElement dd4 = driver.findElement(By.className("dropdown"));
		Select dropdown4 = new Select(dd4);
		List<WebElement> options = dropdown4.getOptions();
		System.out.println(options.size());
		
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Appium");;
		
		
		driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[3]")).click();
	}

}
