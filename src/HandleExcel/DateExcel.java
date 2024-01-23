package HandleExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DateExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		String Date = myworkbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Date);
		
	}

}
