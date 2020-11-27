package expertron;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Videobot extends LaunchBB{
  @Test
  public void bot() {
	  driver.findElement(By.xpath("//a[contains(text(),'Educación Continua')]")).click();
	  System.out.println(driver.getCurrentUrl());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://educacioncontinua.uees.edu.ec/","invalid page");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  Videobot vb=new Videobot();
	  vb.hitUrl2();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
