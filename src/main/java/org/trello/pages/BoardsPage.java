package org.trello.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.trello.common.ElementPresenceWait;


public class BoardsPage {

    WebDriver driver;

    By addBoardTitle = By.xpath("//*[@data-testid='create-board-title-input']");
    By createNewBoard = By.xpath("//div[@class='board-tile mod-add']");

    By selectBackground = By.xpath("//button[@style='background-color: rgb(11, 80, 175); background-image: url(\"/assets/d106776cb297f000b1f4.svg\");']");

    By viewAllClosedBoards = By.xpath("//button[text()='View all closed boards']");
    By existingBoard = By.xpath("//div[@class='board-tile-details-sub-container']");
    By boardsPageDisp = By.xpath("//button[contains(text(),'View all closed boards')]");
    By createBoardBtn = By.xpath("//button[@data-testid='create-board-submit-button']");

    By boardTitleRequired = By.xpath("//p[text()='Board title is required']");

    //constructor that will be called as soon as the object of the class is created
    public BoardsPage(WebDriver driver) {
        this.driver = driver;
    }

    //perform corresponding actions after locating each web element
    public void createNewBoard(){
        WebElement createNewBd = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(createNewBoard));
        createNewBd.click();
    }
    public void setSelectBackground(){
        WebElement backGd = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(selectBackground));
        backGd.click();
    }
    public void setViewAllClosedBoards(){
        driver.findElement(viewAllClosedBoards).click();
    }

    public void clickExistingBoard(){
        driver.findElement(existingBoard).click();
    }

    public void boardsPageDisplayed(){
        ElementPresenceWait.waitUntilTitleVisible(driver, "Boards | Trello");
        ElementPresenceWait.waitUntilVisible(driver, driver.findElement(boardsPageDisp));
    }

    public void setAddBoardTitle(String title){
        ElementPresenceWait.waitUntilVisibilityLocated(driver, boardTitleRequired);
        WebElement l = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(addBoardTitle));
        l.click();
        l.sendKeys(title);
    }

    public void clickCreateBoardBtn(){
        driver.findElement(createBoardBtn).click();
    }


}
