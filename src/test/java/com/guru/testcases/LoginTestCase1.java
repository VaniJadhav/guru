package com.guru.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginTestCase1 {
	
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("WebDriver.chromedriver.driver", "C:\\Users\\vanij\\Downloads\\Automation classes\\guru\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gamil.com/");
		
	}

}
