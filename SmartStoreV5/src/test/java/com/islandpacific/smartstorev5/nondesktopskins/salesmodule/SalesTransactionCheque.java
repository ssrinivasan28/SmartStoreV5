package com.islandpacific.smartstorev5.nondesktopskins.salesmodule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.islandpacific.base.BaseTest;

public class SalesTransactionCheque extends BaseTest{
	



@Test (priority =1)

public void defSalesTransactionCheque() throws Exception {
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	WebElement menuSales = driver.findElement(By.id("isc_4Q"));
	Actions c = new Actions(driver);
	c.moveToElement(menuSales).build().perform();
	menuSales.click();
	WebElement btnCustomer = driver.findElement(By.xpath("//div[@id='isc_G']"));
	btnCustomer.click();
	WebElement txtCustomerSearch = driver.findElement(By.xpath("//input[@id='isc_23']"));
	txtCustomerSearch.clear();
	txtCustomerSearch.sendKeys("Srinivasan");
	Thread.sleep(3000);
	txtCustomerSearch.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"isc_EStable\"]/tbody/tr[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'Select')]")).click();
	Thread.sleep(3000);
	WebElement txtSku = driver.findElement(By.xpath("//input[@id='isc_23']"));
	txtSku.clear();
	txtSku.sendKeys("0000115691");
	txtSku.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	txtSku.clear();
	txtSku.sendKeys("0000115725");
	txtSku.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='isc_9']")).click();
	WebElement payMent = driver.findElement(By.xpath("//a[contains(text(),'Cheque')]"));
	payMent.click();
	Thread.sleep(2000);
	payMent.click();
	Thread.sleep(2000);
	WebElement btnPay = driver.findElement(By.name("AmountPaid"));
	btnPay.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	WebElement btnEmail = driver.findElement(By.xpath("//div[contains(text(),'E-mail')]"));
	btnEmail.click();
	Thread.sleep(2000);
	WebElement btnConfirm = driver.findElement(By.xpath("//div[contains(text(),'Confirm')]"));
	btnConfirm.click();
	Actions a1 = new Actions(driver);
	a1.moveToElement(driver.findElement(By.xpath("//td[@class='button']"))).build().perform();
	driver.findElement(By.xpath("//td[@class='button']")).click();
	//driver.close();
}

}
