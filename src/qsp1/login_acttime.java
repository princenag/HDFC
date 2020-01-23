package qsp1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login_acttime extends Generic_test {
	@Test
	/*public void testlogin() {
		driver.findElement(By.id("email")).sendKeys("princenagendra7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pursuit");
		driver.findElement(By.id("u_0_b")).click();
		String s1 = driver.getTitle();
		System.out.println(s1);
		
		//Assert.assertEquals(s1, "Facebook");
		//System.out.println("123");
		
		
	   SoftAssert s2=new SoftAssert();
	   s2.assertEquals(s1,"Facebook");
	   System.out.println("12");
	   s2.assertAll();
	   
	   
	 //  count of links
	   
	   java.util.List<WebElement> linkcount=driver.findElements(By.xpath("//a"));
	   System.out.println(linkcount.size());
	   
	   for(WebElement wb: linkcount) {
		   System.out.println(wb.getText());
	   }*/
	
	public void usernamlogin() throws InterruptedException {
		driver.findElement(By.name("identifier")).sendKeys("nagendrrks");
		
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.name("password")).sendKeys("Putani1994");
		
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//div[.='Compose'])[3]")).click();
		
		Thread.sleep(30000);

		driver.findElement(By.name("to")).sendKeys("nagendrrrks@gmail.com");
		Thread.sleep(5000);

		driver.findElement(By.name("subjectbox")).sendKeys("demo autoation");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Hi Im nagendra, have 3 years of IT experience,,munde en andre im searching for a girl so soumya!!!!! ");
		Thread.sleep(3000);

		driver.findElement(By.id(":oq")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a [.='Sent']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span [@id=':q3']")).click();
		
		
		 java.util.List<WebElement> linkcount= driver.findElements(By.xpath("//a"));
		 
		 ArrayList<String> b1=new ArrayList<String>();
		 
		
	int count=linkcount.size();
	System.out.println(count);
	
	for(WebElement wh: linkcount) {
		String r1=wh.getText();
		b1.add(r1);
		Collections.sort(b1,Collections.reverseOrder());
	}
	for(String t:b1) {
		System.out.println(t);
	}
		}
		
		
}


