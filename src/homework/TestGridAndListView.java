package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestGridAndListView extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductsDisplayInGridView() {
        mouseHoverToElement(By.xpath("//ul[contains(@class, 'notmobile')]//a[text() = 'Computers ']"));
        mouseHoverToElementAndClick(By.xpath("//ul[contains(@class, 'notmobile')]//a[text() = 'Software ']"));

        WebElement gridIcon = driver.findElement(By.xpath("//a[@title='Grid' and contains(@class, 'selected')]"));
        System.out.println(gridIcon.isDisplayed());

        if (gridIcon.isDisplayed()) {
            WebElement gridView = driver.findElement(By.xpath("//div[@class='products-wrapper']//div[@class='product-grid']"));
            Assert.assertTrue(gridView.isDisplayed());
        }
    }

    @Test
    public void verifyProductsDisplayInListView() {
        mouseHoverToElement(By.xpath("//ul[contains(@class, 'notmobile')]//a[text() = 'Computers ']"));
        mouseHoverToElementAndClick(By.xpath("//ul[contains(@class, 'notmobile')]//a[text() = 'Software ']"));

        clickOnElement(By.xpath("//a[@title='Grid']"));  // Click on List View tab
        try {
            WebElement listView = driver.findElement(By.xpath("//div[@class='products-wrapper']//div[@class='product-list']"));
            Assert.assertTrue(listView.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.fail("Product not display in List view");
        }

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
