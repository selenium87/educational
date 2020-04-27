package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipment {
@FindBy(id="StartDate")
private WebElement sdate;

@FindBy(id="EndDate")
private  WebElement edate;
@FindBy(id="CountryId")
private WebElement count;
@FindBy(id="search-shipments")
private WebElement sear;

@FindBy(xpath="(//*[@class=\"btn btn-default\"])[1]")
private WebElement vie;

@FindBy (id="TrackingNumber")
private WebElement track;
@FindBy (id="AdminComment")
private WebElement adm;
@FindBy(xpath="//*[@name='setadmincomment']")
private WebElement adset;
@FindBy (xpath="//button[@name='settrackingnumber']")
private WebElement strack;
public Shipment(WebDriver driver){
	
	PageFactory.initElements(driver, this);
	
	
}
public WebElement startdate() {
	return sdate;
}

public WebElement enddate() {
	return edate;
	
	
}
public WebElement country() {
	return count;
}
public WebElement search() {
	return sear;
}
public WebElement view() {
	return vie;
}
public WebElement trackinngnumber() {
		
		return track;
	}
public WebElement admincomment() {
		return adm;
	
}
public WebElement adminset() {
		return adset;
	}
public WebElement settrackingid() {
		return strack;
	}
}
