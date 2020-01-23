package Login2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowpopup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Rajendra Raaj\\Desktop\\calc.exe");
	}

}
