package anhtester.com.Bai9_TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RunTestNG02 {
    WebDriver driver;

    @BeforeMethod
    public void createDriver() {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @Test
    public void LaunchChrome_Method1() throws InterruptedException {
        driver.get("https://devyellow.restaurant365.com/");
        Thread.sleep(2000);
    }

}
