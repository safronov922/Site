import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class MyTests {
    WebDriver driver;
    private static final String PATH = "file:///C:/Users/anduser/Downloads/Site/src/main/resources/index.html";


    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void HelloExistTest() {
        // Open Index page
        driver.get(PATH);
        // Check hello message  shown
        boolean isHelloMessageShown = driver.findElement(By.id("header")).isDisplayed();
        Assert.assertTrue(isHelloMessageShown,"hello message don't show");
    }

    @Test
    public void BandsExistTest() {
        // Open Index page
        driver.get(PATH);
        // Check bands  shown
        boolean isBandsShown = driver.findElement(By.id("bands")).isDisplayed();
        Assert.assertTrue(isBandsShown,"bands don't show");
    }

    @Test
    public void ButtonExistTest() {
        // Open Index page
        driver.get(PATH);
        // Check button shown
        driver.findElement(By.id("button")).isDisplayed();
    }

    @Test
    public void NameExistTest() {
        // Open Index page
        driver.get(PATH);
        // Name shown
        driver.findElement(By.id("vladislav")).getText();
    }

    @Test
    public void LinkOpenTest() {
        // Open Index page
        driver.get(PATH);
        // Click on link
        driver.findElement(By.name("link")).click();
        // Site opened
        driver.findElement(By.className("color_h1")).isDisplayed();

    }

    @Test
    public void ImageTextTest() {
        // Open Index page
        driver.get(PATH);
        // Text of image exist
        driver.findElement(By.name("image")).getAttribute("oops, you found it");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
