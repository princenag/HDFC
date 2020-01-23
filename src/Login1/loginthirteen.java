package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginthirteen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
driver.get("https://www.amazon.in/");
	


   java.util.List<WebElement> links = driver.findElements(By.tagName("input"));
int count=links.size();
System.out.println(count);

for(int i=0;i<count;i++) {
	WebElement we =links.get(i);
	we.click();
}
Thread.sleep(3000);
for(int i=count-1;i>=0;i--) {
	WebElement we =links.get(i);
	we.click();
}



	}

}

