package junit;

import org.junit.*;

/**
 * Created by Jay Vaghani
 */
public class JUnitIntroduction {

    @BeforeClass
    public static void connectToDB(){
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closeConnectionToDB(){
        System.out.println("close connection");
    }


    @Before
    public void openBrowser(){
        System.out.println("Opening browser");
    }

    @After
    public void closeBrowser(){
        System.out.println("Closing browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to login page");
    }

    @Test
    public void test(){
        System.out.println("This is test");
    }
}
