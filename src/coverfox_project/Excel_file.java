package coverfox_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_file
{
	
	public static String exceldata(String sheet,int row,int column) throws IOException
	 {
		 FileInputStream myFile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		 Sheet myWorkbook = WorkbookFactory.create(myFile).getSheet(sheet);
		 String data = myWorkbook.getRow(row).getCell(column).getStringCellValue();
		 return data;
		 
		 
	 }

}
