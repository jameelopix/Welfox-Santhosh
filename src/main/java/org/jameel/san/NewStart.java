package org.jameel.san;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewStart {

    public NewStart(String[] args) throws Exception {

        String fileName = args[0];
        int rowNumber = Integer.parseInt(args[1]) - 1;
        String userName = args[2];
        String password = args[3];

        String loginUrl = "http://127.0.0.1:8887/Login%20Page.html";
        String page1Url = "http://127.0.0.1:8887/Page%201.html";
        String page2Url = "http://127.0.0.1:8887/Page%202.html";
        String page3Url = "http://127.0.0.1:8887/Page%203.html";
        String page4Url = "http://127.0.0.1:8887/Page%204.html";
        String page5Url = "http://127.0.0.1:8887/Page%205.html";

        System.setProperty("webdriver.ie.driver", "D:\\pages\\IEDriverServer.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\pages\\chromedriver.exe");
// WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new ChromeDriver();

        XSSFWorkbook workbook;
        XSSFSheet sheet1 = null;
        XSSFSheet sheet2 = null;
        XSSFSheet sheet3 = null;
        XSSFSheet sheet4 = null;
        XSSFSheet sheet5 = null;
        SharedStringsTable sss = null;

        File src = new File(fileName);
        FileInputStream fis;
        fis = new FileInputStream(src);

        workbook = new XSSFWorkbook(fis);
        sheet1 = workbook.getSheetAt(0);
        sheet2 = workbook.getSheetAt(1);
        sheet3 = workbook.getSheetAt(2);
        sheet4 = workbook.getSheetAt(3);
        sheet5 = workbook.getSheetAt(4);

// Login login = new Login(userName, password);
        Page1 page1 = (Page1) populateObject(Page1.class, sheet1, rowNumber);
// Page2 page2 = (Page2) populateObject(Page2.class, sheet2, rowNumber);
// Page3 page3 = (Page3) populateObject(Page3.class, sheet3, rowNumber);
// Page4 page4 = (Page4) populateObject(Page4.class, sheet4, rowNumber);
//        Page5 page5 = (Page5) populateObject(Page5.class, sheet5, rowNumber);

// System.out.println(page1.toString());
// System.out.println(page2.toString());
// System.out.println(page3.toString());
// System.out.println(page4.toString());
// System.out.println(page5.toString());

// this.executeLogin(loginUrl, driver, login);
        this.executePage1(page1Url, driver, page1);
// this.executePage2(page2Url, driver, page2);
// this.executePage3(page3Url, driver, page3);
// this.executePage4(page4Url, driver, page4);
//        this.executePage5(page5Url, driver, page5);

// this.dummy(page5Url, driver);
    }

    private void executeLogin(String url, WebDriver driver, Login login) throws Exception {
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"auth_name1\"]")).sendKeys(login.custUserName);
        driver.findElement(By.xpath("//*[@id=\"auth_pass1\"]")).sendKeys(login.custPassword);
// driver.findElement(By.xpath("//*[@id=\"login_frm1\"]/div[3]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"auth_name\"]")).sendKeys(login.assoUserName);
        driver.findElement(By.xpath("//*[@id=\"auth_pass\"]")).sendKeys(login.assoPassword);
// driver.findElement(By.xpath("//*[@id=\"login_frm\"]/div[3]/button")).click();
    }

    private void dummy(String url, WebDriver driver) throws Exception {
        driver.get(url);
        Thread.sleep(2000);

        List<WebElement> webElements = driver.findElements(By.xpath("//*"));

        System.out.println(webElements.size());
        for (WebElement webElement : webElements) {
            System.out.println(webElement.getAttribute("id").toString());
        }

// Field[] fields = page1.getClass().getDeclaredFields();
// for (Field field : fields) {
// Page page = field.getAnnotation(Page.class);
// if (page != null) {
// if (page.type() == DOMType.INPUT) {
// String path = page.value();
// String value = (String) field.get(page1);
// driver.findElement(By.xpath(path)).sendKeys(value);
// }
// }
// }
    }

    private void executePage5(String url, WebDriver driver, Page5 targetPage) throws Exception {
        driver.get(url);
        Thread.sleep(2000);

        Field[] fields = targetPage.getClass().getDeclaredFields();
        for (Field field : fields) {
            Page page = field.getAnnotation(Page.class);
            if (page != null) {
                if (page.type() == DOMType.INPUT) {
                    String path = page.value();
                    String value = (String) field.get(targetPage);
                    driver.findElement(By.xpath(path)).sendKeys(value);
                }
            }
        }
    }

    private void executePage4(String url, WebDriver driver, Page4 targetPage) throws Exception {
        driver.get(url);
        Thread.sleep(2000);

        Field[] fields = targetPage.getClass().getDeclaredFields();
        for (Field field : fields) {
            Page page = field.getAnnotation(Page.class);
            if (page != null) {
                if (page.type() == DOMType.INPUT) {
                    String path = page.value();
                    String value = (String) field.get(targetPage);
                    driver.findElement(By.xpath(path)).sendKeys(value);
                }
            }
        }
    }

    private void executePage3(String url, WebDriver driver, Page3 targetPage) throws Exception {
        driver.get(url);
        Thread.sleep(2000);

        Field[] fields = targetPage.getClass().getDeclaredFields();
        for (Field field : fields) {
            Page page = field.getAnnotation(Page.class);
            if (page != null) {
                if (page.type() == DOMType.INPUT) {
                    String path = page.value();
                    String value = (String) field.get(targetPage);
                    driver.findElement(By.xpath(path)).sendKeys(value);
                }
            }
        }
    }

    private void executePage2(String url, WebDriver driver, Page2 targetPage) throws Exception {
        driver.get(url);
        Thread.sleep(2000);

        Field[] fields = targetPage.getClass().getDeclaredFields();
        for (Field field : fields) {
            Page page = field.getAnnotation(Page.class);
            if (page != null) {
                if (page.type() == DOMType.INPUT) {
                    String path = page.value();
                    String value = (String) field.get(targetPage);
                    driver.findElement(By.xpath(path)).sendKeys(value);
                }
            }
        }
    }

    private void executePage1(String url, WebDriver driver, Page1 targetPage) throws Exception {
        driver.get(url);
        Thread.sleep(2000);

        Field[] fields = targetPage.getClass().getDeclaredFields();
        for (Field field : fields) {
            Page page = field.getAnnotation(Page.class);
            if (page != null) {
                if (page.type() == DOMType.INPUT) {
                    String path = page.value();
                    String value = (String) field.get(targetPage);
                    driver.findElement(By.xpath(path)).sendKeys(value);
                }
            }
        }
    }

    private Object populateObject(Class cls, XSSFSheet sheet, int rowIndex) throws Exception {
// Class cls = Page1.class;
        Object obj = null;
        obj = cls.newInstance();

        XSSFRow valueRow = sheet.getRow(rowIndex);

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            ExcelCell excelCell = field.getAnnotation(ExcelCell.class);
            String value = null;

            XSSFCell cell = valueRow.getCell(excelCell.position());

            if (Type.DATE.equals(excelCell.type())) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

                Date d1 = cell.getDateCellValue();
                value = dateFormat.format(d1);// d1.toString();
            } else if (Type.CURRENCY.equals(excelCell.type())) {
                value = String.format("%.2f", cell.getNumericCellValue());
// value = dateFormat.format(d1);// d1.toString();
            } else {
                cell.setCellType(CellType.STRING);
                value = cell.getStringCellValue().trim();
            }

            field.setAccessible(true);
            field.set(obj, value);
        }

        return obj;
    }

    public static void main(String[] args) throws Exception {
        String[] ar = { "D:\\pages\\Data.xlsx", "21", "JAMEEL", "JAMEEL" };
        new NewStart(ar);
    }
}