package com.jejakin.test.testing;

import com.jejakin.base.baseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testingJejakin extends baseSetup {
    static WebDriverWait wait = new WebDriverWait(driver, 5, 5);

    public testingJejakin() {
        PageFactory.initElements(driver, "https://dev.jejak.travel/");
    }

    public static void main(String[] args) {



        By btn_Start_Jejakin = By.xpath("//a[@href = '/carbon' and (text() = 'Start')]");
        WebElement btnStart = wait.until(ExpectedConditions.presenceOfElementLocated(btn_Start_Jejakin));
        btnStart.click();
    }
}
