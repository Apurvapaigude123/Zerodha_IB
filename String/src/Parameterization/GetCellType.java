package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\test\\Desktop\\mayur1.xlsx");
		CellType data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getCellType();
		System.out.println(data);
	}
}
