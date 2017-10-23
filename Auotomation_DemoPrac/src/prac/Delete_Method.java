package prac;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Delete_Method {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Set Gecko Driver Property
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\Selenium WebDriver\\geckodriver-v0.18.0-win64\\geckodriver.exe");
  
		//Initialize Driver 
		WebDriver driver = new FirefoxDriver();
		
		//Maximize The Window
		//driver.manage().window().maximize(); -- work before with selenium 3.0
		driver.manage().window().setSize(new Dimension(1920,1080)); // 
 
	  //Implicit Wait	
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
       //Go to the Application URL
       driver.get("http://digitaldata-iad-ops-swaggerui.jwfmpbvbhf.us-east-1.elasticbeanstalk.com/");
       
       // Handle Window Based PopUp using Robot Class
       Robot rb = new Robot();
     
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
       Thread.sleep(2000);

       //Enter password by ctrl-v
       StringSelection pwd = new StringSelection("Bowe$DDD");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_CONTROL);

       //press enter
       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);

       //wait
       Thread.sleep(5000);
       
       
	}
}
