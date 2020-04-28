package execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.EmalsPOM;

public class CustomerTest extends Base {

	@Test(priority = 1)
	public void withFirstSetOfData() throws IOException, InterruptedException {
		EmalsPOM pom = new EmalsPOM(driver);
		
		
		Thread.sleep(2000);
		pom.Customers.click();
		pom.CustomerSub.click();

		try {
			pom.EmailFeild.sendKeys(prp.getProperty("email1"));
			pom.FirstName.sendKeys(prp.getProperty("firstname1"));
			pom.LastName.sendKeys(prp.getProperty("lastname1"));
			Select selmonth = new Select(pom.Month);
			selmonth.selectByIndex(4);
			Select selday = new Select(pom.Day);
			selday.selectByIndex(12);
			pom.Company.sendKeys(prp.getProperty("company1"));
			pom.IpAddress.sendKeys("ipaddress1");
			pom.Regestered.click();
			for (int i = 0; i < 3; i++) {
				pom.Search.sendKeys(Keys.ARROW_DOWN);

			
			pom.Search.sendKeys(Keys.ENTER);}
			Thread.sleep(2000);
			pom.Button.click();
			Thread.sleep(3000);

		} catch (Exception e) {
			driver.findElement(By.xpath("//div[@class='icon-collapse']")).click();
		

		pom.EmailFeild.sendKeys(prp.getProperty("email1"));
		pom.FirstName.sendKeys(prp.getProperty("firstname1"));
		pom.LastName.sendKeys(prp.getProperty("lastname1"));
		Select selmonth = new Select(pom.Month);
		selmonth.selectByIndex(4);
		Select selday = new Select(pom.Day);
		selday.selectByIndex(12);
		pom.Company.sendKeys(prp.getProperty("company1"));
		pom.IpAddress.sendKeys("ipaddress1");
		pom.Regestered.click();
		
		
		for (int i = 0; i < 3; i++) {
			pom.Search.sendKeys(Keys.ARROW_DOWN);

		}
		pom.Search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		pom.Button.click();
		Thread.sleep(3000);}
	}

	@Test(priority = 2)

	public void withSecondSetOfData() throws IOException, InterruptedException {
		EmalsPOM pom = new EmalsPOM(driver);
	
		
		Thread.sleep(2000);
		pom.Customers.click();
		pom.CustomerSub.click();
		pom.EmailFeild.sendKeys(prp.getProperty("email2"));
		pom.FirstName.sendKeys(prp.getProperty("firstname2"));
		pom.LastName.sendKeys(prp.getProperty("lastname2"));
		Select selmonth = new Select(pom.Month);
		selmonth.selectByIndex(3);
		Select selday = new Select(pom.Day);
		selday.selectByIndex(20);
		pom.Company.sendKeys(prp.getProperty("company2"));
		pom.IpAddress.sendKeys("ipaddress2");
		pom.Regestered.click();
		for (int i = 0; i < 2; i++) {
			pom.Search.sendKeys(Keys.ARROW_DOWN);
		}
		pom.Search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		pom.Button.click();
		Thread.sleep(2000);

	}

}
