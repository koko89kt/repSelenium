package secondPAck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.testng.*;


public class NewTest {
	public String baseUrl = "http://www.google.com777777889999";
	public WebDriver driver = new FirefoxDriver(); 		
	
	
	
	@Test
	public void functionABC() {
		driver.get(baseUrl);
		String exp = "Google";
		String act = driver.getTitle();
		Assert.assertEquals(act, exp);	
		
		driver.findElement(By.id("sb_ifc0")).sendKeys("aaaaaaaa");
  }

}

