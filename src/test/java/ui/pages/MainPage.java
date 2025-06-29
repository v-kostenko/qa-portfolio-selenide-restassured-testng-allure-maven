package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement signInButton = $(byXpath("//div[contains(@class, 'HeaderMenu')]//a[@href='/login']"));


    private final ElementsCollection productsList = $$(byXpath("//h3[@id='footer-title-product']/following-sibling::ul//a"));
    private final ElementsCollection platformList = $$(byXpath("//h3[@id='footer-title-platform']/following-sibling::ul//a"));
    private final ElementsCollection supportList = $$(byXpath("//h3[@id='footer-title-support']/following-sibling::ul//a"));
    private final ElementsCollection companyList = $$(byXpath("//h3[@id='footer-title-company']/following-sibling::ul//a"));


    public void clickLoginButton() {
        signInButton.shouldBe(visible).click();
    }


    public ElementsCollection getProductsList() {
        return this.productsList;
    }

    public ElementsCollection getPlatformList() {
        return this.platformList;
    }

    public ElementsCollection getSupportList() {
        return this.supportList;
    }

    public ElementsCollection getCompanyList() {
        return this.companyList;
    }


}
