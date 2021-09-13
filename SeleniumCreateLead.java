package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  String name= driver.getTitle();
		  System.out.println("title"+name);
		  
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("demosalesmanager");
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("crmsfa");
		  
		  WebElement decorative = driver.findElement(By.className("decorativeSubmit"));
		  decorative.click();
		 
		 
		 
		  WebElement liketext = driver.findElement(By.linkText("CRM/SFA"));
		  liketext.click();
		  
		  WebElement leads = driver.findElement(By.linkText("Leads"));
		  leads.click();
		  
		  
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Vertex");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kabilan");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Radhakrishnan");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kabilan");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/12/1996");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Work");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Support Engineer");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("250000");
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("25");
		  WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		  countrycode.clear();
		  countrycode.sendKeys("91");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0123456789");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kabilan.ila03@gmail.com");
						
	
	}

}