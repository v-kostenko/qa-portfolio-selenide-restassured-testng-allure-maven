package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private SelenideElement createRepositoryButton = $(byXpath("//div[@class='dashboard-sidebar']//a[@href='/new']"));

    public void clickCreateRepositoryButton(){
        createRepositoryButton.shouldBe(visible).click();
    }
}
