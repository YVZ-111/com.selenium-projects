package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;

public class Test_01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(5000);

        searchBox.sendKeys("Nutella");
        searchBox.submit();

        WebElement resultText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div"));
        Thread.sleep(5000);
        System.out.println(resultText.getText());

        Assert.assertEquals(resultText.getText(),"1-48 of 67 results for \"Nutella\"");

//        driver.close();

    }
}
