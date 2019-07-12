package org.jameel.san;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Start {

    public Start(String[] args) {
        String fileName = args[0];
        int rowNumber = Integer.parseInt(args[1]);

        XSSFWorkbook workbook;
        XSSFSheet sheet1 = null;
        XSSFSheet sheet2 = null;
        XSSFSheet sheet3 = null;
        XSSFSheet sheet4 = null;
        XSSFSheet sheet5 = null;
        SharedStringsTable sss = null;

        File src = new File(fileName);
        try {
            FileInputStream fis = new FileInputStream(src);
            workbook = new XSSFWorkbook(fis);
            sheet1 = workbook.getSheetAt(0);
            sheet2 = workbook.getSheetAt(1);
            sheet3 = workbook.getSheetAt(2);
            sheet4 = workbook.getSheetAt(3);
            sheet5 = workbook.getSheetAt(4);

            sss = workbook.getSharedStringSource();

// System.out.println(sheet1.getLastRowNum());
// System.out.println(sheet1.getRow(0).getLastCellNum());

// XSSFRow headerRow = sheet1.getRow(0);
// headerRow.get

        } catch (Exception e) {
            System.out.println("File missing");
        }

// Map<String, List<String>> sheetMap1 = this.populateHashmapKey(sheet1);
// Map<String, List<String>> sheetMap2 = this.populateHashmapKey(sheet2);
// Map<String, List<String>> sheetMap3 = this.populateHashmapKey(sheet3);
// Map<String, List<String>> sheetMap4 = this.populateHashmapKey(sheet4);
// Map<String, List<String>> sheetMap5 = this.populateHashmapKey(sheet5);

        Map<String, String> sheetMap1 = new HashMap<String, String>();
        Map<String, String> sheetMap2 = new HashMap<String, String>();
        Map<String, String> sheetMap3 = new HashMap<String, String>();
        Map<String, String> sheetMap4 = new HashMap<String, String>();
        Map<String, String> sheetMap5 = new HashMap<String, String>();

        this.populateHashmapKey(sheet1, sheetMap1);
        this.populateHashmapKey(sheet2, sheetMap2);
        this.populateHashmapKey(sheet3, sheetMap3);
        this.populateHashmapKey(sheet4, sheetMap4);
        this.populateHashmapKey(sheet5, sheetMap5);

// this.populateHashmapValue(sheet1, sheetMap1, rowNumber);
// this.populateHashmapValue(sheet2, sheetMap2, rowNumber);
// this.populateHashmapValue(sheet3, sheetMap3, rowNumber);
// this.populateHashmapValue(sheet4, sheetMap4, rowNumber);
// this.populateHashmapValue(sheet5, sheetMap5, rowNumber);

        this.populateHashmapValue(sheet1, sheetMap1, rowNumber, sss);
        this.populateHashmapValue(sheet2, sheetMap2, rowNumber, sss);
        this.populateHashmapValue(sheet3, sheetMap3, rowNumber, sss);
        this.populateHashmapValue(sheet4, sheetMap4, rowNumber, sss);
        this.populateHashmapValue(sheet5, sheetMap5, rowNumber, sss);

        System.out.println("_______________________________________________________________________");
        for (String key : sheetMap1.keySet()) {
            System.out.println(key + "---------------" + sheetMap1.get(key));
        }
        System.out.println("_______________________________________________________________________");
        for (String key : sheetMap2.keySet()) {
            System.out.println(key + "---------------" + sheetMap2.get(key));
        }
        System.out.println("_______________________________________________________________________");
        for (String key : sheetMap3.keySet()) {
            System.out.println(key + "---------------" + sheetMap3.get(key));
        }
        System.out.println("_______________________________________________________________________");
        for (String key : sheetMap4.keySet()) {
            System.out.println(key + "---------------" + sheetMap4.get(key));
        }
        System.out.println("_______________________________________________________________________");
        for (String key : sheetMap5.keySet()) {
            System.out.println(key + "---------------" + sheetMap5.get(key));
        }
    }

    private Map<String, String> populateHashmapValue(XSSFSheet sheet, Map<String, String> sheetMap, int rowIndex,
            SharedStringsTable sss) {
        XSSFRow headerRow = sheet.getRow(0);
        int columnCount = headerRow.getLastCellNum();

        XSSFRow valueRow = sheet.getRow(rowIndex);
        for (int i = 0; i < columnCount; i++) {
// String key = headerRow.getCell(i).getRawValue().trim();
            String key = String.valueOf(i);
            String value = null;

            XSSFCell cell = valueRow.getCell(i);
// cell.setCellType(CellType.STRING);

// cell.getCellTypeEnum()

// String value = cell.getStringCellValue().trim();
// getItemAt(int idx)

// sss.getEntryAt(i).getT();

// switch (cell.getCellTypeEnum()) {
// case STRING:
// value = sss.getEntryAt(Integer.parseInt(cell.getRawValue())).getT();
// break;
// case NUMERIC:
// cell.setCellType(CellType.STRING);
// value = cell.getRawValue();
// break;
// default:
// break;
// }

// String value = cell.getRawValue().trim() + "--------------" +
// cell.getCellTypeEnum();

            sheetMap.put(key, value);
        }
        return sheetMap;
    }

    private Map<String, String> populateHashmapKey(XSSFSheet sheet, Map<String, String> sheetMap) {
        XSSFRow headerRow = sheet.getRow(0);
        int columnCount = headerRow.getLastCellNum();

        for (int i = 0; i < columnCount; i++) {
// String key = headerRow.getCell(i).getStringCellValue().trim();
            String key = String.valueOf(i);
// System.out.println("KEY:" + key);
            sheetMap.put(key, null);
        }
        return sheetMap;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String[] ar = { "C:\\myGithub\\san\\Data.xlsx", "2" };
        new Start(ar);
    }
}