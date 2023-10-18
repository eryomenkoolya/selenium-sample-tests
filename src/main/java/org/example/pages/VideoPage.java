package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoPage extends BasePage {
    @FindBy(css = "#owner ytd-video-owner-renderer img")
    private WebElement authorAvatar;

    public VideoPage(WebDriver driver) {
        super(driver);
    }

    public AuthorPage clickOnAuthorAvatar() {
        authorAvatar.click();
        return new AuthorPage(driver);
    }
}