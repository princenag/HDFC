package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
//driver.get("https://www.amazon.in/");
		driver.get("file:///C:/Users/Rajendra Raaj/Desktop/chkbox.html");
	


   java.util.List<WebElement> links = driver.findElements(By.tagName("input"));
int count=links.size();
 for(WebElement b:links) {
	 b.click();
 }
 for(int i=count-1;i>=0;i--) {
	 WebElement w1=links.get(i);
	 //String text=w1.getText();
w1.click();
}
 

	}

}
