package seleniumwaits;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestExplicitWait extends Utility {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void explicitlyWaitExample(){

        By signInLink = By.xpath("//a[contains(text(),'Sign In')]");

        // Use Explicitly wait
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(signInLink));
        signIn.click();*/

        WebElement signIn =  waitUntilVisibilityOfElementLocated(signInLink, 20);
        signIn.click();

    }
}
