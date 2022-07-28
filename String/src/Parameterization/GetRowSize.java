package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowSize {
	 public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\test\\Documents\\Copy of final1.xlsx\\");
	      int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	    System.out.println(data + 1);	 
	 }
	}



