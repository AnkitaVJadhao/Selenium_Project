package HandleExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel5 {

	public static void main(String[] args) throws IOException {
		FileInputStream myfile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		Workbook myworkbook=WorkbookFactory.create(myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		int totalNumberofRow = mySheet.getLastRowNum();
		System.out.println(totalNumberofRow);
		System.out.println("===========================");
		short totalNumOfCells = mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNumOfCells);
		

	}

}
