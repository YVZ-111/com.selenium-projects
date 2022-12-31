package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.time.Duration;

public class Text_02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https:www.facebook.com");
   //     driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();

        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailBox.sendKeys("asgagagasgag");

        WebElement passwordBox = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        passwordBox.sendKeys("egfegergewgwgws");

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();

        WebElement resultText = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));

        String expectedResultText ="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
        String actualResultText= resultText.getText();
        if(expectedResultText.equals(actualResultText)){
            System.out.println("Don't Pass test passed");
        }else{
            System.out.println("Don't Pass test failed");
        }
        driver.close();
    }
}
