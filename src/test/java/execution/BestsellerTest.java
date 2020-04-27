package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import pages.BestSellerPOM;



public class BestsellerTest extends Base{

	//Properties prop = new Properties();
	String run;
	
	@Test
	public void test1() {
		BestSellerPOM obj = new BestSellerPOM(driver);		
		obj.mainhd().click();
		obj.subhd().click();
	}
	
	@Test(dataProvider = "dp")
	public void test2(String var1, String var2) throws IOException {

	//	FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\utilities\\sayeedData.properties");
		//prop.load(ip);
		
		WebElement field = driver.findElement(By.id(var1));
		try {
			Select store = new Select(field);
			store.selectByVisibleText(prp.getProperty(var1+var2));}
		catch(Throwable e) {
			field.sendKeys(prp.getProperty(var1+var2));}
	}
	
	@Test
	public void test3() throws IOException {
		BestSellerPOM obj = new BestSellerPOM(driver);
		//screens("run"+run);
		obj.pushsearch().click();
	} 

	@DataProvider (name = "dp")
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "StartDate", run }, 
			new Object[] { "EndDate", run },			
			new Object[] { "StoreId", run }, 
			new Object[] { "OrderStatusId", run },
			new Object[] { "PaymentStatusId", run },
			new Object[] { "CategoryId", run },
			new Object[] { "ManufacturerId", run },
			new Object[] { "BillingCountryId", run },
			new Object[] { "VendorId", run }};
	}	
	
	public BestsellerTest(String run) {
		this.run = run;
	}
	
	public class factory{
		@Factory
		public Object[] factorydata(){
			return new Object[] {
					new BestsellerTest("2"),
					new BestsellerTest("1")};
		}
	}
	
}
