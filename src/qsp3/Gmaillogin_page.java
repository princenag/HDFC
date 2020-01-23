package qsp3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmaillogin_page {
	
	@FindBy(name="identifier")
	private WebElement utbox;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement nextclick;
	
	@FindBy(name="password")
	private WebElement passtbox;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement next1click;
	
	public Gmaillogin_page(WebDriver driver) {
		PageFactory.initElements((WebDriver) driver, this);
	}
	
	
	public void setusrnam(String un) {
		utbox.sendKeys(un);
	}
	public void clicknext() {
		nextclick.click();
	}
	public void setpassrd(String ps) {
		passtbox.sendKeys(ps);
	}
	public void clicknextagain() {
		next1click.click();
	}
}


