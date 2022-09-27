package Browserclasses;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basepackage.TestBase;

public class two extends TestBase {

	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		
		intialize("firefox");
		
		}
	
	@Test
	public void openbrowser() {
		
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		
	}

	
}
