package qsp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fbtestclass {

	@Test
	public void fblogin() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
FbLoginpage fbl=new FbLoginpage(driver);


fbl.setusrnam("princenagendra7@gmail.com");
fbl.setpassrd("pursuit");
fbl.clicklogin();
	}
	
	
}
