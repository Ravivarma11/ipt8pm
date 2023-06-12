package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class displayed {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement id= driver.findElement(By.id("email"));
		boolean displayed = id.isDisplayed();
		System.out.println(displayed);
		boolean enabled = id.isEnabled();
		System.out.println(enabled);
		boolean selected = id.isSelected();
		System.out.println(selected);
	}

}
