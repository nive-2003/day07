package com.example.testngdemo1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class task05 {
	
	WebDriver driver;
	
  @Test
  public void testcase01() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.get("https://www.godaddy.com/en-in/offers/godaddy?isc=INGDYGON1&countryview=1&currencyType=INR&cdtl=c_17587465578.g_141169705674.k_kwd-88659201.a_606438660853.d_c.ctv_g&bnb=b&gclid=Cj0KCQjwla-hBhD7ARIsAM9tQKuig2H7XVshcgbvkb322XVEWVB44aGRfdx3HgBhmKw9WyUZglXrOfwaAhxYEALw_wcB");
		driver.manage().window().maximize();
		System.out.println("Page title : "+driver.getTitle());
		Assert.assertEquals("GoDaddy | Buy Domain Names", driver.getTitle());
		String currentUrl = driver.getCurrentUrl();
		String actualUrl = "https://www.godaddy.com/en-in/offers/godaddy?isc=INGDYGON1&countryview=1&currencyType=INR&cdtl=c_17587465578.g_141169705674.k_kwd-88659201.a_606438660853.d_c.ctv_g&bnb=b&gclid=Cj0KCQjwla-hBhD7ARIsAM9tQKuig2H7XVshcgbvkb322XVEWVB44aGRfdx3HgBhmKw9WyUZglXrOfwaAhxYEALw_wcB";
		Assert.assertEquals(actualUrl, currentUrl);
		driver.close();
  }
  
  @Test
  public void testcase02() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(co);
		driver.get("https://www.godaddy.com/en-in/offers/godaddy?isc=INGDYGON1&countryview=1&currencyType=INR&cdtl=c_17587465578.g_141169705674.k_kwd-88659201.a_606438660853.d_c.ctv_g&bnb=b&gclid=Cj0KCQjwla-hBhD7ARIsAM9tQKuig2H7XVshcgbvkb322XVEWVB44aGRfdx3HgBhmKw9WyUZglXrOfwaAhxYEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
		
  }
  
  @Test
  public void testcase03() throws InterruptedException  {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(co);
	
		driver.get("https://www.godaddy.com/en-in/offers/godaddy?isc=INGDYGON1&countryview=1&currencyType=INR&cdtl=c_17587465578.g_141169705674.k_kwd-88659201.a_606438660853.d_c.ctv_g&bnb=b&gclid=Cj0KCQjwla-hBhD7ARIsAM9tQKuig2H7XVshcgbvkb322XVEWVB44aGRfdx3HgBhmKw9WyUZglXrOfwaAhxYEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
		System.out.println("Title of the page: "+driver.getTitle());
		
		String currentTitle = "GoDaddy Domain Search - Buy and Register Available Domain Names";
		Assert.assertEquals(driver.getTitle(), currentTitle);
		
		boolean isSearch = driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isDisplayed();
		System.out.println("Is search box displayed: "+ isSearch);
		
		boolean isEnabled = driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isEnabled();
		System.out.println("Is search box Enabled : "+ isEnabled);

		boolean isBuy = driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]/button\n")).isDisplayed();
		System.out.println("Is BuyIt displayed: "+ isBuy);
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
		search.sendKeys("mydomain");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement guru99seleniumlink;
		guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section[1]/section/section/div/div/section/div/div[1]/div/div/div[2]/button")));
		guru99seleniumlink.click();

		driver.findElement(By.xpath("//*[@id=\\\"8469f0c3-e08f-4343-9756-ce0390b0d581\\")).sendKeys("mydomain");
		
		driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]/button")).click();
		boolean isPrice = driver.findElement(By.xpath("//*[@id=\"mydomainshop.co_2\"]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/span[1]")).isDisplayed();
		System.out.println("Is price displayed : "+ isPrice);
		
  }
}
