package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\test\\Desktop\\result.xlsx");
		 String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
        System.out.println(data);
        
        
        
        FileInputStream file1 = new FileInputStream("C:\\Users\\test\\Desktop\\result.xlsx");
		 boolean data1 = WorkbookFactory.create(file1).getSheet("Sheet2").getRow(1).getCell(1).getBooleanCellValue();
		
       System.out.println(data1);	
	}

}
