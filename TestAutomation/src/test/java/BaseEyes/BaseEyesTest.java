package BaseEyes;

import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.BooksPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseEyesTest {

    protected static WebDriver driver;
    protected static Eyes eyes;

    @BeforeClass
    public void setUp(){
        Properties props = System.getProperties();
        try {
            props.load(new FileInputStream(new File("resources/test.properties")));
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
        driver = new ChromeDriver();
        driver.get(System.getProperty("site.url"));

        initiateEyes();

    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
        eyes.abortIfNotClosed();
    }
    private static void initiateEyes(){
        eyes = new Eyes();
        eyes.setApiKey("applitools.api.key");
    }
}
