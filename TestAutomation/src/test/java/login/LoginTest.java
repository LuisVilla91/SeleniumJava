package login;


import Base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
       LoginPage loginPage = homePage.clickFromAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       assertTrue(secureAreaPage.getAlertText().contains("secure area") ,"Password incorret");

    }

}
