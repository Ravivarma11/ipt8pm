package org.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String S= "https://www.swiggy.com/";
		
		String replace = S.replace("swiggy","zomato");
		
		System.out.println(replace);
		
		if(S==replace) {
			driver.get(S);
		}
		else {
			
			driver.get(replace);
			driver.navigate().to(S);
			
			
		}
		
		
	}

}
