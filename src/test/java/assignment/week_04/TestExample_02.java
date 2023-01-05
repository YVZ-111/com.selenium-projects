package assignment.week_04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExample_02 {
    private WebDriver driver;

    @BeforeClass
    public void setUpBeforeClass() {
        // Set up the ChromeDriver executable as a system property
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    }

    @BeforeMethod
    public void setUp() {
        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "searchTerms")
    public void testSearch(String searchTerm) {
        // Navigate to the website
        driver.get("http://www.example.com");

        // Find the search box element and enter the search term
        WebElement searchBox = driver.findElement(By.id("search-box"));
        searchBox.sendKeys(searchTerm);

        // Find the search button element and click it
        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();

        // Wait for the search results to be displayed
        // (You can use an explicit wait or implicit wait here)

        // Find the first search result element and get its text
        WebElement firstResult = driver.findElement(By.cssSelector(".search-result:first-of-type"));
        String resultText = firstResult.getText();

        // Verify that the search returned the expected results
        Assert.assertTrue(resultText.contains(searchTerm));
    }

    @DataProvider(name = "searchTerms")
    public Object[][] getSearchTerms() {
        return new Object[][] {
                {"selenium"},
                {"java"},
                {"testng"}
        };
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

    @AfterClass
    public void tearDownAfterClass() {
        // Reset the system property for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "");
    }
}
