package trySelenium.week_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");

        String title = driver.getTitle();
        System.out.println(title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        /**String paceSource = driver.getPageSource();
        System.out.println("=====================================================");
        System.out.println(paceSource);
        System.out.println("=====================================================");*/

        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());

    }
}
