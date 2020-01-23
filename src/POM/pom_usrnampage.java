package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_usrnampage {

	@FindBy(name="identifier")
	private WebElement utbox;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement nextclick;
	
	public pom_usrnampage(WebDriver driver) {
		PageFactory.initElements((WebDriver) driver, this);
	}
	
	
	public void setusrnam(String un) {
		utbox.sendKeys(un);
	}
	public void clicknext() {
		nextclick.click();
	}
}
