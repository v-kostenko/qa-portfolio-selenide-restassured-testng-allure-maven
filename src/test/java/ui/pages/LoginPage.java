package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement header = $(byXpath("//div[@id='login']//h1"));
    private final SelenideElement loginField = $(byXpath("//input[@id='login_field']"));
    private final SelenideElement passwordField = $(byXpath("//input[@id='password']"));
    private final SelenideElement signInButton = $(byXpath("//input[@type='submit']"));
    private final SelenideElement errorMessage = $(byXpath("//div[@class='js-flash-alert']"));


    public void fillLoginField(String phone) {
        loginField.setValue(phone);
    }

    public void fillPasswordField(String password) {
        passwordField.setValue(password);
    }

    public void clickToSignInButton() {
        signInButton.shouldBe(visible).click();
    }

    public void login(String login, String password) {
        fillLoginField(login);
        fillPasswordField(password);
        clickToSignInButton();
    }

    public String getErrorMessage(){
        return errorMessage.shouldBe(visible).getText().trim();
    }

}
