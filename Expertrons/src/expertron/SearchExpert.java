package expertron;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SearchExpert extends Launch{
  @Test
  public void ExpertSearch() {
	  driver.findElement(By.xpath("//div[contains(text(),' Search / All Expert ')]")).click();
	  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  
		  System.out.println(driver.getCurrentUrl());
		  Assert.assertEquals(driver.getCurrentUrl(), "https://app.expertrons.com/search","Invalid Page");
		  driver.findElement(By.xpath("//input[@name='textSearch']")).sendKeys("software Engineer");
		  //WebElement element=driver.findElement(By.xpath("//input[@name='textSearch']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  //js.executeScript("arguments[0].click", element);
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  
		  
		
		  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  SearchExpert se=new SearchExpert();
	  se.hitUrl();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
