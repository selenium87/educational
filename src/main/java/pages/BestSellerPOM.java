package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPOM {
	@FindBy(xpath = "//body[@class='skin-blue sidebar-mini']/div[@class='wrapper']/div[@class='main-sidebar']/div[@class='sidebar']/ul[@class='sidebar-menu tree']/li[9]/a[1]")
	private WebElement mainHeading;

	@FindBy(xpath = "//span[contains(text(),'Bestsellers')]")
	private WebElement subHeading;

	@FindBy(id = "StartDate")
	private WebElement startdate;
	
	@FindBy(id = "EndDate")
	private WebElement endDate;
	
	@FindBy(id = "StoreId")
	private WebElement storeid;
	
	@FindBy(id = "OrderStatusId")
	private WebElement orderid;
	
	@FindBy(id = "PaymentStatusId")
	private WebElement payid;
	
	@FindBy(id = "CategoryId")
	private WebElement categoryid;
	
	@FindBy(id = "ManufacturerId")
	private WebElement manufacid;
	
	@FindBy(id = "BillingCountryId")
	private WebElement countryid;
	
	@FindBy(id = "VendorId")
	private WebElement vendorid;
	
	@FindBy(id = "search-salesreport")
	private WebElement searchbtn;

	public BestSellerPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement mainhd() {
		return mainHeading;
	}

	public WebElement subhd() {
		return subHeading;
	}
	
	public WebElement startdt() {
		return startdate;
	}
	
	public WebElement enddt() {
		return endDate;
	}
	
	public WebElement store() {
		return storeid;
	}
	
	public WebElement order() {
		return orderid;
	}
	
	public WebElement paymnt() {
		return payid;
	}
	
	public WebElement category() {
		return categoryid;
	}
	
	public WebElement manufac() {
		return manufacid;
	}
	
	public WebElement country() {
		return countryid;
	}
	
	public WebElement vendor() {
		return vendorid;
	}

	public WebElement pushsearch() {
		return searchbtn;   
	}

}
