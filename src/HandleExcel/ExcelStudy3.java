package HandleExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy3
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mysheet = myWorkBook.getSheet("Sheet1");
		
		//Read whole Row 
		
		for(int i=0;i<=2;i++)
		{
			String values = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(values +" ");
		}
		System.out.println();
		
		//Read cell
		for(int i=0;i<=2;i++)
		{
			String values = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(values +" ");
		}
	}
}
