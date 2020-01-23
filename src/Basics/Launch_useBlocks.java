package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_useBlocks {
	static {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();

	}

}
