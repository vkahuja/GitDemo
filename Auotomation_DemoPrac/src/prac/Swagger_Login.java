package prac;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swagger_Login {

	 public static  WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try
		{
		//Set Gecko Driver Property
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\Selenium WebDriver\\geckodriver-v0.18.0-win64\\geckodriver.exe");
  
		//Initialize Driver 
		driver = new FirefoxDriver();
		
		//Maximize the window
		//driver.manage().window().maximize(); // Only work with the firefox version 47.5
		
		//Maximize the window
		//driver.manage().window().setSize(new Dimension(1820,1080)); //used with selenium 3.0 version with  gecoke driver
		
 
	  //Implicit Wait	
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
       //Go to the Application URL
       driver.get("http://digitaldata-iad-qa-swaggerui.jwfmpbvbhf.us-east-1.elasticbeanstalk.com/");
       Thread.sleep(2000);
       
       // Handle Window Based PopUp using Robot Class
       Robot rb = new Robot();
     
       //Thread.sleep(2000);
       
       Alert alert = driver.switchTo().alert();
	     String alertText = alert.getText();
	     System.out.println("Alert data: " + alertText);
		
       //Enter user name by ctrl-v
       StringSelection username = new StringSelection("p1tney");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_CONTROL);

       //Tab to password entry field
       rb.keyPress(KeyEvent.VK_TAB);
       rb.keyRelease(KeyEvent.VK_TAB);
       
       Thread.sleep(4000);

       //Enter password by ctrl-v
       StringSelection pwd = new StringSelection("Bowe$DDD");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_CONTROL);
       
       Thread.sleep(2000);
       
       
       alert.accept();
       //press enter
       //rb.keyPress(KeyEvent.VK_ENTER);
       //rb.keyRelease(KeyEvent.VK_ENTER);

       //wait
       Thread.sleep(5000);
       
       System.out.println(driver.getCurrentUrl());
       
       Thread.sleep(10000);
       
       driver.findElement(By.xpath("//*[@id='swagger-ui']/section/div[2]/div/div[2]/section/div/button")).click();
       Thread.sleep(5000);
       
       driver.findElement(By.xpath("//*[@id='swagger-ui']/section/div[2]/div/div[2]/section/div/div/div[2]/div/div/div[2]/div/form/div[1]/div/div[2]/section/input")).sendKeys("pitney");
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='swagger-ui']/section/div[2]/div/div[2]/section/div/div/div[2]/div/div/div[2]/div/form/div[1]/div/div[3]/section/input")).sendKeys("B@wesddd$");
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='swagger-ui']/section/div[2]/div/div[2]/section/div/div/div[2]/div/div/div[2]/div/form/div[2]/button")).click();
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='swagger-ui']/section/div[2]/div/div[2]/section/div/div/div[2]/div/div/div[1]/button")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='operations,get-/dataUserAccessManagement/users,UserAccessManagement']/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[2]/input")).sendKeys("1");
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='operations,get-/dataUserAccessManagement/users,UserAccessManagement']/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("24");
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='operations,get-/dataUserAccessManagement/users,UserAccessManagement']/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("TEST8_TESTING@MAILINATOR.COM");
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='operations,get-/dataUserAccessManagement/users,UserAccessManagement']/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[7]/td[2]/input")).sendKeys("1");
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//*[@id='operations,get-/dataUserAccessManagement/users,UserAccessManagement']/div[2]/div/div/div/div[3]/button[1]")).click();
       Thread.sleep(3000);
       
       //close the browser window
       driver.close();
       
		}
		
		catch(NoAlertPresentException e1)
		{ 
			System.out.println(e1);
		      
		}
	}

}
