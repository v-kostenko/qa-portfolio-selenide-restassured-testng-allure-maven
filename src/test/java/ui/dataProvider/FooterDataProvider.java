package ui.dataProvider;

import org.testng.annotations.DataProvider;
import ui.pages.MainPage;

public class FooterDataProvider {

    @DataProvider(name = "footerLists")
    public static Object[][] footerLists() {
        MainPage mainPage = new MainPage();

        return new Object[][]{
                {mainPage.getProductsList()},
                {mainPage.getPlatformList()},
                {mainPage.getSupportList()},
                {mainPage.getCompanyList()}
        };
    }
}
