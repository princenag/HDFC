package qsp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_gmailusrnamandpasswrd {
	
	@Test
	public void gusernam() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
Gmaillogin_page fbl=new Gmaillogin_page(driver);


fbl.setusrnam("nagendrrks");
fbl.clicknext();

Thread.sleep(3000);

Gmaillogin_page fb2=new Gmaillogin_page(driver);


fb2.setpassrd("Putani1994");
fb2.clicknextagain();
	}

}
