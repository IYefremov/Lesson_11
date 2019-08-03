package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonHeaderPage {

    private WebDriver driver;

    CommonHeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search_query_top']")
    private WebElement searchInputField;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement magnifyingGlassButton;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement cartLink;

    @FindBy(xpath = "//a[@title='Log me out']")
    private WebElement logMeOut;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInButton;

    public CommonHeaderPage clickSearchInputField() {
        this.searchInputField.click();
        return this;
    }

    public CommonHeaderPage clickLogMeOut() {
        this.logMeOut.click();
        return this;
    }

    public CommonHeaderPage clickMagnifyingGlassIcon() {
        this.magnifyingGlassButton.click();
        return this;
    }

    public CommonHeaderPage clickCartLink() {
        this.cartLink.click();
        return this;
    }

    public CommonHeaderPage clickSignInButton() {
        this.signInButton.click();
        return this;
    }
}

