package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class MainPage {

    private final SelenideElement signInButton = $(byXpath("//div[contains(@class, 'HeaderMenu')]//a[@href='/login']"));

    public void clickLoginButton() {
        signInButton.shouldBe(visible).click();
    }




}
