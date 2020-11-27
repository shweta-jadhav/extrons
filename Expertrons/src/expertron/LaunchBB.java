package expertron;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBB {
	static WebDriver driver;
	public void hitUrl2() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver(); 
driver.get("https://www.uees.edu.ec/grado/international/");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
System.out.println(driver.getCurrentUrl());	


}
	}
