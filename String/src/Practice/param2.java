package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class param2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\test\\Desktop\\result.xlsx");
		short data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	System.out.println(data);//colum size
	
	FileInputStream file1 = new FileInputStream("C:\\Users\\test\\Desktop\\result.xlsx");

	 int data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getLastRowNum();
	System.out.println(data1);//row size
	
	
	}

}
