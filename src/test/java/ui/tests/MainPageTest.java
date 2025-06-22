package ui.tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static ui.tests.Constants.MAIN_PAGE_TITLE;

public class MainPageTest extends BaseUiTest {

    @BeforeMethod
    public void openMainPage() {
        open("https://github.com/");
    }

    @Test(groups = {"Smoke", "Regression"}, priority = 4)
    @Description("This test check Main Page title")
    @Owner("Volodymyr Kostenko")
    @Issue("JIRA-123")
    @TmsLink("TestRail-123")
    public void checkMainPageTitle(){
        Assert.assertEquals(title(), MAIN_PAGE_TITLE);
    }

    @Test(priority = 5, description = "This test won't be run", enabled = false)
    public void disableTestExample(){

    }

}
