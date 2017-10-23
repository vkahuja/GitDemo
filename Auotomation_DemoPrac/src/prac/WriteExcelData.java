package prac;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:/Software/Selenium WebDriver/poi-bin-3.17-beta1-20170701/poi-3.17-beta1/Test Data.xlsx");

		FileOutputStream fos = null;
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Credentials");
		
		XSSFRow row = null;
		
		XSSFCell cell = null;
		
		row = sheet.getRow(1);
		
		if(row == null)
		{
			row = sheet.createRow(1);
		}
		}
		
	}


