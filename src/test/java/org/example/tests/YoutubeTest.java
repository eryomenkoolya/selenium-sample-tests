package org.example.tests;

import org.example.pages.AuthorPage;
import org.example.pages.HomePage;
import org.example.pages.SignInPopUp;
import org.example.pages.VideoPage;
import org.example.pages.VideoResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.utilities.ConfigProvider.getConfig;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class YoutubeTest {
    public static final String SIGN_IN = "Sign in";
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = getConfig("base.url", "");
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    public void sampleYoutubeTest() {
        String randomNumeric = randomNumeric(2, 5);
        HomePage homePage = new HomePage(driver);
        VideoResultsPage videoResultsPage = homePage.getSearchComponent()
                .enterSearchQuery(randomNumeric)
                .searchWithAutocompleteOption(2);
        VideoPage videoPage = videoResultsPage.clickOnVideo(4);
        AuthorPage authorPage = videoPage.clickOnAuthorAvatar();
        SignInPopUp signInPopUp = authorPage.clickToSubscribe();
        Assert.assertEquals(signInPopUp.getSignInButton().getText(), SIGN_IN);
    }

    @AfterTest
    public void shutDown() {
        driver.quit();
    }
}