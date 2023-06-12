package org.seleniumbasics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy_Xpath {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("porur");
		
		//Thread.sleep(3000);
			WebElement location = driver.findElement(By.xpath("//span[text()='Porur, Chennai, Tamil Nadu, India']"));
		location.click();
		
		//Thread.sleep(3000);		
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		//Thread.sleep(2000);		

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chicken Biryani");

		//Thread.sleep(2000);		

		WebElement Chickenbiryani = driver.findElement(By.xpath("(//div[text()='Dish'])[1]"));
		
		//Thread.sleep(2000);		

		Chickenbiryani.click();
		//Thread.sleep(2000);		
		
		driver.findElement(By.xpath("(//div[text()='By Namma Bhai Biryani'])[1]")).click();
		Thread.sleep(4000);		
		
		WebElement Add = driver.findElement(By.xpath("(//div[text()='ADD'])[1]"));	
		Thread.sleep(2000);		
		Add.click();
        
		WebElement viewcart = driver.findElement(By.xpath("//span[text()='Cart']"));

		viewcart.click();	 
		
		WebElement login = driver.findElement(By.xpath("//div[text()='LOG IN']"));
	     Thread.sleep(2000);	
		login.click();
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8248026608");
		
		
		WebElement login2 = driver.findElement(By.xpath("//a[text()='Login']"));
           login2.click();
           
            WebElement otp = driver.findElement(By.xpath("//input[@name='otp']"));
           Thread.sleep(10000);
           
           WebElement verify = driver.findElement(By.xpath("//a[text()='VERIFY OTP']"));
           Thread.sleep(5000);

           verify.click();
           
           WebElement addlocation = driver.findElement(By.xpath("//div[text()='Add New']"));
	       Thread.sleep(2000);
           addlocation.click(); 
	       
	       driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(" udaiyar block,Ramachandra hospital");
	       driver.findElement(By.xpath("//input[@name='landmark']")).sendKeys("ramachandra hospital");
	       Thread.sleep(2000);

	       WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
	       Thread.sleep(2000);
	       home.click();
	       
	       WebElement adress = driver.findElement(By.xpath("//a[text()='SAVE ADDRESS & PROCEED']"));
	       Thread.sleep(2000);
	       adress.click();
	       
	
	}

}