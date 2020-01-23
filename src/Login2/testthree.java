package Login2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.description.type.TypeList.Generic;

public class testthree {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

//driver.get("https://www.flipkart.com/"); 
driver.get("https://www.google.com");
Genericphotos.getphoto(driver);

Thread.sleep(3000);
driver.get("https://www.facebook.com");
Genericphotos.getphoto(driver);


Thread.sleep(3000);
	}

}
