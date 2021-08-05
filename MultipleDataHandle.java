package MultipleDataHandle;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleDataHandle {
	
	public static String[][] TestData(String fileName) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("E://ExcelInputs//"+fileName+".xlsx");
		XSSFSheet worksheet = workbook.getSheet("Madhi");
//		XSSFRow row = worksheet.getRow(0);
	//	int Rowcount = worksheet.getLastRowNum();
		int Rowcount = worksheet.getPhysicalNumberOfRows();
		System.out.println(Rowcount);
		short CellCount = worksheet.getRow(0).getLastCellNum();
		System.out.println(CellCount);
		
		String[][] Arraysize = new String[Rowcount][CellCount];
		
		for (int i=0;i<Rowcount;i++) {
			
		for(int j=0;j<CellCount;j++) {
			String CellValue = worksheet.getRow(i).getCell(j).getStringCellValue();
			
			Arraysize[i][j]= CellValue;
			System.out.println(CellValue);
			
		}
			
		}	
		workbook.close();	
		return Arraysize;
	
	}
	

}
