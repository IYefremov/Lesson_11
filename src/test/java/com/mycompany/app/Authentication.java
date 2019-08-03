package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authentication {

    private WebDriver driver;

    Authentication(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // email
    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailInputField;

    //"Create an account" button
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement createAccountButton;

    public Authentication fillInEmailInputField(String validEmail) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.emailInputField));
        this.emailInputField.clear();
        this.emailInputField.sendKeys(validEmail);
        return this;
    }

    public Authentication clickCreateAccountButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(this.createAccountButton));
        this.createAccountButton.click();
        return this;
    }
}

