package Monday_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Data {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//Test//data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet1=workbook.getSheet("Sheet 1");
		int row= sheet1.getLastRowNum();
		int cols=sheet1.getRow(1).getLastCellNum();
		
		System.out.println(row);
		System.out.println(cols);
		for(int i=0;i<=row;i++)
		{
			XSSFRow currow = sheet1.getRow(i);
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell=currow.getCell(j);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		

	}

}
