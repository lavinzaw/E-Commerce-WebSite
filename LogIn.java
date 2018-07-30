package EommerceWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	
	public static void main(String[]args) {
		
		WebDriver driver;
		//set  web.driver.chrome property to its executable's location
		System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");

		//Set Chorme driver
		driver = new ChromeDriver();
		
		//Get The Base URL http://automationpractice.com/index.php
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Website Opened Successfully");
		
		//Click On Sign in to Log In into the account
		
		WebElement signin=(driver.findElement(By.className("login")));
		signin.click();
		System.out.println("Clicked on Signin button ");

		//Enter Email address to log in
		WebElement email=(driver.findElement(By.id("email")));
		email.sendKeys("john.smith@email.com");
		System.out.println("Email entered Successfully");
		
		//Enter Password to LogIn
		WebElement pass=driver.findElement(By.id("passwd"));
		pass.sendKeys("john1234");
		System.out.println("Password entered Successfully");
		
		//Click on Submit to login
		WebElement submit=driver.findElement(By.id("SubmitLogin"));
		submit.click();
		System.out.println("Logged in ");
		
	}
	
	
	
}
