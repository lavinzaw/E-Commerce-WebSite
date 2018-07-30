package EommerceWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

/**
 * 
 * 
 * @author suyashkalyankar
 * 
 * Sample Register Test script for Sample ecommerce website http://automationpractice.com/index.php
 *
 */

public class Register {
	
	public static void main(String[]args) {
		
		//set  web.driver.chrome property to its executable's location
				System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");

		
		WebDriver driver;
		WebElement radiobttn;
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//Get WebSite URL
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Website is opened Successfully");
		
		//Click on Sign in button to register
		
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("Sucessfull click on Sign in button");
		
		//Enter Email address
		driver.findElement(By.id("email_create")).sendKeys("john.smith@email.com");
		System.out.println("Email entered sucessfully");
		
		//Click On Create account
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		System.out.println("Account Created Sucessfully");
		
		/***
		 * 
		 * Enter the Account details like name,address and phone
		 * 
		 */
		
		// Select The Title Mr.
		
		driver.findElement(By.id("id_gender1")).click();
		System.out.println("Gender selected Sucessfully");
		
		
		//Enter the FirstName 
		driver.findElement(By.id("customer_firstname")).click();
		driver.findElement(By.id("customer_firstname")).clear();
		driver.findElement(By.id("customer_firstname")).sendKeys("John");
		System.out.println("First Name Entered Sucessfully");
		
		//Enter The LastName
		driver.findElement(By.id("customer_lastname")).click();
		driver.findElement(By.id("customer_lastname")).clear();
		driver.findElement(By.id("customer_lastname")).sendKeys("Smith");
		System.out.println("Last Name Entered Sucessfully");
		
		//Enter Password
		driver.findElement(By.id("passwd")).sendKeys("john1234");
		System.out.println("Password entered Sucessfully");
		
		/*
		 * Enter DOB(Date of Birth)
		 */
		
		// Enter Day first
		
		//Create an explicit wait condition - As drop down button will get visible to select value
		
		WebDriverWait Wait =new WebDriverWait(driver,10);
		
		WebElement btn = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='uniform-days']/span")));
		driver.findElement(By.id("days")).click();
		new Select(driver.findElement(By.id("days"))).selectByIndex(9);
		System.out.println("Day entered sucessfully");
		
		
		//Enter Month 
		
		//Create an explicit wait condition - As drop down button will get visible to select value
		WebDriverWait Wait1=new WebDriverWait(driver,10);
		WebElement btn1=Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-months")));
		Select month =new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("February ");
		System.out.println("Month entered sucessfully");
		
		// Enter Year
		
		//Create an explicit wait condition - As drop down button will get visible to select value
		
		WebDriverWait Wait2=new WebDriverWait(driver,10);
		WebElement btn2=Wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-years")));
		Select year=new Select(driver.findElement(By.id("years")));
		year.selectByIndex(27);
		System.out.println("year Entered sucessfully");
		
		//Click on check box for news letter services]
		
		WebElement radio =(driver.findElement(By.id("newsletter")));
		radio.click();
		System.out.println("Clicked on check box");
		
		/*
		 * 
		 * Enter Full information Form
		 */
	
		//Enter First Name
		
		WebElement fname1=(driver.findElement(By.id("firstname")));
		fname1.sendKeys("John");
		System.out.println("First Name entered Sucessfully");
		
		//Enter Last Name
		WebElement lname2=(driver.findElement(By.id("lastname")));
		lname2.sendKeys("Smith");
		System.out.println("Last name entered Succesfully");
		
		//Enter Company name
		WebElement com=(driver.findElement(By.id("firstname")));
		com.sendKeys("XYZ PVT LTD");
		System.out.println("Entered Comapny Name Successfully");
		
		
		//Enter full address
		WebElement add1=(driver.findElement(By.id("address1")));
		add1.sendKeys("State Street");
		WebElement add2=(driver.findElement(By.id("address2")));
		add2.sendKeys("2303,Southbank Grande");
		System.out.println("Full Address entered Successfully");
		
		//Enter City Name
		WebElement city=(driver.findElement(By.id("city")));
		city.sendKeys("Dallas");
		System.out.println("City Name entered Sucessfully");
		
		//Select State
		
		WebDriverWait Wait3=new WebDriverWait(driver,10);
		WebElement btn3=Wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-id_state")));
		Select State=new Select(driver.findElement(By.id("id_state")));
		State.selectByIndex(43);
		System.out.println("State Entered sucessfully");
		
		//Enter Postcode
		WebElement pcode=(driver.findElement(By.id("postcode")));
		pcode.sendKeys("30001");
		System.out.println("Post Code entered Successfully");
		
		//Enter Additional Details(Optional)
		WebElement details=(driver.findElement(By.id("other")));
		details.sendKeys("For Selenium Web driver Practice");
		System.out.println("Addtional Information entered");
		
		//Enter Mobile Number
		WebElement mobile=(driver.findElement(By.id("phone_mobile")));
		mobile.sendKeys("4031220420");
		System.out.println("Mobile Number entered Successfully");
		
		//Assign and alias for address given
		WebElement alias=(driver.findElement(By.id("alias")));
		alias.sendKeys("Home Address");
		System.out.println("Assigned alias for address");
		
		//Click on Register Button to Register
		WebElement Register=(driver.findElement(By.id("submitAccount")));
		Register.click();
		System.out.println("Register Successfully");
		
		//After Successfull Registration click on home button
		WebElement home=(driver.findElement(By.className("btn btn-default button button-small")));
		home.click();
		System.out.println("Go To Home Screen");
		
	}
	

}
