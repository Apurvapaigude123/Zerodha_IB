package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllCellDatatypewithforloop {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("C:\\Users\\test\\Desktop\\mayur1.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	  
	  for(int i=0;i<=sh.getLastRowNum();i++) {
		  for(int j=0;j<sh.getRow(i).getLastCellNum();j++) {
			  Cell Appu = sh.getRow(i).getCell(j);
			 CellType mayu = Appu.getCellType();
			 
			 if(mayu==CellType.STRING) {
				 System.out.print(Appu.getStringCellValue()+" "+"|");
			 }
			 else if (mayu==CellType.BOOLEAN) {
				 System.out.print(Appu.getBooleanCellValue()+" "+"|");
			 }
			 else if (mayu==CellType.NUMERIC) {
				 System.out.print(Appu.getNumericCellValue()+" "+"|");
			 }
		  }
		  System.out.println();
	  }
	}

}
