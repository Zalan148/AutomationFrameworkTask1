package org.trello.pages;
import org.openqa.selenium.*;
import org.trello.common.ElementPresenceWait;


public class LoginPage {
    WebDriver driver;

    //locate each web element on the page
    By userNameInput = By.id("user");
    By pwdInput = By.id("password");
    By loginWithAltassianBtn = By.id("login");
    By loginBtn = By.id("login-submit");
    By loginBtnInvalidDetails = By.id("login");
    By errorMessage = By.className("error-message");

    //constructor that will be called as soon as the object of the class is created
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        if(!driver.getTitle().equals("Log in to Trello")){
            throw new IllegalStateException("This is not login page. The current page is "
            + driver.getCurrentUrl());
        }
    }


    //perform corresponding actions after locating each web element
    public void enterUserName(String user){
        driver.findElement(userNameInput).sendKeys(user);
    }
    public void clickLoginWithAltassian() {
        WebElement loginButton = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(loginWithAltassianBtn));
        loginButton.click();
    }
    public void enterPassword(String pwd){

        ElementPresenceWait.waitUntilTitleVisible(driver, "Log in to continue");
        WebElement pwdBox = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(pwdInput));
        pwdBox.click();
        pwdBox.sendKeys(pwd);
    }
    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
    public void clickLoginInvalidDetails() {
        driver.findElement(loginBtnInvalidDetails).click();
    }
    public void displayErrorMess(){
        driver.findElement(errorMessage).isDisplayed();

    }

    public void enterPwdAfterInvalidUserName(String pwd){
        ElementPresenceWait.waitUntilTitleVisible(driver, "Log in to Trello");
        WebElement pwdBox = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(pwdInput));
        pwdBox.click();
        pwdBox.sendKeys(pwd);

    }

}
