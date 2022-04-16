package locators;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LocatorDemo2 extends BaseTest {
    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void locatorDemoTest2() {

        // Class name locator ---To find multiple elements
        List<WebElement> sliderList = driver.findElements(By.className("homeslider-container"));
        int size = sliderList.size();
        System.out.println(size);

        // Tag name Locators ----- To ffind multiple elements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Numbers of links = " +links.size());
    }

    @After
    public void tearDown() {
//        closeBrowser();
    }
}
