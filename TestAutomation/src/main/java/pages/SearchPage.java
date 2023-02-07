package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPage {
    private WebDriver driver;
    private By listofA = By.xpath("//h3/a");

    public SearchPage(WebDriver driver) {this.driver = driver;}

    public List<String> iteratelist(){
        List<WebElement> searchlist = driver.findElements(listofA);
        //searchlist.forEach(a->a.getText().);
        //List<String> listaNueva = new List<String>;
        //return searchlist.forEach(a->
        return searchlist.stream().map(e->e.getText()).collect(Collectors.toList());

    }

}
