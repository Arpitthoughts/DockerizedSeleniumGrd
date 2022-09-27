package Basepackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	public DesiredCapabilities cap= new DesiredCapabilities();
	public WebDriver driver;
	
	public void intialize(String browserName) throws MalformedURLException {
		
		if(browserName.equals("chrome")) {
			
			cap.setBrowserName("chrome");
		}
		else if(browserName.equals("firefox")) {
		cap.setBrowserName("firefox");	
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);
	}

}
