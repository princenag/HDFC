package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
driver.get("https://www.amazon.in/");
	


   java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
int count=links.size();
System.out.println(count);

for (WebElement we: links) {
	String text=we.getText();
	System.out.println(text);
}

	}

}
