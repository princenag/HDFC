package qsp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class fetch_fromfile {
	
	@Test
	/*public void test_property() throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		String value=p.getProperty("iw");
		System.out.println(value);
	}*/
	public void data (String path,String key) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		String value=p.getProperty(key);
		System.out.println(value);
		
		
		
		
	}

}
