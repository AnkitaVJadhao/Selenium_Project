package HandleExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel6 {

	public static void main(String[] args) throws IOException {
		FileInputStream myfile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		Workbook myworkbook=WorkbookFactory.create(myfile);
		
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		int lastRowNum = mySheet.getLastRowNum();
		int totalNumOfRows= lastRowNum;
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		int totalNumOfCells = lastCellNum-1;
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
		
		      for(int j=0;j<=totalNumOfCells;j++)
		      	{
		    	  	String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		    	  	System.out.print(value+" ");
		      	}
		      		System.out.println();
		}	

	}

}
