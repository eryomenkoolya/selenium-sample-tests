package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchComponent extends BasePage {
    @FindBy(css = "input#search")
    private WebElement searchInput;

    @FindBy(css = "ul.sbsb_b li")
    private List<WebElement> autoCompleteOptions;

    public SearchComponent(WebDriver driver) {
        super(driver);
    }

    public SearchComponent enterSearchQuery(String searchQuery) {
        searchInput.click();
        searchInput.sendKeys(searchQuery);
        return this;
    }

    public VideoResultsPage searchWithAutocompleteOption(int position) {
        autoCompleteOptions.get(position - 1).click();
        return new VideoResultsPage(driver);
    }
}