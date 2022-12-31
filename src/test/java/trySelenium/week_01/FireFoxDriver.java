package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class FireFoxDriver {
    public static void main(String[] args) {

//        System.setProperty("webdriver.gecko.driver",
//                "C:\\Users\\opggx_000\\Desktop\\geckodriver\\geckodriver.exe");
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();

//        System.setProperty("webdriver.edge.driver",
//                "C:\\Users\\opggx_000\\Desktop\\edgedriver\\msedgedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
