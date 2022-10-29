import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {

    private WebDriver driver;

    static {
        //WebDriverManager.chromedriver().setup();
        //WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
    }

    @Test
    public void firstTest() throws InterruptedException {

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement text = driver.findElement(By.id("my-text-id"));
        Thread.sleep(3000);
        text.sendKeys("Hello!");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(6000);
        //driver.findElement(By.linkText("Return to index")).click();
        //Thread.sleep(6000);
        String actualResult = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(actualResult, "Form submitted");


    }

    @BeforeMethod
    public void setUp() {
        //driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver = new EdgeDriver();
    }

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }


}
