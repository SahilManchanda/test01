package com.emr.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Commonfunction {
	
	
	public String accessfromfile(int sheetno, int i, int j)
		    throws IOException
		  {
		    File src = new File(System.getProperty("user.dir") + "/data.xlsx");
		    FileInputStream fis = new FileInputStream(src);
		    Workbook wb = new XSSFWorkbook(fis);
		    Sheet sheet = wb.getSheetAt(sheetno);
		    
		    DataFormatter formatter = new DataFormatter();
		    
		    String data = formatter.formatCellValue(sheet.getRow(i).getCell(j));
		    boolean retval = data.contains("EDATE");
		    if (!retval)
		    {
		      System.out.println(i + data);
		      return data;
		    }
		    Date data2 = sheet.getRow(i).getCell(j).getDateCellValue();
		    
		    Format formatter2 = new SimpleDateFormat("dd/MM/YYYY");
		    String s = formatter2.format(data2);
		    return s;
		  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
     
