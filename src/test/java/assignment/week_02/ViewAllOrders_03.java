package assignment.week_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ViewAllOrders_03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\opggx_000\\Desktop\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnCheckAll\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnUncheckAll\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl02_OrderSelector\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl03_OrderSelector\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl04_OrderSelector\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnDelete\"]")).click();




    }
}
