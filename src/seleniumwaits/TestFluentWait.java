package seleniumwaits;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestFluentWait extends Utility {

    String baseUrl = "https://courses.letskodeit.com/practice";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void fluentWaitExample(){

        By signInLink = By.xpath("//a[contains(text(),'Sign In')]");

        // Use Fluent wait
        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
      /*  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement signIn = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(signInLink);
            }
        });

        signIn.click();*/

        WebElement signIn = waitForElementWithFluentWait(signInLink, 30, 5);


    }
}
