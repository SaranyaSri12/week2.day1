package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Driver/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("Demosalesmanager");
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create Lead")).click();
	WebElement compName = driver.findElement(By.id("createLeadForm_companyName"));
	compName.sendKeys("wipro");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/04/1993");
	driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04259");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8765432");
	driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("222");
	driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sara");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
	driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.xyz.com");

	driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Saran");
	driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("sri");
	driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("5 street");
	driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("West");
	driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("India");
	driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("000123");
	driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("321");
	driver.findElement(By.name("submitButton")).click();
	driver.close();
	
	
	
	
	
	
}
}
