package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logineight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

	//driver.get("file:///C:/Users/Rajendra Raaj/Desktop/ad1.html");
		driver.get("https://www.google.com/");

WebElement  ele= driver.findElement(By.xpath("//a[@class='gb_g' and @data-pid='2']"));
//String v = ele.getText();   get text method
//System.out.println(v);

 //Point loc = ele.getLocation(); to get getlocation x-ycorordinate
//System.out.println(loc);

/*int v=ele.getSize().getHeight(); to get height and width
System.out.println(v);

int u =ele.getSize().getWidth();
System.out.println(u);*/

	}

}
