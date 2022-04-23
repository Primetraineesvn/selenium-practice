package alertexample;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/**
 * Created by Jay Vaghani
 */
public class TestAlert extends Utility {

    String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample(){
        clickOnElement(By.name("proceed")); // Click on Sign in Button
        switchToAlert(); // Creating Alert Object reference and switch to alert
        acceptAlert();
        /*alert.dismiss();  // Dismiss alert
        alert.sendKeys("Jay");*/ // send text to alert
    }

}
