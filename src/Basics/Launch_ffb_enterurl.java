package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_ffb_enterurl {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.com");
	}
}
