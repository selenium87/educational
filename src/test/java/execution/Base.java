package execution;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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


@Listeners(utilities.ListenerClass.class)
public class Base {
public  WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void Startup(String browse) throws IOException {
	
	Home h= new Home(driver);
	
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
	
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		//h.nameMain().sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).sendKeys("admin");		
		//h.passMain().sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//h.loginButton().click();
	}
	
	public void screens(String string) throws IOException {
		
		String stamp =new SimpleDateFormat("E, MMM-dd-yyyy-HH-mm-ss").format(new Date());
	    File take =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(take,new File(System.getProperty("user.dir") + "\\screenshots\\"+string+stamp+".png"));
	}


	@AfterClass
	public void afterclass() {
		driver.close();
	}
	
	
}

	
	
	
	
	

