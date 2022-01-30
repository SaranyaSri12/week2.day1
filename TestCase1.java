package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Contacts")).click();
	driver.findElement(By.partialLinkText("Create Contact")).click();
	WebElement elementFirstName = driver.findElement(By.id("firstNameField"));
	elementFirstName.sendKeys("Saranya");
	WebElement elementLastName = driver.findElement(By.id("lastNameField"));
	elementLastName.sendKeys("Srinivasan");
    driver.findElement(By.name("submitButton")).click();
    driver.close();
    
    

	
	
		
	
}
}
