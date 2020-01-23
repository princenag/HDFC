package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginseventeen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
//driver.get("https://www.amazon.in/");
		driver.get("file:///C:/Users/Rajendra Raaj/Desktop/txtbox.html");
	


   java.util.List<WebElement> links = driver.findElements(By.tagName("input"));
int count1=links.size();

 for(int i=0; i<count1 ;i=i+1) {
	WebElement c = links.get(i);
c.sendKeys("hello");
	
 }
 Thread.sleep(3000);
 for(int i=0; i<count1 ;i=i+1) {
	 WebElement d = links.get(i);
	 d.clear();
 }
 
	}

}
