package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       /** System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\opggx_000\\Desktop\\chromedriver_win32\\chromedriver.exe");*/

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        String str = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();

        System.out.println("Test 1 :" + (str));
        Thread.sleep(10000);
        System.out.println(pageSource);
    }
}
