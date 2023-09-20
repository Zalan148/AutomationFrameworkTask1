package org.trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.trello.common.ElementPresenceWait;


public class HomePage {
    WebDriver driver;

    By addBoardTitle = By.xpath("//*[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']");
    By createBoardBtn = By.xpath("//button[@data-testid='create-board-submit-button']");
    By createABoard = By.xpath("//span[text()='Create a board']");
    By boardTitleRequired = By.xpath("//p[text()='Board title is required']");

    //constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //perform corresponding actions after locating each web element
    public void setAddBoardTitle(String title){
        ElementPresenceWait.waitUntilVisibilityLocated(driver, boardTitleRequired);
        WebElement addTitle = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(addBoardTitle));
        addTitle.sendKeys(title);
    }

    public void clickCreateBoardBtn(){
        driver.findElement(createBoardBtn).click();
    }

    public void clickCreateABoardLink(){
        driver.findElement(createABoard).click();
    }


}
