package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SeleniumTest2Chrome {

	public static void main(String[] args) {
		
		//String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jpompa\\eclipse-workspace\\SeleniumProject\\chromedriver\\chromedriver.exe");
		
		
	    //WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.setExperimentalOption("useAutomationExtension", false);
	    options.addArguments("--remote-debugging-port=9225");
	    WebDriver driver = new ChromeDriver(options);


				
		driver.get("https://jmsuat.schuff.com/#/job");



	}
	
	

}
