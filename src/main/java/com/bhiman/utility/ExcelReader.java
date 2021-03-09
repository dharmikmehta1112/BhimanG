package com.bhiman.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
	
private static final Logger LOG = Logger.getLogger(ExcelReader.class);
	
	//declarations
		public static FileInputStream fi;
		public static FileOutputStream fo;
		public static XSSFWorkbook wb;
		public static XSSFSheet ws;
		public static Row row;
		public static Cell cell;

		
		public static int getRowCount(String xlFile, String xlSheet) throws IOException {
			LOG.info("Retuening total row no in one sheet");
			fi = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlSheet);
			int rowcount = ws.getLastRowNum();
			wb.close();
			fi.close();
			return rowcount;
		}

		public static int getCellCount(String xlFile, String xlSheet, int rownum) throws IOException {
			LOG.info("Returning total cell no of one row");
			fi = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlSheet);
			row = ws.getRow(rownum);
			LOG.info("Row Count is "+ row);
			int cellcount = row.getLastCellNum();
			LOG.info("Cell count is "+cellcount);
			wb.close();
			fi.close();
			return cellcount;

		}

		public static String getCellData(String xlFile, String xlSheet, int rownum, int cellnum) throws IOException {
			LOG.info("Returning data of one cell");
			fi = new FileInputStream(xlFile);
			wb = new XSSFWorkbook(fi);
			ws = wb.getSheet(xlSheet);
			row = ws.getRow(rownum);
			cell = row.getCell(cellnum);
			String data;
			try {
				DataFormatter formatter = new DataFormatter();
				String cellData = formatter.formatCellValue(cell);
				return cellData;
			} catch (Exception e) {
				data = "";
			}
			wb.close();
			fi.close();
			return data;
		}


}
