package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.codec.binary.Base32;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class EmalsPOM {

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[4]/a/span")
	public WebElement Customers;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a")
	public WebElement CustomerSub;

	@FindBy(xpath = "//*[@id=\"SearchEmail\"]")
	public WebElement EmailFeild;

	@FindBy(xpath = "//*[@id=\"SearchFirstName\"]")
	public WebElement FirstName;

	@FindBy(xpath = "//*[@id=\"SearchLastName\"]")
	public WebElement LastName;

	@FindBy(xpath = "//*[@id=\"SearchCompany\"]")
	public WebElement Company;

	@FindBy(xpath = "//*[@id=\"SearchIpAddress\"]")
	public WebElement IpAddress;

	@FindBy(xpath = "//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")
	public WebElement Regestered;

	@FindBy(xpath = "/html/body/div[3]/div[3]/div/form[1]/div[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div")
	public WebElement CustomerRole;

	@FindBy(xpath = "//*[@id=\"search-customers\"]")
	public WebElement Button;
	
	@FindBy (xpath = "/html/body/div[3]/div[3]/div/form[1]/div[2]/div/div/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/input")
	public WebElement Search;
	
	@FindBy (id = "SearchMonthOfBirth")
	public WebElement Month;
	
	@FindBy (id = "SearchDayOfBirth")
	public WebElement Day;
	

	public EmalsPOM (WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
		

}