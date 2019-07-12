package org.jameel.san;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart {

    public SeleniumStart() throws Exception {
        String loginUrl = "http://127.0.0.1:8887/Login%20Page.html";
        String page1Url = "http://127.0.0.1:8887/Page%201.html";
        String page2Url = "http://127.0.0.1:8887/Page%202.html";

        System.setProperty("webdriver.ie.driver", "D:\\pages\\IEDriverServer.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\pages\\chromedriver.exe");
// WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new ChromeDriver();

// this.executeLogin(loginUrl, driver);
        this.executePage1(page1Url, driver);
    }

    public static void main(String[] args) throws Exception {
        new SeleniumStart();
    }

    private void executeLogin(String url, WebDriver driver) throws Exception {
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"auth_name1\"]")).sendKeys("JAMEEL");
        driver.findElement(By.xpath("//*[@id=\"auth_pass1\"]")).sendKeys("JAMEEL");
// driver.findElement(By.xpath("//*[@id=\"login_frm1\"]/div[3]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"auth_name\"]")).sendKeys("MOHAMED");
        driver.findElement(By.xpath("//*[@id=\"auth_pass\"]")).sendKeys("MOHAMED");
// driver.findElement(By.xpath("//*[@id=\"login_frm\"]/div[3]/button")).click();
    }

    private void executePage1(String url, WebDriver driver) throws Exception {

        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"title_1_1\"]")).sendKeys("Mr");
        driver.findElement(By.xpath("//*[@id=\"surname_1_1\"]")).sendKeys("JOHN");
// driver.findElement(By.xpath("//*[@id=\"login_frm1\"]/div[3]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"title_1_2\"]")).sendKeys("Ms");
        driver.findElement(By.xpath("//*[@id=\"surname_1_2\"]")).sendKeys("Smith");
// driver.findElement(By.xpath("//*[@id=\"login_frm\"]/div[3]/button")).click();
    }
}