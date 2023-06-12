package org.seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot_and_action_topics

{
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.nykaa.com/");

	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
		search.click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_P);
	
	r.keyPress(KeyEvent.VK_H);
	r.keyRelease(KeyEvent.VK_H);

	r.keyPress(KeyEvent.VK_O);
	r.keyRelease(KeyEvent.VK_O);

	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_N);

	r.keyPress(KeyEvent.VK_E);
	r.keyRelease(KeyEvent.VK_E);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	WebElement appliances = driver.findElement(By.xpath("(//li[@class='MegaDropdownHeadingbox'])[4]"));

	Actions ac = new Actions(driver);
	ac.contextClick(appliances).build().perform();
	
	System.out.println("Success");
	
	
}

}
