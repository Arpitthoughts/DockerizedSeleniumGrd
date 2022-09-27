package DockerTest;

import static org.openqa.selenium.remote.CapabilityType.BROWSER_NAME;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

public class SeleniumDocker {

	@Test(dataProvider="getData")
	public void localTest(String browser, String version) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(BROWSER_NAME, browser);
		cap.setVersion(version);
		

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://google.co.in");
		System.out.println("Title is : " + driver.getTitle());
		Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
		driver.quit();
	}

	
	@DataProvider(parallel=true)
	public Object[][] getData() {
	return new Object[][]
	{{"chrome","105.0"},{"firefox","104.0"},{"MicrosoftEdge","104.0"},{"chrome","105.0"}};
	}

	
	
}
