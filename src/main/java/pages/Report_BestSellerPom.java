package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Report_BestSellerPom {
	@FindBy(xpath = "//body[@class='skin-blue sidebar-mini']/div[@class='wrapper']/div[@class='main-sidebar']/div[@class='sidebar']/ul[@class='sidebar-menu tree']/li[9]/a[1]")
	private WebElement mainHeading;

	@FindBy(xpath = "//span[contains(text(),'Bestsellers')]")
	private WebElement subHeading;

	@FindBy(id = "search-salesreport")
	private WebElement searchbtn;
	


	public Report_BestSellerPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement mainhd() {
		return mainHeading;
	}

	public WebElement subhd() {
		return subHeading;
	}

	public WebElement pushsearch() {
		return searchbtn;   
	}

}
