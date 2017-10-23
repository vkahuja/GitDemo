package prac;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Rb {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
		try {
			@SuppressWarnings("unused")
			Process process = runtime.exec("C:\\Windows\\notepad.exe D:\\Git Cmd\\Sample.txt");
			
			File encyptFile=new File("D:\\Git Cmd\\Sample.txt");
			System.out.println(encyptFile.canRead());
			
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("D:\\Git Cmd\\Sample.txt"));
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
			 
				   String line = null;
				   while ((line = br.readLine()) != null) {
					   
				       System.out.println(line);
				       
				       String ch = "node ./tools/seedReferenceData.js --fileName=./tools/data_format_list.xlsx --sheetName=dataFormat --apiName=dataFormats --hostUrl=http://digitaldata-iad-qa-digitaldata.fzawntstzu.us-east-1.elasticbeanstalk.com";
				       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				       StringSelection stringSelection = new StringSelection(ch);
				       clipboard.setContents(stringSelection , null);
				    
				       //control+C is for copying...
				       r.keyPress(KeyEvent.VK_CONTROL);
				       r.keyPress(KeyEvent.VK_C);
				       
				       r.keyRelease(KeyEvent.VK_C);
				       r.keyRelease(KeyEvent.VK_CONTROL);		
				       
				     //control+V is for pasting...
				       
				       r.keyPress(KeyEvent.VK_CONTROL);
				       r.keyPress(KeyEvent.VK_V);
				       
				       r.keyRelease(KeyEvent.VK_V);
				       r.keyRelease(KeyEvent.VK_CONTROL);
				   }
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
