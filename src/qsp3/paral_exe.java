package qsp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paral_exe {
	
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void type_cast(String browser) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./softwares/Chromedriver.exe");
		if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
			driver.get("https://google.com");
		}
		else {
			driver=new ChromeDriver();
			driver.get("https://google.com");
		}
	}
	

}
