package alerts;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        assertEquals(alertPage.resultText(),"You successfully clicked an alert", "Error");

    }
}
