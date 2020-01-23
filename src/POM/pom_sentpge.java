package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_sentpge {
	
	@FindBy(xpath="//a")
private  List<WebElement> link;

	
	public pom_sentpge(WebDriver driver) {
		PageFactory.initElements((WebDriver) driver, this);
	}
	
	public void links() {
		System.out.println("no of linksin the sentitems are"+link.size());
	}
}
	
