package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.trello.sections.HeaderSection;
import testexecution.DriverManager;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;


public class StepDefsHeaderSection {


    HeaderSection headerSection = new HeaderSection(DriverManager.driver);

    @When("I click on the information icon")
    public void iClickOnTheInformationIcon() {
        headerSection.setInformationIconNavBar();
    }

    @When("I click on the Notifications icon")
    public void iClickOnTheNotificationsIcon() {
        headerSection.setNotificationsIconNavBar();
    }

    @When("I click on the Account icon")
    public void iClickOnTheAccountIcon() {
        headerSection.clickAccountIcon();
    }

    @And("Click on the Logout link")
    public void clickOnTheLogoutLink() {
        headerSection.clickLogoutLink();
    }

    @When("I click the dots icon from the top navigation bar")
    public void iClickTheDotsIconFromTheTopNavigationBar() {
        headerSection.clickDotsTopNavBar();
    }

    @When("I enter search criteria into the search box")
    public void iEnterSearchCriteriaIntoTheSearchBox() {
        headerSection.enterSearchCriteria("Test");
    }

    @When("I click on the Workspaces dropdown")
    public void iClickOnTheWorkspacesDropdown() {
        headerSection.clickWorkspacesDropdown();
    }

    @Then("the More from Atlassian menu options are displayed")
    public void theMoreFromAtlassianMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//span[contains(text(),'More Atlassian products')]")).isDisplayed());
    }

    @Then("able to select a search result")
    public void searchResultsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        WebElement searchresults = DriverManager.driver.findElement(By.xpath("//*[@data-test-id='search-dialog-input']"));
        searchresults.sendKeys(ARROW_DOWN);
        searchresults.sendKeys(ENTER);
        Thread.sleep(5000);
        Assert.assertEquals(DriverManager.driver.getTitle(), "Test | Trello");
    }

    @Then("information menu options are displayed")
    public void informationMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//a[text()='Pricing']")).isDisplayed());
    }

    @Then("notification menu options are displayed")
    public void notificationMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//h2[text()='Notifications']")).isDisplayed());
    }

    @Then("account menu options are displayed")
    public void accountMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//h2[text()='Account']")).isDisplayed());
    }

    @Then("my workspaces are displayed")
    public void myWorkspacesAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//h2[@class='HvHJoWyfA49Zz5'][contains(text(),'Your Workspaces')]")).isDisplayed());
    }
}
