package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    // inheritance concept with Baseclass // base test method
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBroswer(baseUrl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {

        WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();

        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]"));
        Assert.assertEquals("Signing up is easy!", message.getText());
    }

    @Test
     public void userSholdRegisterAccountSuccessfully(){
        WebElement registerLink= driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerLink.click();
        driver.findElement(By.id("customer.firstName")).sendKeys("RAJ");
        driver.findElement(By.id("customer.lastName")).sendKeys("kalpesh");
        driver.findElement(By.id("customer.address.street")).sendKeys("48 SKY APPRTMENT");
        driver.findElement(By.name("customer.address.city")).sendKeys("AHMEDABAD");
        driver.findElement(By.id("customer.address.state")).sendKeys("GUJARAT");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("382488");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9998462811");
        driver.findElement(By.name("customer.ssn")).sendKeys("1020301405060");
        driver.findElement(By.id("customer.username")).sendKeys("RAJ456");
        driver.findElement(By.id("customer.password")).sendKeys("Prime123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Prime123");

        WebElement registerButton = driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        registerButton.click();

        WebElement message1 = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));
        Assert.assertEquals("Your account was created successfully. You are now logged in.", message1.getText());
    }

    @After
    public void tearDown() {
        closeBrower();
    }
}


