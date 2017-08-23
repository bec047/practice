package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver ;
		
	  @Test
	  public void f() {
		  
		  driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/2.53.0");
		  System.out.println("Tittle   :" + driver.getTitle());
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  
		  driver = new FirefoxDriver();
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

	}


