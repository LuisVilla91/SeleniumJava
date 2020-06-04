package Wait;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden(){
        SoftAssert softAssert = new SoftAssert();
        var loadPage= homePage.clickDynamicLoading().clickExample1();
        loadPage.clickStart();
        assertEquals(loadPage.getLoadedText(), "Hello World!", "Hello World!");


    }
}
