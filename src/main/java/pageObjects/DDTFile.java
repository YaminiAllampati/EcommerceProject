package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDTFile {
	
	public static String us1, ps1, us2, ps2, nm,mobnum,pcode;
	
	public void TestCrentials() throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\amazonProject1\\DDT_Amazon\\TestData.xlsx");
	     Workbook w =WorkbookFactory.create(f);
	     //valid credentials
	    us1 = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue());
	     ps1 = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue());
	     
	     //in- valid credentials
	     us2 = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue());
		  ps2 = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
			
		   // String pswrd1 = w.getSheet("Sheet1").getRow(1).getCell(1).toString();
			//System.out.println(usr);
			//System.out.println(pswrd1);
			//return us;
	}
	/*public void pswrd(String ps) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\amazonProject1\\DDT_Amazon\\TestData.xlsx");
	     Workbook w =WorkbookFactory.create(f);
	     ps = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue());
		   // String pswrd1 = w.getSheet("Sheet1").getRow(1).getCell(1).toString();
			//System.out.println(usr);
			//System.out.println(pswrd1);
		//	this.ps = ps;
	} */

	public void editAddressDetails() throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Java-Selenium-Projects\\amazonProject1\\DDT_Amazon\\TestData.xlsx");
	     Workbook w =WorkbookFactory.create(f);
	     //valid credentials
	   // nm = w.getSheet("Addressdetails").getRow(1).getCell(0).getStringCellValue();
	    /* Sheet sheet = w.getSheet("Addressdetails"); 
	     if (sheet == null)
	     { 
	    	 throw new IllegalArgumentException("Sheet 'Addressdetails' not found in the workbook.");
	     }*/
	      nm = w.getSheet("Addressdetails").getRow(1).getCell(0).getStringCellValue();
	     mobnum = NumberToTextConverter.toText(w.getSheet("Addressdetails").getRow(1).getCell(1).getNumericCellValue());
	       pcode = NumberToTextConverter.toText(w.getSheet("Addressdetails").getRow(1).getCell(2).getNumericCellValue());
	//	  ps2 = NumberToTextConverter.toText(w.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue());
			
		   // String pswrd1 = w.getSheet("Sheet1").getRow(1).getCell(1).toString();
			//System.out.println(usr);
			//System.out.println(pswrd1);
			//return us;
	}  

}
