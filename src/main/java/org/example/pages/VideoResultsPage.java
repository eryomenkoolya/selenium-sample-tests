package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VideoResultsPage extends BasePage {
    @FindBy(css = "#contents ytd-video-renderer")
    private List<WebElement> videoList;

    public VideoResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getVideo(int position) {
        return videoList.get(position - 1);
    }

    public VideoPage clickOnVideo(int position) {
        scrollIntoView(getVideo(position));
        getVideo(position).click();
        return new VideoPage(driver);
    }
}