package org.trello;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import testexecution.DriverManager;

public class StepDefsLogoutPage {


    @Then("I am logged out of Trello and log out of your Atlassian account page is displayed")
    public void logOutOfYourAtlassianAccountPageIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//h5[contains(text(),'Log out of your Atlassian account')]")).isDisplayed());
    }
}
