package EommerceWebsite;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Shopping {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver;
		
		//set  web.driver.chrome property to its executable's location
		System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");

		//Set Chorme driver
		driver = new ChromeDriver();
	
		
		//Get The Base URL http://automationpractice.com/index.php
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Website Opened Successfully");
	
		//Set Dynamic timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		
		//Maximize the Web Browser
		driver.manage().window().maximize();
		System.out.println("Browser got maximized");
		
		
		//Select for Women clothing
		WebDriverWait Wait =new WebDriverWait(driver,10);
		WebElement btn = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sf-with-ul")));
		btn.click();
		System.out.println("Clicked On Women Section");
		
		//View item (Full Details) information
		WebElement item1=driver.findElement(By.linkText("Blouse"));
		item1.click();
		System.out.println("More information of item is shown ");
		
		//Increase or decrease the amount of items
		WebElement inc=driver.findElement(By.id("quantity_wanted"));
		inc.clear();
		inc.sendKeys("2");
		System.out.println("Increased");
		
		//Change the Color of the Item
		WebElement color=driver.findElement(By.id("color_8"));
		color.click();
		System.out.println("Color Chnaged");
		
		//Select The Size of the item
		WebDriverWait Wait1 =new WebDriverWait(driver,10);
		WebElement size=Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("uniform-group_1")));
		new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");;
		System.out.println("Size selected");
		
		//Click To Add to Cart Button
		WebElement submit =driver.findElement(By.id("add_to_cart"));
		submit.click();
		System.out.println("Item added to the cart");
	
		//Click To Proceed to checkout
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//a[contains(@title,'Proceed to checkout')]")).click();
	
		System.out.println("Moved to check out menu");
		
		//Click to Continue Shopping
		
		Thread.sleep(2000L);
		driver.findElement(By.xpath(".//a[contains(@title,'Continue shopping')]")).click();
		System.out.println("Back to item screen");
		
		//Move to Dresses section
		
		WebDriverWait Wait2 =new WebDriverWait(driver,10);
		WebElement btn2 = Wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("sf-with-ul")));
		btn2.click();
		System.out.println("Opened Dresses Section");
		
		//Select item from the dresses
		WebElement dress2=driver.findElement(By.linkText("Printed Dress"));
		dress2.click();
		System.out.println("Printed Dress Selected");
	
	
		//Add Printed Dress to wishlist
		WebElement wish=driver.findElement(By.id("wishlist_button"));
		wish.click();
		System.out.println("Print dress added to wishlist");
	
		//Close PopUp window or back to printed dress screen
		WebElement close =driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']"));
		close.click();
		System.out.println("Pop Got closed");
		
		//Click On Sign in to Log In into the account
		WebElement signin=(driver.findElement(By.className("login")));
		Thread.sleep(3000);
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
		WebElement login=driver.findElement(By.id("SubmitLogin"));
		login.click();
		System.out.println("Logged in ");
			
		//Click On add to My Wishlist
		WebElement wishlist =(driver.findElement(By.xpath("//span[contains(text(),'My wishlists')]")));
		wishlist.click();
		System.out.println("Wishlist is opened");
		
		//Enter The name of Dress in Wishlist and click save
		WebElement enter=(driver.findElement(By.id("name")));
		enter.sendKeys("Printed Dress");
		System.out.println("Printed Dress name got entered");
		
		WebElement save=(driver.findElement(By.xpath("//button[@id='submitWishlist']//i[@class='icon-chevron-right right']")));
		save.click();
		System.out.println("Clicked on save button");
		
		// Move To Womens section again
		WebElement women=(driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")));
		women.click();
		System.out.println("Clicked on womens section");
		
		//Select Dresses section
		WebElement dresses=(driver.findElement(By.xpath("//ul[@class='clearfix']//li[2]//div[1]//a[1]//img[1]")));
		dresses.click();
		System.out.println("Clicked On Dresses section");
		
		//Select Printed summer Dress
		WebElement summer=(driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line']//img[@class='replace-2x img-responsive']")));
		summer.click();
		System.out.println("Summer Dress got selected");
		
		//Click on add to cart
		WebElement submit1 =driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		submit1.click();
		System.out.println("Item added to the cart");
	
		
		//Proceed to final Checkout
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(".//a[contains(@title,'Proceed to checkout')]")).click();
	
		System.out.println("Clicked on Checkout");
		
		
	}
}
