package org.seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot {
	
	public static void main(String[]args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://dems.tvs.in/login");
		
		driver.findElement(By.name("username")).sendKeys("33992");
		driver.findElement(By.id("password")).sendKeys("21-11-1995");
		driver.findElement(By.xpath("(//button[@type ='submit'])[1]")).click();
		
		Thread.sleep(3000);
	  TakesScreenshot tk = (TakesScreenshot)driver;
	  File source = tk.getScreenshotAs(OutputType.FILE);
	  File target = new File("C:\\Users\\raviv\\OneDrive\\Desktop\\ravi.png");
	  FileHandler.copy(source, target);
	
	  driver.close();
	}

}
