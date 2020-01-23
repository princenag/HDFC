package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import POM.pom_inboxpage;
import POM.pom_passwrdpage;
import POM.pom_usrnampage;

public class Script1 {
	
	@Test
	public void scrp1() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.manage().deleteAllCookies();
pom_usrnampage fbl=new pom_usrnampage(driver);
//FirefoxOptions f1=new FirefoxOptions("");


fbl.setusrnam("nagendrrrks@gmail.com");
fbl.clicknext();

Thread.sleep(3000);

pom_passwrdpage fb2=new pom_passwrdpage(driver);


fb2.setpassrd("Enfield09");
fb2.clicknextagain();
Thread.sleep(5000);

/*DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);      
WebDriver driver1 = new InternetExplorerDriver(capabilities);*/

pom_inboxpage fb3=new pom_inboxpage(driver);


fb3.signlogo();
fb3.signclick();

}
}