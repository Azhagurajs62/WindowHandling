package FirstFloor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASection {
  private static final Alert Prompt = null;

public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	 // String fb = "https://www.facebook.com/";
//	  String fk = "https://www.flipkart.com/";
//	  String Amazon = "https://www.amazon.in/";
	  String alert = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
	  
	  
	//System.setProperty("webdriver.edge.driver","C:\\Users\\kamal\\eclipse-AlaguRaj\\java\\CollegeProject\\target\\msedgedriver.exe");
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver = new EdgeDriver();
	  driver.get(alert);
	 driver.manage().window().maximize();
	 //WebElement element = driver.findElement(By.xpath("//*[text()='Account & Lists']"));
     WebElement element= driver.findElement(By.id("email"));
     Actions a = new Actions(driver);

	 WebElement element1= driver.findElement(By.name("alert"));
	 element1.click();
	 Thread.sleep(5000);
	 Alert simple= driver.switchTo().alert();
	 simple .accept();
	 
	 WebElement e= driver.findElement(By.name("confirmation"));
	 e.click();
	 Thread.sleep(5000);
	 Alert conform = driver.switchTo().alert();
	 conform .dismiss();
	 
	 WebElement v = driver.findElement(By.name("prompt"));
	 v.click();
	 Thread.sleep(5000);
	 Alert prompt = driver.switchTo().alert();
	 prompt.sendKeys("Ajith");
	 //prompt.accept();
	// Thread.sleep(5000);
      String text = prompt.getText();
      System.out.println(text);
      
	 
	 
	 
	 
	 
	 

}
  
	
}

