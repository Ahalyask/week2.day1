package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("aha)lyaskcoorg@gmail.com");
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("Ahaya",Keys.TAB);
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input ")).clear();
		boolean enabled = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled();
		System.out.println(enabled);
//		driver.close();
	}

}
