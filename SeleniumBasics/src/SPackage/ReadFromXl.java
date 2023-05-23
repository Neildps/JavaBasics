package SPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadFromXl {
	
	String xlFilePath = "C:\\Users\\dasne\\OneDrive\\Documents\\userBase.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public static void excel(String xlFilePath) 
	{
			try {
				FileInputStream fis = new FileInputStream(xlFilePath);
				wb = new XSSFWorkbook(fis);
				sheet = wb.getSheetAt(0);
			} 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	
	public void readSheetData() {
		Iterator<Row> rows = sheet.iterator();
		while (rows.hasNext())
		{
			Row currRow = rows.next();
			Iterator<Cell> cells = currRow.cellIterator();
			
			while (cells.hasNext()) 
			{
				Cell currCell = cells.next();
				String c = currCell.getValue();			
				System.out.println(c);
			}
		}
	}

	public static void main(String[] args) {
		excel xl = new excel();
		xl.readSheetData();

	}

}
