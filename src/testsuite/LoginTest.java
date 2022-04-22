package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    // inheritance concept with Baseclass // base test method
        String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

        @Before
        public void setUp() {
            openBroswer(baseUrl);
        }
        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials() {

            WebElement loginLink = driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
            loginLink.click();

            WebElement userName = driver.findElement(By.name("username"));
            userName.sendKeys("RAJ789");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Prime789 ");

            driver.findElement(By.xpath("//input[@type='submit']")).click();

            // driver.findElement(By.xpath("")).click();
            //  driver.findElement(By.id("User Name")).sendKeys("");
            //  driver.findElement(By.id("password")).sendKeys("");
            //  driver.findElement(By.id("")).sendKeys("");
        }
        @After
        public void tearDown() {
            closeBrower();
        }

    }
