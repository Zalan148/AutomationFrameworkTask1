package org.trello.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BoardsPage {

    WebDriver driver;

    //locate each web element on the page
    By homeLink = By.linkText("Home");
    By createNewBoard = By.xpath("//div[@class='board-tile mod-add']");
    By selectBackground = By.xpath("//button[@title='Blue']");
    By viewAllClosedBoards = By.xpath("//button[text()='View all closed boards']");

    By existingBoard = By.xpath("//a[@style='background-color: rgb(0, 121, 191);']");

    By navigateToTempPage = By.xpath("//span[@class='DD3DlImSMT6fgc'][contains(text(),'Templates')]");
    By informationIconNavBar = By.xpath("//span[@aria-label='HelpIcon']");
    By notificationsIconNavBar = By.xpath("//button[@data-testid='header-notifications-button']");
    By boardsPageDisp = By.xpath("//button[contains(text(),'View all closed boards')]");

    //constructor that will be called as soon as the object of the class is created
    public BoardsPage(WebDriver driver) {
        this.driver = driver;
    }

    //perform corresponding actions after locating each web element
    public void navigateToHomePage(){
        driver.findElement(homeLink).click();
    }
    public void createNewBoard(){
        driver.findElement(createNewBoard).click();
    }
    public void setSelectBackground(){
        driver.findElement(selectBackground).click();
    }
    public void setViewAllClosedBoards(){
        driver.findElement(viewAllClosedBoards).click();
    }

    public void clickExistingBoard(){
        driver.findElement(existingBoard).click();
    }

    public void navigateToTempPage() {
        driver.findElement(navigateToTempPage).click();
    }
    public void setInformationIconNavBar(){
        driver.findElement(informationIconNavBar).click();
    }
    public void setNotificationsIconNavBar(){
        driver.findElement(notificationsIconNavBar).click();
    }
    public void boardsPageDisplayed(){

        driver.findElement(boardsPageDisp).isDisplayed();
    }

}
