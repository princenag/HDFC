package Login1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logineleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
driver.get("https://www.amazon.in/");


/*List <WebElement> link= driver.findElements(By.tagName("a"));
int count=link.size();
System.out.println(count);

for(int i=0;i<count;i++)
{
	WebElement we=link.get(i);
	//String text=we.getText();to get text of all links
	//String url=we.getAttribute("href"); to get url of all links
	//System.out.println(url);
	
	
}
*/	

List <WebElement> links= driver.findElements(By.tagName("img"));
int count1=links.size();
System.out.println(count1);

for(int i=0;i<count1;i++)
{
	WebElement we=links.get(i);
String image=we.getAttribute("src");
System.out.println(image);
}
}
}