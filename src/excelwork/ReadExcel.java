package excelwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		File src=new File(path+"\\Test123.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		for(int i=0;i<sheet1.getLastRowNum();i++){
			for(int j=0;j<2;j++){
				System.out.print(sheet1.getRow(i).getCell(j).getStringCellValue()+"      ");
			}
			System.out.println();
		}
		
		wb.close();
		

	}

}
