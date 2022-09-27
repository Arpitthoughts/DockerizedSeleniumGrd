package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//Define desired capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN10);
		
		ChromeOptions options =new ChromeOptions();
		options.merge(cap);
		
		
		String hubUrl="http://192.168.201.158:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
		

	}

}

