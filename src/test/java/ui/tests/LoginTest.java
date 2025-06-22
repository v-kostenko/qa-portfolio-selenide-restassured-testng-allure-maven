package ui.tests;

import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.dataProvider.LoginDataProvider;
import ui.pages.LoginPage;


import static com.codeborne.selenide.Selenide.open;
import static ui.tests.Constants.LOGIN_ERROR_MESSAGE;

public class LoginTest extends BaseUiTest {

    @BeforeMethod
    public void openMainPage() {
        open("https://github.com/login");
    }

    @Test(description = "DataProvider example", dataProvider = "invalidLoginData", dataProviderClass = LoginDataProvider.class)
    public void checkInvalidLogin(String login, String password) {
        LoginPage loginPage = new LoginPage();

        Allure.step("Login", () -> {
            loginPage.login(login, password);
        });

        Assert.assertEquals(loginPage.getErrorMessage(), LOGIN_ERROR_MESSAGE);
    }
}
