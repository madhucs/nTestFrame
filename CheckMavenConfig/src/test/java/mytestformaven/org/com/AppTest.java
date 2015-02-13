package mytestformaven.org.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    
   @Test(groups = {"smoke" })
   public void testPrintMessage4() {
      
      WebDriver driver = new FirefoxDriver();      
      driver.get("http://www.google.com");
      System.out.println("Page Title is " + driver.getTitle());
      Assert.assertEquals("Google", driver.getTitle());
      driver.quit();
 
   }

}