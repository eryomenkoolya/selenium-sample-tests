package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorPage extends BasePage {
    @FindBy(css = "#inner-header-container #subscribe-button button")
    private WebElement subscribeButton;

    public AuthorPage(WebDriver driver) {
        super(driver);
    }

    public SignInPopUp clickToSubscribe() {
        subscribeButton.click();
        return new SignInPopUp(driver);
    }
}