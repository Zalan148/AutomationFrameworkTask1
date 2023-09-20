package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.trello.pages.BoardsPage;
import testexecution.DriverManager;


public class StepDefsBoardsPage {

    BoardsPage boardsPage = new BoardsPage(DriverManager.driver);

    @And("I arrive Boards page")
    public void iArriveBoardsPage(){
        boardsPage.boardsPageDisplayed();
    }

    @When("I click on Create New Board")
    public void iClickOnCreateNewBoard() {
        boardsPage.createNewBoard();
    }

    @And("Select a background image")
    public void selectABackgroundImage() {
        boardsPage.setSelectBackground();
    }

    @When("I click on an existing board")
    public void iClickOnAnExistingBoard() {
        boardsPage.clickExistingBoard();
    }

    @Then("board is displayed")
    public void boardIsDisplayed() throws InterruptedException{
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//span[@data-testid='view-switcher-button-text'][contains(text(), 'Board')]")).isDisplayed());
        }

    @When("I click on View All Closed Boards")
    public void iClickOnViewAllClosedBoards() {
        boardsPage.setViewAllClosedBoards();
    }

    @Then("Boards that have been closed will be displayed")
    public void boardsThatHaveBeenClosedWillBeDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//button[@data-testid='close-board-delete-board-button']")).isDisplayed(), "Not on closed boards view");
    }


    @And("I arrive at the Boards page")
    public void iArriveAtTheBoardsPage() throws InterruptedException {
        Thread.sleep(5000);
        //16/09 could later update below to Boolean checkButtonPresence = SignInButton.isDisplayed(); Assert.assertTrue(checkButtonPresence);
        boardsPage.boardsPageDisplayed();
    }


    @And("I arrive at Boards page")
    public void iArriveAtBoardsPage() {
        boardsPage.boardsPageDisplayed();
    }

    @And("Enter a board title from Boards page")
    public void enterABoardTitleFromBoardsPage(){
        boardsPage.setAddBoardTitle("Test");
    }

    @And("Click Create Board button from Boards page")
    public void clickCreateBoardButtonFromBoardsPage() {
        boardsPage.clickCreateBoardBtn();
    }
}
