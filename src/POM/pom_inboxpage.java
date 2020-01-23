package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_inboxpage {
	
	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement complogo;
	
	@FindBy(name="to")
	private WebElement toaddres;
	
	@FindBy(name="subjectbox")
	private WebElement subject;
	
	@FindBy(xpath="//div[@class='Am Al editable LW-avf tS-tW']")
	private WebElement body;
	
	@FindBy(id=":oq")
	private WebElement sendclick;
	
	@FindBy(xpath="//span[contains(@class,'gb_Ia gbii')]")
	private WebElement sigoutlogo;
	
	@FindBy(id="gb_71")
	private WebElement sigoutclick;
	
	@FindBy(xpath="//a [.='Sent']")
	private WebElement sent;
	
	
	public pom_inboxpage(WebDriver driver) {
		PageFactory.initElements((WebDriver) driver, this);
	}
	
	public void compose() {
		complogo.click();
	}
	public void to(String un) {

		toaddres.sendKeys(un);
	}
	public void subject(String un) {

		subject.sendKeys(un);
	}
	public void body(String un) {

		body.sendKeys(un);
	}
	
	public void send() {

		sendclick.click();
	}
	public void signlogo() {

		sigoutlogo.click();
	}
	public void signclick() {

		sigoutclick.click();
	}
	public void sent() {

		sent.click();
	}


}
