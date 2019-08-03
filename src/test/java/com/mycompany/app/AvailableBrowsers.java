package com.mycompany.app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AvailableBrowsers {
    private AvailableBrowsers() {
    }

    public static WebDriver getDriver(String browser) {

        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                WebDriver chromeDriver = new ChromeDriver();
                return chromeDriver;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                WebDriver firefoxDriver = new FirefoxDriver();
                return firefoxDriver;
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                WebDriver edgeDriver = new EdgeDriver();
                return edgeDriver;
            default:
                throw new IllegalArgumentException("No implementation for provided driver type");

        }
    }
}
