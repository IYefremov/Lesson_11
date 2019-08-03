//        1. Create a new Maven project;
//        2. Add TestNG dependency and Selenium Web Driver;
//        3. Add several test classes and 4-5 tests to each class.
//        4. Write @BeforeTest method where you should create your instance of a
//        WebDriver.
//        5. Write @AfterTest method where you should close your browser.
//        6. Add a testng.xml configuration file.
//        7. Configure the test suite to run all tests from the first class and only two from the second.
//        8. Create a @DataProvider method to generate some data for your tests.
//        9. Add your data provider to any test you wish."


package com.mycompany.app;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManagerException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestPage {

    private CommonHeaderPage commPage;

    public WebDriver driver;


    @DataProvider(name = "dataName")
    public Object[][] testData() {
        return new Object[][]{
                new Object[]{"Mrs.", "Ivan", "Yefremov", "123456789", "2",
                        "June ", "1973  ", "Roga i Kopyta", "Address11", "Address21",
                        "Vinnitsia", "Arizona", "12345", "United States", "1223456789146",
                        "45654213254", "alias1"},
                new Object[]{"Mr.", "Sasha", "Ivanova", "123456789", "2",
                        "June ", "1973  ", "The firm", "Address12", "Address22",
                        "Vinnitsia", "Arizona", "12345", "United States", "1223456789146",
                        "45654213254", "alias1"}
        };
    }


    @BeforeTest
    public void setup() {
        Properties configur = new Properties();

        driver = AvailableBrowsers.getDriver("CHROME"); // "CHROME", "FIREFOX", "EDGE"

        try {
            configur.load(new FileInputStream("G:\\\\QAAutoCourses\\\\Lesson_11\\\\Lesson_11\\\\target\\\\res.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        driver.get(configur.getProperty("baseurl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test(dataProvider = "dataName")
    public void testBody(String gender, String firstCustomerName, String lastCustomerName, String pass, String day,
                         String month, String year, String company, String address1, String address2,
                         String city, String state, String postCode, String country, String phone_home,
                         String phone_mobile, String alias) {


        // main page
        CommonHeaderPage commPage = new CommonHeaderPage(driver);
        commPage.clickSignInButton();

        // Authentication page
        Authentication authentication = new Authentication(driver);
        authentication.fillInEmailInputField("Ivan" + RandomStringUtils.randomNumeric(8) + "@gmail.com");
        authentication.clickCreateAccountButton();

        //Account page
        Account account = new Account.BuildAccount()
                .withGender(gender)
                .withFirstCustomerName(firstCustomerName)
                .withLastCustomerName(lastCustomerName)
                .withPass(pass)
                .withDay(day)
                .withMonth(month)
                .withYear(year)
                .withCompany(company)
                .withAddress1(address1)
                .withAddress2(address2)
                .withCity(city)
                .withState(state)
                .withPostcode(postCode)
                .withCountry(country)
                .withPhone_home(phone_home)
                .withPhone_mobile(phone_mobile)
                .withAlias(alias)
                .build();

        AccountPage accountPage = new AccountPage(driver);

        //Fill in the registration form
        accountPage.fillInGender(account.getGender());
        accountPage.fillInCustomerFirstName(account.getFirstCustomerName());
        accountPage.fillInCustomerLastName(account.getLastCustomerName());
        accountPage.fillInPassword(account.getPass());
        //  accountPage.fillInDay(account.getDay());
        //  accountPage.fillInMonth(account.getMonth());
        //  accountPage.fillInYear(account.getYear());
        accountPage.fillInCompany(account.getCompany());
        accountPage.fillInAddress1(account.getAddress1());
        accountPage.fillInAddress2(account.getAddress2());
        accountPage.fillInCity(account.getCity());
        accountPage.fillInState(account.getState());
        accountPage.fillInPostCode(account.getPostcode());
        accountPage.fillInCountry(account.getCountry());
        accountPage.fillInHomePhone(account.getPhone_home());
        accountPage.fillInMobilePhone(account.getPhone_mobile());
        accountPage.fillInAlias(account.getAlias());
        accountPage.clickSubmitAccountButton();

        // main page
        commPage.clickLogMeOut();
    }


    @Test(invocationCount = 3)
    public void test3_TestPage() {
        System.out.println("test3_TestPage");
    }

    @Test
    public void test4_TestPage() {
        System.out.println("test4_TestPage");
    }

    @AfterTest
    public void cleanup() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
