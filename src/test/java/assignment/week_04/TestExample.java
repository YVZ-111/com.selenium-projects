package assignment.week_04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestExample {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up the WebDriver instance
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void testScenario() {
        // Navigate to the website
        driver.get("http://www.example.com");

        // Find the search box element and enter a search query
        WebElement searchBox = driver.findElement(By.id("search-box"));
        searchBox.sendKeys("selenium");

        // Find the search button element and click it
        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();

        // Wait for the search results to be displayed
        // (You can use an explicit wait or implicit wait here)

        // Find the first search result element and get its text
        WebElement firstResult = driver.findElement(By.cssSelector(".search-result:first-of-type"));
        String resultText = firstResult.getText();

        // Verify that the search returned the expected results
        Assert.assertTrue(resultText.contains("Selenium"));
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }


}
