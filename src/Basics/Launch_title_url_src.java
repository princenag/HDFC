package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class Launch_title_url_src {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println(title);

		String url=driver.getCurrentUrl();
		System.out.println(url);

		String src=driver.getPageSource();
		System.out.println(src);
		
		
	}

}
