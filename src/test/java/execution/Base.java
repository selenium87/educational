package execution;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import pages.Home;
import utilities.Demo;


@Listeners(utilities.ListenerClass.class)
public class Base {



public WebDriver driver;
public Demo de= new Demo();
public Properties prp = new Properties();

	@BeforeClass
	@Parameters("browser")
	public void Startup(String browse) throws IOException {
	

	
	if (browse.contentEquals("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browse.contentEquals("firefox")) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
		else {
			System.out.println("please choose right browser");
		}
		prp.load(de.data());
		driver.get(prp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id(prp.getProperty("e"))).clear();
		driver.findElement(By.id(prp.getProperty("e"))).sendKeys(prp.getProperty("username"));
		driver.findElement(By.id(prp.getProperty("p"))).clear();
		driver.findElement(By.id(prp.getProperty("p"))).sendKeys(prp.getProperty("password"));	
		
		driver.findElement(By.xpath(prp.getProperty("login"))).click();
		
		
	}
	
	public void screens(String result) throws IOException {
		
		String stamp =new SimpleDateFormat("E, MMM-dd-yyyy-HH-mm-ss").format(new Date());
	    File take =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(take,new File(System.getProperty("user.dir") + "\\screenshots\\"+result+stamp+".png"));
	}

	@AfterClass
	public void afterclass() throws InterruptedException {
	
		driver.findElement(By.xpath(prp.getProperty("logout"))).click();
		Thread.sleep(3000);
		driver.close();
	}
	public void mysendkey (String xpath, String value)
	{
		//driver.findElement(By.xpath(prp.getProperty("xpsth"))).sendKeys(value);
	}
}

	
	
	
	
	

