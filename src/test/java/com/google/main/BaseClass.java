package com.google.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

WebDriver driver;	
	public void launchBrowser() {
	
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
			
	}
	
	public void openURL(String url) {
		driver.get(url);
	}
	
	public void tap (WebElement element) {
		
		element.click();
		
	}
	
	public void closeBrowser () {
		driver.quit();
				
	}
	
	public void screenShot (String path) {
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("welcome for a change in newfirstproject");
	}
}
