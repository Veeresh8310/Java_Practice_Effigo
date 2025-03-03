package Monday_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"//Test//Dynamic_data_wite.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Sheet 1");
//		
		//static data writing
//		XSSFRow row1=sheet.createRow(0);
//		row1.createCell(0).setCellValue("Python");
//		row1.createCell(1).setCellValue("20");
//		row1.createCell(2).setCellValue("Automation");
//		
//		XSSFRow row2=sheet.createRow(1);
//		row2.createCell(0).setCellValue("Java");
//		row2.createCell(1).setCellValue("10");
//		row2.createCell(2)3.setCellValue("Automation");
//		
//		XSSFRow row3=sheet.createRow(2);
//		row3.createCell(0).setCellValue("C");
//		row3.createCell(1).setCellValue("15");
//		row3.createCell(2).setCellValue("Automation");
		
		//dynamic data writing
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no. of rows:");
		int row= sc.nextInt();
		
		System.out.println("Enter no. of cols:");
		int cols= sc.nextInt();
		
		System.out.println(row);
		System.out.println(cols);
		for(int i=0;i<=row;i++)
		{
			XSSFRow currow = sheet.createRow(i);
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell=currow.createCell(j);
				cell.setCellValue(sc.next());
			}
			System.out.println();
		}
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.println("Excel file is created");
		

	}

}
