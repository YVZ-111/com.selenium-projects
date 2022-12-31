package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethode {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        System.out.println(driver.manage().window().getPosition());

        driver.manage().window().setPosition(new Point(15,15));

        System.out.println(driver.manage().window().getSize());

        driver.manage().window().setSize(new Dimension(900,6000));

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }
}
