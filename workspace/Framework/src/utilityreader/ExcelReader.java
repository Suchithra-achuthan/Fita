package utilityreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelReader {

	public static String[][] getexceldata(String excelname ,String Sheetname) throws IOException {
		File filename = new File(System.getProperty("user.dir")+"\\src\\data\\"+excelname);
		FileInputStream FIS = new FileInputStream(filename);
		HSSFWorkbook wb = new HSSFWorkbook(FIS);
		HSSFSheet sht = wb.getSheet(Sheetname);
		System.out.println(sht.getLastRowNum());
		int rownum = sht.getLastRowNum();
		int colnum = sht.getRow(0).getLastCellNum();
		String value;
		String[][] data = new String[rownum][colnum];
		for (int i = 1; i <= rownum; i++) {
			Row rowobj = sht.getRow(i);

			for (int j = 0; j < colnum; j++) {
				try {
					if (rowobj.getCell(j).getCellType() == HSSFCell.CELL_TYPE_STRING) {
						value = rowobj.getCell(j).getStringCellValue();
					} 
					else 
					{
						double value1 = rowobj.getCell(j).getNumericCellValue();
						long x= (long) value1;
						value = String.valueOf(x);
					}
				} catch (NullPointerException e) {
					value = "";

				}
				data[i - 1][j] = value;
				System.out.println(value);
			}
			

		}

		return data;
	}

}
