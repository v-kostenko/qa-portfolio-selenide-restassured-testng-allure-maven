package ui.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.pages.CreateRepositoryPage;
import ui.pages.DashboardPage;
import ui.pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class RepositoryManagementTest extends BaseUiTest{

    @BeforeMethod
    public void openMainPage() {
        open("https://github.com/login");
    }

    @Test(enabled = false)
    public void createNewRepository(){
        new LoginPage().login("portfolioaqa@gmail.com", "QqWwEeRr12345!");
        new DashboardPage().clickCreateRepositoryButton();
        CreateRepositoryPage createRepositoryPage = new CreateRepositoryPage();
        //createRepositoryPage.fillRepositoryNameField("portfolio");
        createRepositoryPage.clickCreateRepositoryButton();


    }
}
