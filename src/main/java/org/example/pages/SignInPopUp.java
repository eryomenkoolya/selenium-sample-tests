package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPopUp extends BasePage {
    @FindBy(css = "ytd-modal-with-title-and-button-renderer #button a")
    private WebElement signInButton;

    public SignInPopUp(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
}