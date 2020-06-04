package forgotPassword;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testRetrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordPage();
        forgotPasswordPage.setEmailField("email@test.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue(emailSentPage.getEmailText().contains("Your e-mail's been sent!"));


    }
}
