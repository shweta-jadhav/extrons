package expertron;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Faq extends Launch{
  @Test
  public void FaqCheck() {
	  driver.findElement(By.xpath("//div[contains(text(),'FAQ')]")).click();
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	  System.out.println(driver.getCurrentUrl());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.expertrons.com/faqs/","Invalid Paage");
	  driver.findElement(By.xpath("//h4[contains(text(),' Academy+')]")).click();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  Faq fq=new Faq();
	  fq.hitUrl();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
