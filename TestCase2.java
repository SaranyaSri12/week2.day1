package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get(" http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("Demosalesmanager");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Contacts")).click();
	driver.findElement(By.partialLinkText("Find Contacts")).click();
    driver.findElement(By.partialLinkText("Email")).click();
	WebElement emailAddr = driver.findElement(By.partialLinkText("emailAddress"));
	emailAddr.sendKeys("babu@testleaf.com");
	driver.findElement(By.className("x-btn-text")).click();
	driver.close();
	
	
	
	
}
}
