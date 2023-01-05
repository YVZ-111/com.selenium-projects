package assignment.week_04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class TestCase_01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("http://automationexercise.com");

        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        WebElement signupAndLoginButton = driver.findElement(By.cssSelector("a[href='/login']"));
        signupAndLoginButton.click();

        WebElement signupMessage = driver.findElement(By.cssSelector("div[class='signup-form'] h2"));
        String expectedSignupMessage = "New User Signup!";
        String actualSignupMessage = signupMessage.getText();
        Assert.assertEquals(actualSignupMessage, expectedSignupMessage);

        WebElement nameField = driver.findElement(By.cssSelector("input[placeholder='Name']"));
        WebElement emailField = driver.findElement(By.cssSelector("input[data-qa='signup-email']"));
        nameField.sendKeys("John Doe");
        emailField.sendKeys("john.doe@example.com");

        WebElement signupButton = driver.findElement(By.cssSelector("button[data-qa='signup-button']"));
        signupButton.click();

        WebElement accountInfoMessage = driver.findElement(By.cssSelector("h2[class='title text-center'][css='1']"));
        String expectedAccountInfoMessage = "ENTER ACCOUNT INFORMATION";
        String actualAccountInfoMessage = accountInfoMessage.getText();
        Assert.assertEquals(actualAccountInfoMessage, expectedAccountInfoMessage);







    }
}
