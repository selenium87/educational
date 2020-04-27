package execution;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.Home;
import pages.Shipment;


public class ShipmentTest extends Base{
	
	//Properties pr = new Properties();
	//Drd d = new Drd();
	
	static private Logger log = LogManager.getLogger(ShipmentTest.class.getName());
  
@Test(priority = 0)

	public void shipments() {
	
	Home h = new Home(driver);
	
	h.sales().click();
	log.info("clicked on sales");
	h.shipment().click();
	log.info("clicked on shipment");
}



@Test(priority = 2, dataProvider = "datas") 
	public void view(String a, String b) throws InterruptedException {
	

		Home h = new Home(driver);
		Shipment sh = new Shipment(driver);
		
		
		WebElement ee = driver.findElement(By.id(a));
		try {
			Select ss = new Select(ee);
			ss.selectByVisibleText(b);
			log.info("selected");
		}
	
		catch(Throwable e) {
			ee.sendKeys(b);
		log.info("key sent");
		}
		sh.search().click();
		log.info("clicked on search");
		
		//sh.startdate().sendKeys(a);
		//sh.enddate().sendKeys(a);;
}
	
@DataProvider(name="datas")
public Object[][] data() {
	return new Object[][] {
	new Object[] {"StartDate","3/13/2017 6:20:10 AM"},
	new Object[] {"EndDate","3/13/2017 6:20:10 AM"},
	new Object[] {"CountryId","United States"},
	new Object[] {"StateProvinceId","*"}
};

}

@Test(priority = 3)
public void track() throws FileNotFoundException, IOException {
	Shipment sh = new Shipment(driver);
	Home h = new Home(driver);
	//pr.load(d.dat());
	sh.view().click();
	sh.trackinngnumber().sendKeys(prp.getProperty("track"));
	sh.settrackingid().click();
	h.shipment().click();
	
	
}


@Test(priority = 4,dataProvider = "data2")
public void secondsearch(WebElement f, String s) {
	Shipment sh = new Shipment(driver);
	//WebElement rr=driver.findElement(By.id(f));
	
	try {
		Select tt= new Select(f);
		tt.selectByVisibleText(prp.getProperty(s));
		
	} catch (Exception e) {
		f.sendKeys(s);
	}
	sh.search().click();
}
@DataProvider(name="data2")
public Object[][] data2() {
	Shipment sh = new Shipment(driver);
	return new Object[][] { 
		new Object[]{sh.startdate(), prp.getProperty("sdate")},
		new Object[]{sh.enddate(),prp.getProperty("edate")},
		new Object[]{sh.trackinngnumber(),prp.getProperty("track")},
		new Object[]{sh.country(),prp.getProperty("country")} 
		
	};
	
	

	
	
	
}
	
	

 



 
}






