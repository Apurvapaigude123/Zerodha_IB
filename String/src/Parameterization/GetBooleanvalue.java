package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetBooleanvalue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\test\\Documents\\Copy of final1.xlsx");
		  boolean data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(3).getBooleanCellValue();
	System.out.println(data);
	}

}
