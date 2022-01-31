package assessment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchDeletedUser {
 @Test
  
  public void SearchDeleted() {
	  SetUp.driver.findElement(By.id("searchSystemUser_userName")).clear();
	  SetUp.driver.findElement(By.id("searchSystemUser_userName")).sendKeys(Inputvalues.UserName);
	  
	  
	  SetUp.driver.findElement(By.id("searchBtn")).click();
  }
  
}
