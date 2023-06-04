package com.example.testngdemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task01 {
	
	WebDriver driver;
  @Test
  
  public void checkTitle() {
	  
	  String expectedTitle = "Guest Registration Form – User Registration";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	     co.addArguments("--remote-allow-origins=*");
	     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver(co);
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	 driver.quit();
  }

}
