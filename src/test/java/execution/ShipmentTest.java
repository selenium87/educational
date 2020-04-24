package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import pages.Home;
import pages.Shipment;

public class ShipmentTest extends Base{
	//public Select se = new Select(driver.findElement(By.id("CountryId")));

@Test(priority = 0)

	public void shipments() {
	 
	Home h = new Home(driver);
	
	h.sales().click();
	h.shipment().click();
	
}
@Test(priority = 1)
public void shipmentsearch() throws Exception {
	 
	Shipment sh = new Shipment(driver);
	sh.startdate().sendKeys("3/13/2017");
	sh.enddate().sendKeys("3/14/2017");
	Thread.sleep(2000);
Select se = new Select(driver.findElement(By.id("CountryId")));
	se.selectByIndex(1);
	Thread.sleep(2000);
	sh.search().click();
	
	
	Thread.sleep(2000);
	sh.view().click();
}
@Test(priority = 2)
	public void view() throws InterruptedException {
		 Home h = new Home(driver);
			Shipment sh = new Shipment(driver);
		
	sh.trackinngnumber().sendKeys("505");
	sh.settrackingid().click();
	Thread.sleep(2000);
	sh.adminset().click();
	Thread.sleep(2000);
	sh.admincomment().sendKeys("please make sure package is packed well");
	Thread.sleep(2000);
	h.shipment().click();
	
	sh.startdate().clear();
	
	Thread.sleep(2000);
	Select se = new Select(driver.findElement(By.id("CountryId")));
se.selectByIndex(0);
	sh.search().click();
}

	

}
