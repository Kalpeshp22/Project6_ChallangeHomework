package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    public void openBroswer(String baseUrl) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // Reference path of the driver.
        driver = new ChromeDriver();
        // create a new object driver
        driver.get(baseUrl);
        // Launch URl using the driver

        driver.manage().window().maximize();
        // Maxmimise the broswer
    }

    public void closeBrower() {
        driver.quit();
    }
}
