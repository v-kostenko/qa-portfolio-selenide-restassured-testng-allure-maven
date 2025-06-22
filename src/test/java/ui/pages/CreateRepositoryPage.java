package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CreateRepositoryPage {
    private SelenideElement repositoryNameField = $(byXpath("//input[contains(@aria-describedby, 'RepoNameInput-message')]"));
    private SelenideElement createRepositoryButton = $(byXpath("//div[@class='prc-Stack-Stack-WJVsK']//button[@type='submit']"));


    public void fillRepositoryNameField(String repositoryName){
        repositoryNameField.shouldBe(visible).setValue(repositoryName);
    }

    public void clickCreateRepositoryButton(){
        createRepositoryButton.shouldBe(visible).click();
    }

}
