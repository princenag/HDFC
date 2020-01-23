package qsp3;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel_exe {

@Parameters ({"city","country"})
@Test
public void type_cast(String city,String country) {
	Reporter.log(city, true);;
	Reporter.log(country, true);
}

}
