package org.trello.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class HomePage {
    WebDriver driver;

    //locate each web element on the page
    By addBoardTitle = By.xpath("//*[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']");

    By createBoardBtn = By.xpath("//button[@data-testid='create-board-submit-button']");

    By createABoard = By.xpath("//span[text()='Create a board']");
    By accountIcon = By.xpath("//*[@class='DweEFaF5owOe02 rQ86P0iNikD4I9 Cg0RMJhBknTRbM']");
    By logoutLink = By.xpath("//span[contains(text(),'Log out')]");

    By dotsTopNavBar = By.xpath("//span[@aria-label='ApplicationSwitcherIcon']");

    //constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        this.driver = driver;
        }

    //perform corresponding actions after locating each web element
    public void setAddBoardTitle(String title){
        driver.findElement(addBoardTitle).sendKeys(title);

    }

    public void clickCreateBoardBtn(){
        driver.findElement(createBoardBtn).click();
    }

    public void clickCreateABoardLink(){
        driver.findElement(createABoard).click();
    }

    public void clickAccountIcon(){
        driver.findElement(accountIcon).click();
    }

    public void clickLogoutLink(){
        driver.findElement(logoutLink).click();
    }

    public void clickDotsTopNavBar(){
        driver.findElement(dotsTopNavBar).click();
    }


}
