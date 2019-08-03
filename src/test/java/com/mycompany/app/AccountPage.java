package com.mycompany.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

    private WebDriver driver;

    AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Gender "Mr"
    @FindBy(xpath = "//label[@for='id_gender1']")
    private WebElement genderMr;

    // Gender "Mrs"
    @FindBy(xpath = "//label[@for='id_gender2']")
    private WebElement genderMrs;

    //First name
    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement custonmerFirstName;

    //Last name
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement custonmerLastName;

    //passwd
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement password;

    //firstname
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;

    //lastname
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement lastName;

    //company
    @FindBy(xpath = "//input[@id='company']")
    private WebElement company;

    //address1
    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address1;

    //address2
    @FindBy(xpath = "//input[@id='address2']")
    private WebElement address2;

    //city
    @FindBy(xpath = "//input[@name='city']")
    private WebElement city;

    //id_state
    @FindBy(xpath = "//select[@id='id_state']")
    private WebElement state;

    //postcode
    @FindBy(xpath = "//input[@id='postcode']")
    private WebElement postCode;

    //id_country
    @FindBy(xpath = "//select[@id='id_country']")
    private WebElement country;

    //phone
    @FindBy(xpath = "//input[@id='phone']")
    private WebElement homePhone;

    //phone_mobile
    @FindBy(xpath = "//input[@id='phone_mobile']")
    private WebElement mobilePhone;

    //alias
    @FindBy(xpath = "//input[@id='alias']")
    private WebElement alias;

    //submitAccount
    @FindBy(xpath = "//button[@id='submitAccount']")
    private WebElement submitAccountButton;

    // day
    @FindBy(xpath = "//select[@id='days']")
    private WebElement day;

    // month
    @FindBy(xpath = "//select[@id='months']")
    private WebElement month;

    // year
    @FindBy(xpath = "//select[@id='years']")
    private WebElement year;

    public AccountPage fillInGender(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.genderMr));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.genderMrs));
        switch (str) {
            case "Mr.":
                genderMr.click();
                break;
            case "Mrs.":
                genderMrs.click();
                break;
            default:
                System.out.println("Incorrect button name");
        }
        return this;
    }

    public AccountPage fillInDay(String str) {
        //    new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(this.day));
        new Select(day).selectByValue(str);
        return this;
    }

    public AccountPage fillInMonth(String str) {
        //  new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.month));
        new Select(month).selectByVisibleText(str);
        return this;
    }

    public AccountPage fillInYear(String str) {
        //new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.year));
        new Select(year).selectByVisibleText(str);
        return this;
    }

    public AccountPage fillInCustomerFirstName(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.custonmerFirstName));
        custonmerFirstName.clear();
        custonmerFirstName.sendKeys(str);
        return this;
    }

    public AccountPage fillInCustomerLastName(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.custonmerLastName));
        custonmerLastName.clear();
        custonmerLastName.sendKeys(str);
        return this;
    }

    public AccountPage fillInPassword(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.password));
        password.clear();
        password.sendKeys(str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public AccountPage fillInFirstName() {
        return this;
    }

    public AccountPage fillInLastName() {
        return this;
    }

    public AccountPage fillInCompany(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.company));
        company.clear();
        company.sendKeys(str);
        return this;
    }

    public AccountPage fillInAddress1(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.address1));
        address1.clear();
        address1.sendKeys(str);
        return this;
    }

    public AccountPage fillInAddress2(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.address2));
        address2.clear();
        address2.sendKeys(str);
        return this;
    }

    public AccountPage fillInCity(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.city));
        city.clear();
        city.sendKeys(str);
        return this;
    }

    public AccountPage fillInState(String str) {
        // new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.state));
        new Select(state).selectByVisibleText(str);
        return this;
    }

    public AccountPage fillInPostCode(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.postCode));
        postCode.clear();
        postCode.sendKeys(str);
        return this;
    }

    public AccountPage fillInCountry(String str) {
        //new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(this.country));
        new Select(country).selectByVisibleText(str);
        return this;
    }

    public AccountPage fillInHomePhone(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.homePhone));
        homePhone.clear();
        homePhone.sendKeys(str);
        return this;
    }

    public AccountPage fillInMobilePhone(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.mobilePhone));
        mobilePhone.clear();
        mobilePhone.sendKeys(str);
        return this;
    }

    public AccountPage fillInAlias(String str) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(this.alias));
        alias.clear();
        alias.sendKeys(str);
        return this;
    }

    public AccountPage clickSubmitAccountButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(this.submitAccountButton));
        submitAccountButton.click();
        return this;
    }
}
