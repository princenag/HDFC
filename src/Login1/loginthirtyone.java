package Login1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginthirtyone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.get("https://selenium.dev");
		// driver.findElement(By.id("t1"));
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 
		 Thread.sleep(3000);
		 for(int i=0; i<3;i++) {
			 js.executeScript("Window.ScrollBy(0,500)");
			 Thread.sleep(3000);
			 
			 
			 

		 }
		 for(int i=0; i<3;i++) {
			 js.executeScript("Window.ScrollBy(0,-500)");
			 Thread.sleep(3000);

		 }
		 
		 
	}

}
