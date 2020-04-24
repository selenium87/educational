package execution;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Report_BestSellerPom;


public class Bestseller extends Base{

	Properties prop = new Properties();

	
	
	@Test
	public void test1() {
		Report_BestSellerPom obj = new Report_BestSellerPom(driver);		
		obj.mainhd().click();
		obj.subhd().click();
	}
	
	@Test(dataProvider = "dp")
	public void test2(String var1, String var2) throws IOException {

		WebElement field = driver.findElement(By.id(var1));
		try {
			Select store = new Select(field);
			store.selectByVisibleText(var2);}
		catch(Throwable e) {
			field.sendKeys(var2);}
	}
	
	@Test
	public void test3() throws IOException {
		Report_BestSellerPom obj = new Report_BestSellerPom(driver);
		screens();
		obj.pushsearch().click();
	}

	@DataProvider (name = "dp")
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "StartDate", "04/01/2020" }, 
			new Object[] { "EndDate", "04/30/2020" },			
			new Object[] { "StoreId", "Your store name" }, 
			new Object[] { "OrderStatusId", "Processing" },
			new Object[] { "PaymentStatusId", "Authorized" },
			new Object[] { "CategoryId", "Electronics >> Camera & photo" },
			new Object[] { "ManufacturerId", "Apple" },
			new Object[] { "BillingCountryId", "Pakistan" },
			new Object[] { "VendorId", "Vendor 2" }};
	}	
	
	
	
	
}
