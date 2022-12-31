package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverNavigateMethode {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
        driver.quit(); //tüm sekmeler





    }
}
