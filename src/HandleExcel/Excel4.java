package HandleExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel4 {

	public static void main(String[] args) throws IOException
	{
		//Read whole excel sheet
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\Ankita\\Downloads\\Book1.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		//read whole rows and column 
		//outer for loop :- row
		//inner for loop :- column
		
		for(int i=0;i<=2;i++)
		{
			//inner for loop 
			for(int j=0;j<=2;j++)
			{
				String values =mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(values +" ");
			}
			System.out.println();
		}
		
		
		

	}

}
