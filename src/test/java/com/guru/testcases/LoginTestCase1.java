package com.guru.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase1 {
	
	WebDriver driver;
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanij\\Downloads\\Work\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		

		
	}

	@Test
	public void login()
	{
		driver.get("http://www.gamil.com/");
	}
	
}
