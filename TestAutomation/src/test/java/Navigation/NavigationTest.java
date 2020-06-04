package Navigation;

import Base.BaseTest;

public class NavigationTest extends BaseTest {

    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
    }
}
