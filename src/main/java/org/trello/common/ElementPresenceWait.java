package org.trello.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//slows execution down
public class ElementPresenceWait {
    public static WebElement waitUntilClickable(WebDriver driver, WebElement element){
            WebDriverWait wait = new WebDriverWait(driver, 5000);
            WebElement elmClick = wait.until(ExpectedConditions.elementToBeClickable(element));
            return  elmClick;

    }

    public static void waitUntilVisible(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void waitUntilTitleVisible(WebDriver driver, String title) {
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.titleContains(title));

    }

    public static void waitUntilVisibilityLocated(WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
