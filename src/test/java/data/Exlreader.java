package data;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exlreader {

	static FileInputStream fis = null ;

	public FileInputStream getfileinputstream ()  
	{
		String filepath =System.getProperty("user.dir")+"\\data\\Data.xlsx" ;
		File srcfile = new File(filepath);

		try {
			fis = new FileInputStream(srcfile);
		} catch (FileNotFoundException e) {
			System.out.println("the data file not found" + e);
		}
		return fis;


	}

	public Object[][] GetExlData (int sheetNum , int TotalColume) throws IOException
	{
		fis = getfileinputstream();
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.println("the data file not found" + e);
		}
		XSSFSheet sheet = workbook.getSheetAt(sheetNum);
		int totalNumberOfrows = (sheet.getLastRowNum()+1);
		int totalNumberOfCoulems = TotalColume ;
		String [][] arrayExlData = new String[totalNumberOfrows][totalNumberOfCoulems];
		for (int i = 0; i < totalNumberOfrows; i++) 
		{
			for (int j = 0; j < totalNumberOfCoulems; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExlData[i][j] = (row.getCell(j).toString());
				System.out.println(row.getCell(j).toString());
/*
				try {

					//arrayExlData[i][j] = String.valueOf(row.getCell(j).getCellType());
					System.out.println(row.getCell(j).getCellType());

					if(row.getCell(j).getCellType() == CellType.STRING)
					{
						String.valueOf(row.getCell(j).toString());
						System.out.println(row.getCell(j).toString());
					} else if (row.getCell(j).getCellType() ==CellType.NUMERIC)
					{
						double data = row.getCell(j).getNumericCellValue();
						int value = (int)data;


						System.out.println(value);
					}
				}catch(Exception E)
				{
					System.out.println("the error message is : " + E);
				}

*/
			}


		}

		workbook.close();
		return arrayExlData; 

	}
}