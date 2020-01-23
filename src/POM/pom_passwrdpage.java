package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_passwrdpage {
	@FindBy(name="password")
	private WebElement passtbox;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next1click;
	
	public pom_passwrdpage(WebDriver driver) {
		PageFactory.initElements((WebDriver) driver, this);
	}
	
	public void setpassrd(String ps) {
		passtbox.sendKeys(ps);
	}
	public void clicknextagain() {
		next1click.click();
	}
}
