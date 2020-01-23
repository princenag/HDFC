package Login1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logintwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
driver.get("https://www.amazon.in/");


   java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
int count=links.size();
System.out.println(count);

for(int i=0;i<count;i++)
{
WebElement we=links.get(i);
Point loc = we.getLocation();
System.out.println(loc);

int x= loc.getX();
int y=loc.getY();
System.out.println(x);
System.out.println(y);

	}

}
}