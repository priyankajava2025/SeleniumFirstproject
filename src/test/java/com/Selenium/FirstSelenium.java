package com.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
 static WebDriver driver; // variable which is inside a class and outside a method it is instance variable
	public static void main(String[] args) {
driver=new ChromeDriver()	;	
//driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.redbus.in");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(0));

	}

}
