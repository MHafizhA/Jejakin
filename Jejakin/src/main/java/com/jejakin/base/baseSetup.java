package com.jejakin.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseSetup {

    public static WebDriver driver;

    public static Properties properties;



    public baseSetup() {

        try {
            // code logic here
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/com/jejakin/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization()  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
