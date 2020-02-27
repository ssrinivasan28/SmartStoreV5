package com.islandpacific.smartstorev5.desktopskin.salesmodule;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sales {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//	ChromeOptions options = new ChromeOptions();
		//driver.manage().window().setPosition(new Point(-1500, 0));
		/*
		 * Map<String, String> mobileEmulation = new HashMap<String, String>();
		 * 
		 * mobileEmulation.put("deviceName", "iPhone X");
		 * 
		 * 
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		 */
		//	WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("http://newocs.islandpacific.com:8080/CloudPOS/QA/CloudPOS.jsp");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			for(int i=0;i<=3;i++)
			{
			try{
				driver.findElement(By.name("StoreId")).clear();
				driver.findElement(By.name("StoreId")).sendKeys("00777");
			break;
		
			}
			
			catch(Exception e)
			{
			System.out.println("Exception-Element not found");
			}
			}

			
		/*	driver.findElement(By.name("StoreId")).clear();
			driver.findElement(By.name("StoreId")).sendKeys("00777");*/
			
			driver.findElement(By.name("DeviceNumber")).clear();
			driver.findElement(By.name("DeviceNumber")).sendKeys("01");
			driver.findElement(By.name("ServerUrl")).clear();
			driver.findElement(By.name("ServerUrl")).sendKeys("VENICE");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//td[@class='Dynakeys_1']")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Actions a = new Actions(driver);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			a.moveToElement(driver.findElement(By.xpath("//td[@class='Dynakeys_1']"))).build().perform();
			driver.findElement(By.id("isc_4K")).click();
	
	
	
	
	
	
	
	
	
	
	}


}
