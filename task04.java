package com.example.testngdemo1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task04 {
	WebDriver driver;

	@Test
	public void testcase01() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement user = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String originalURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(originalURL, currentUrl);
	}

	@Test(dependsOnMethods = "testcase01")
	public void testcase02() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		String original = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String current = driver.getCurrentUrl();

		Assert.assertEquals(original, current);

	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

	}

//  @AfterMethod
//  public void afterMethod() {
//	 
//  }	
//	 

}
