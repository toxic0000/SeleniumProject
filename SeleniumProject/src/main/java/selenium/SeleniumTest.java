package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest {

	public static void main(String[] args) {
		
		String rutaFirefox = System.getProperty("user.dir") + "\\firefoxDriver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", rutaFirefox);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jmsqa.schuff.com/#/job");
		


	}

}
