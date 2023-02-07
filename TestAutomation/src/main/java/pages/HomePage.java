package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public  HomePage(WebDriver driver){

        this.driver = driver;
    }
    private By searchButton = By.className("searchbox");
    private By searchInput = By.id("search-field");

    public void clickSearch(){
        driver.findElement(searchButton).click();
    }

    public SearchPage searchPageInteraction (){
        WebElement input = driver.findElement(searchInput);
        input.sendKeys("Outsource");
        input.sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }


    public LoginPage clickFromAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordPage(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoverPage clickHovers (){
        clickLink("Hovers");
        return new  HoverPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){

        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

}
