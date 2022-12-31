package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class SahulsSite {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//*[@id=\"inputUsername\"]")).sendKeys("rahul");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button")).click();
        Thread.sleep(5000);

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText(),"Hello rahul,");
    }
}
