package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellTypeWithIfelseif {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\test\\Desktop\\mayur1.xlsx");
	Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1);
	CellType CT = cellinfo.getCellType();
	
	if(CT==CellType.STRING) {
		System.out.println(cellinfo.getStringCellValue());
	}
	else if (CT==CellType.BOOLEAN) {
		System.out.println("given data is Boolean");
	}
	else if(CT==CellType.NUMERIC) {
		System.out.println(cellinfo.getNumericCellValue());
	}
	}

}
