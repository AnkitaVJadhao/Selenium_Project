package HandleExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelStudy {

	public static void main(String[] args) throws IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println("Row and column first data is "+value1);
		
		FileInputStream myfile1=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		double value2 = WorkbookFactory.create(myfile1).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println("Row first and column second data value is "+value2);
		
		FileInputStream myfile3=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		boolean value3 = WorkbookFactory.create(myfile3).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println("Row first and column third data value is "+value3);	

	}

}
