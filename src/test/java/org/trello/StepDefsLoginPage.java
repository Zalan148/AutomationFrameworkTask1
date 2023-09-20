package org.trello;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.trello.pages.LoginPage;
import testexecution.DriverManager;


public class StepDefsLoginPage {

    LoginPage login;

    @Given("I have logged in successfully")
    public void iHaveLoggedInSuccessfully() {
        String pwd = "Mssdae127!";
        login = new LoginPage(DriverManager.driver);
        login.enterUserName("zalan.wadood@roq.co.uk");
        login.clickLoginWithAltassian();
        login.enterPassword(pwd);
        login.clickLogin();
    }

    @Given("I am on the Trello login page")
    public void iAmOnTheTrelloLoginPage() {
       login = new LoginPage(DriverManager.driver);
    }

    @When("I enter valid login credentials")
    public void iEnterValidLoginCredentials() {
        login.enterUserName("zalan.wadood@roq.co.uk");
        login.clickLoginWithAltassian();
        login.enterPassword("Mssdae127!");
    }

    @And("submit the details")
    public void submitTheDetails() {
        login.clickLogin();
    }

    @When("I enter no Username")
    public void userEntersNoUsername() {
        login.enterUserName("");
    }

    @And("Click the Continue button")
    public void clicksTheContinueButton() {
        login.clickLoginWithAltassian();
    }

    @Then("Continue button remains displayed")
    public void userIsNotAbleToSeeTheLoginButton() {
        Assert.assertTrue(DriverManager.driver.findElement(By.id("login")).isDisplayed());
    }

    @When("I enter {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        login.enterUserName(username);
        login.clickLoginWithAltassian();
        login.enterPwdAfterInvalidUserName(password);
    }

    @And("submit the invalid details")
    public void submitTheInvalidDetails() {
        login.clickLoginInvalidDetails();
    }

    @Then("an error message will be displayed")
    public void anErrorMessageWillBeDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        login.displayErrorMess();
    }
}
