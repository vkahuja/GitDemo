package prac;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Rbt_Demo {
	
		 public static void main(String args[]) throws Exception
		 {
		 Robot r=new Robot();

		 r.setAutoDelay(200);

		 r.keyPress(KeyEvent.VK_WINDOWS);
		 r.keyPress(KeyEvent.VK_R);
		 r.keyRelease(KeyEvent.VK_R);
		 r.keyRelease(KeyEvent.VK_WINDOWS);

		 r.keyPress(KeyEvent.VK_C);
		 r.keyRelease(KeyEvent.VK_C); 

		 r.keyPress(KeyEvent.VK_M);
		 r.keyRelease(KeyEvent.VK_M);

		 r.keyPress(KeyEvent.VK_D);
		 r.keyRelease(KeyEvent.VK_D);

		 r.keyPress(KeyEvent.VK_ENTER);
		 
		 
		 }
		}
