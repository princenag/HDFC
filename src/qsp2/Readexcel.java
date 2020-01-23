package qsp2;
import java.io.File; 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream  fis = new FileInputStream("./Excel/Name.xlsx");
Workbook wb= new WorkbookFactory().create(fis);
org.apache.poi.ss.usermodel.Sheet sh= wb.getSheet("Sheet1");

 		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String r=cell.getStringCellValue();
		System.out.println(r);
		
		
	}

}
