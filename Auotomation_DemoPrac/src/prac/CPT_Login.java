/**
 * 
 */
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
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author NEX4XHW
 *
 */
public class CPT_Login {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws Exception 
	 */
	
	  
  public static  WebDriver driver;
			
	//Execution Point to Run the Program
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
try
{
	//Set Gecko Driver Property
	System.setProperty("webdriver.gecko.driver", "C:\\Software\\Selenium WebDriver\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();

	ProfilesIni profileIni= new ProfilesIni();
					
	FirefoxProfile profile = profileIni.getProfile("Vikas ahuja");
	capabilities.setCapability("firefox_profile", profile);
	driver=new FirefoxDriver(capabilities);
	
	//Initialize Driver 
	//driver = new FirefoxDriver();

		
		//Maximize the window
		//driver.manage().window().maximize(); // Only work with the firefox version 47.5 , not work with Greater than
		
		//Maximize the window
		//driver.manage().window().setSize(new Dimension(1500,1080)); //used with selenium 3.0 version with  gecoke driver
		
 
	  //Implicit Wait	
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   
       //Go to the Application URL
       driver.get("http://digitaldata-iad-qa-createproducttool.krjmetaukb.us-east-1.elasticbeanstalk.com");
       
       Thread.sleep(5000);
       
       System.out.println(driver.getTitle());
       
       //Alert alert = driver.switchTo().alert();
      // String alertText = alert.getText();
      // System.out.println("Alert data: " + alertText);
      // alert.accept();
       
    // Handle Window Based PopUp using Robot Class
       Robot rb = new Robot();
      
       Thread.sleep(2000);
       
       //Enter user name
       StringSelection username = new StringSelection("vikas.ahuja@pb.com");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_CONTROL);
       
       //Sleep
       //Thread.sleep(2000);
       
       //Tab to password entry field
       rb.keyPress(KeyEvent.VK_TAB);
       rb.keyRelease(KeyEvent.VK_TAB);
      
       //Sleep
       Thread.sleep(1000);

       //Enter password
       StringSelection pwd = new StringSelection("BowesPitney@2017");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_V);
       rb.keyRelease(KeyEvent.VK_CONTROL);
       Thread.sleep(1000);
      
       //press enter
       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);
    
       
       Thread.sleep(2000);
       
       System.out.println(driver.getCurrentUrl()+ " " + driver.getTitle());
       Thread.sleep(2000);
       
       
       String text = driver.findElement(By.xpath("//*/div[@class='welcome-item-head']")).getText();
       System.out.println(text);

       
}
catch(UnhandledAlertException e)
{
	 Alert alert = driver.switchTo().alert();
     String alertText = alert.getText();
     System.out.println("Alert data: " + alertText);
    
     
  // Handle Window Based PopUp using Robot Class
     Robot rb = new Robot();
    
     Thread.sleep(2000);
     
     //Enter user name
     StringSelection username = new StringSelection("vikas.ahuja@pb.com");
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_CONTROL);
     
     //Sleep
     //Thread.sleep(2000);
     
     //Tab to password entry field
     rb.keyPress(KeyEvent.VK_TAB);
     rb.keyRelease(KeyEvent.VK_TAB);
    
     //Sleep
     Thread.sleep(1000);

     //Enter password
     StringSelection pwd = new StringSelection("BowesPitney@2017");
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_V);
     rb.keyRelease(KeyEvent.VK_CONTROL);
     Thread.sleep(1000);
    
     alert.accept();
     //press enter
    // rb.keyPress(KeyEvent.VK_ENTER);
     //rb.keyRelease(KeyEvent.VK_ENTER);
  
     
     Thread.sleep(2000);
     
     alert.accept();
     
     Thread.sleep(2000);
     
     System.out.println(driver.getCurrentUrl()+ " " + driver.getTitle());
     Thread.sleep(2000);
     
     
     //String text = driver.findElement(By.xpath("//*/div[@class='welcome-item-head']")).getText();
    // System.out.println(text);
     
     String text = driver.findElement(By.xpath("//*/a/span[@class='visible-sm visible-md visible-lg']")).getText();
     System.out.println(text);
     
     //driver.findElement(By.id("signinButton"));
     
    driver.close();
     
     //driver.quit();
     
}

	}

	}


