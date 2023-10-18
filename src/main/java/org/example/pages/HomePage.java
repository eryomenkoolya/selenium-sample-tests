package org.example.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private SearchComponent searchComponent;

    public HomePage(WebDriver driver) {
        super(driver);
        if (!driver.getTitle().equals("YouTube")) {
            throw new IllegalStateException("It is not YouTube Home Page title. " +
                    "Current title is " + driver.getTitle());
        }
        searchComponent = new SearchComponent(driver);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }
}