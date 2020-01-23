package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logineighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
 WebDriver driver= new FirefoxDriver();
 driver.get("https://www.facebook.com");
 
 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Princenagendra7@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pursuit");
 driver.findElement(By.xpath("//input [@type='submit']")).click();
 String title=driver.getTitle();
 System.out.println(title);
 //if(title.equals())
 
 
 
 
	}

}
