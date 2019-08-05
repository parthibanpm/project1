package excelvalues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.html.TableView.RowView;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\java\\xpath\\library\\data.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(fis);
Sheet sheet = wb.getSheetAt(0);
int usedRoesize = sheet.getPhysicalNumberOfRows();
for (int i = 0; i < usedRowsize; i++) {
	XSSFRow row = sheet.getActiveCell(i);
	int usedCellsize = Row.getPhysicalNumberOfCells();
	for (int j = 0; j < usedCellsize; j++) {
		XSSFCell cell = row.getCell(j);
		CellType cellType=cell.getCelltype();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
					}
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) d;
			String cellvalue = String.ValueOf(1);
			System.out.println(cellValues);
			
			
		}
		}
	
	
}


	}

}
