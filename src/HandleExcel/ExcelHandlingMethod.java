package HandleExcel;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelHandlingMethod {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream myFile1=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		Sheet create = WorkbookFactory.create(myFile1).getSheet("Sheet1");
		//System.out.println(create);
		Row row1 = create.getRow(0);
	    Cell cell1 = row1.getCell(2);
	    CellType datatype = cell1.getCellType();
	    System.out.println(datatype);
	   
	}

}
