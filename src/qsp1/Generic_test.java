package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_test {
	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.facebook.com/");
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
		@AfterMethod
		public void closeappln()
		{
			driver.close();
		}

	}


