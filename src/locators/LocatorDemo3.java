package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo3 extends BaseTest {
    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest3() throws InterruptedException {

        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();

        // Tag and Id
//        WebElement emailField= driver.findElement(By.cssSelector("input#email"));
        WebElement emailField= driver.findElement(By.cssSelector("#email"));
        emailField.sendKeys("Prime123@gmail.com");

        //Tag and Class
        WebElement signInBtn = driver.findElement(By.cssSelector(".button.btn.btn-default.button-medium"));
        signInBtn.submit();



    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
