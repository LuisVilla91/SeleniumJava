package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver driver;
    private By triggerAlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By resultText = By.id("result");
    private By triggerConfirmButton = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");


    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String resultText(){
        return driver.findElement(resultText).getText();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }


}
