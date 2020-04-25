package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {


	
	@FindBy(id = "Email")
	private WebElement loginName;
	
	@FindBy(id = "Password")
	private WebElement loginPass;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//*[text()='Sales']")
	private WebElement sa;

	@FindBy(xpath = "//span[text()='Shipments']")
	private WebElement ship;

	public Home(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	public WebElement nameMain() {
		return loginName;
	}
	
	public WebElement passMain() {
		return loginPass;
	}
	
	public WebElement loginButton() {
		return loginBtn;
	}
	
	public WebElement sales() {
		return sa;
	}

	public WebElement shipment() {
		return ship;
	}
}
