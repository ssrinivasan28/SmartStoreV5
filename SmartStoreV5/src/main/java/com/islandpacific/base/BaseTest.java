package com.islandpacific.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;

@BeforeTest

public void defInit() throws Exception
{
	
	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
	//	ChromeOptions options = new ChromeOptions();
	//driver.manage().window().setPosition(new Point(-1500, 0));
		Map<String, String> mobileEmulation = new HashMap<String, String>();

		//mobileEmulation.put("deviceName", "iPhone X");

		mobileEmulation.put("deviceName", "iPad");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

		driver = new ChromeDriver(chromeOptions);
		driver.get("http://newocs.islandpacific.com:8080/CloudPOS/QA/CloudPOS.jsp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.name("StoreId")).clear();
		driver.findElement(By.name("StoreId")).sendKeys("00777");
		driver.findElement(By.name("DeviceNumber")).clear();
		driver.findElement(By.name("DeviceNumber")).sendKeys("01");
		driver.findElement(By.name("ServerUrl")).clear();
		driver.findElement(By.name("ServerUrl")).sendKeys("VENICE");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@class= 'Dynakeys_1']")).click();
		Thread.sleep(7000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//td[@class='button']"))).build().perform();
		driver.findElement(By.xpath("//td[@class='button']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("001");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("001");
		Select skin = new Select(driver.findElement(By.id("skinId")));
		
		skin.selectByValue("80");
		driver.findElement(By.id("loginScBtn")).click();
		Thread.sleep(5000);
		
		
		
		for(int i=0;i<=3;i++)
		{
		try{
			Actions b = new Actions(driver);
			b.moveToElement(driver.findElement(By.xpath("//td[@class='confirmButton']"))).build().perform();
			driver.findElement(By.xpath("//td[@class='confirmButton']")).click();
		break;
		}
		
		catch(Exception e)
		{
		System.out.println("Exception-Element not found");
		}
		}
		
		/*
		 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); WebElement
		 * menuSales = driver.findElement(By.id("isc_4Q")); Actions c = new
		 * Actions(driver); c.moveToElement(menuSales).build().perform();
		 * menuSales.click(); WebElement btnCustomer =
		 * driver.findElement(By.xpath("//div[@id='isc_G']")); btnCustomer.click();
		 * WebElement txtCustomerSearch =
		 * driver.findElement(By.xpath("//input[@id='isc_23']"));
		 * txtCustomerSearch.clear(); txtCustomerSearch.sendKeys("Srinivasan");
		 * Thread.sleep(3000); txtCustomerSearch.sendKeys(Keys.ENTER);
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"isc_EStable\"]/tbody/tr[1]")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//div[contains(text(),'Select')]")).click();
		 * Thread.sleep(3000); WebElement txtSku =
		 * driver.findElement(By.xpath("//input[@id='isc_23']")); txtSku.clear();
		 * txtSku.sendKeys("0000115691"); txtSku.sendKeys(Keys.ENTER);
		 * Thread.sleep(5000); txtSku.clear(); txtSku.sendKeys("0000115725");
		 * txtSku.sendKeys(Keys.ENTER); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//div[@id='isc_9']")).click(); WebElement
		 * payMent = driver.findElement(By.xpath("//a[contains(text(),'Cash')]"));
		 * payMent.click(); Thread.sleep(2000); WebElement btnPay =
		 * driver.findElement(By.name("AmountPaid")); btnPay.sendKeys(Keys.ENTER);
		 * Thread.sleep(2000); WebElement btnEmail =
		 * driver.findElement(By.xpath("//div[contains(text(),'E-mail')]"));
		 * btnEmail.click(); Thread.sleep(2000); WebElement btnConfirm =
		 * driver.findElement(By.xpath("//div[contains(text(),'Confirm')]"));
		 * btnConfirm.click(); Actions a1 = new Actions(driver);
		 * a1.moveToElement(driver.findElement(By.xpath("//td[@class='button']"))).build
		 * ().perform(); driver.findElement(By.xpath("//td[@class='button']")).click();
		 * driver.quit();
		 * 
		 */
		





}



  @AfterTest
  
  public void defQuit() {
  
  driver.close();
  
  
  }
  
  }
 