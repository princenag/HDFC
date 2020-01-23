package qsp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginpage {
	
	@FindBy(id="email")
	private WebElement utbox;
	
	@FindBy(id="pass")
	private WebElement passtbox;
	
	@FindBy(id="loginbutton")
	private WebElement cclick;
	
	public FbLoginpage(WebDriver driver) {
		PageFactory.initElements((WebDriver) driver, this);
	}
	
	
	public void setusrnam(String un) {
		utbox.sendKeys(un);
	}
	public void setpassrd(String ps) {
		passtbox.sendKeys(ps);
	}
	public void clicklogin() {
		cclick.click();
	}
}
