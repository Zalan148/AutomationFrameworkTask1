package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.trello.pages.HomePage;
import testexecution.DriverManager;

public class StepDefsHomePage {


    HomePage homePage = new HomePage(DriverManager.driver);


    @When("I click on the Create a board link")
    public void iClickOnTheCreateABoardLink() {
        homePage.clickCreateABoardLink();
    }

    @And("Enter a board title from home page")
    public void enterABoardTitle() {
        homePage.setAddBoardTitle("Test");
    }

    @And("Click Create Board button from home page")
    public void clickCreateBoardButton() {
        homePage.clickCreateBoardBtn();
    }

    @Then("A board is created")
    public void aBoardIsCreated() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(DriverManager.driver.getTitle(), "Test | Trello");
    }

}
