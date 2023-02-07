package hexatactaSearch;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class searchTest extends BaseTest {

    @Test
    public void testSearchHomePage(){
        homePage.clickSearch();
        SearchPage searchPage = homePage.searchPageInteraction();
        assertTrue(searchPage.iteratelist().contains("WHAT NOT TO DO WHEN WORKING WITH AN OUTSOURCED SOFTWARE TEAM"));


    }
}
