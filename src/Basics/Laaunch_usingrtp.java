package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laaunch_usingrtp {

	public static void main(String[] args) {
	
		
			String key="webdriver.chrome.driver";
			String value="./softwares/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
		}
	}


