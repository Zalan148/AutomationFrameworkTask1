package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.trello.pages.*;
import testexecution.DriverManager;
import static org.openqa.selenium.Keys.*;


public class StepDefs{

    WebDriver driver;
    LoginPage login;
    BoardsPage boardsPage;
    HomePage homePage;
    TemplatesPage templatesPage;

    DriverManager driverManager = new DriverManager();



    @Given("I have logged in successfully")
    public void iHaveLoggedInSuccessfully() throws InterruptedException {


        driver = driverManager.createDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://trello.com/login");
        login = new LoginPage(driver);
        login.enterUserName("zalan.wadood@roq.co.uk");
        login.clickLoginWithAltassian();
        Thread.sleep(5000);
        login.enterPassword("Mayday123!");
        login.clickLogin();
        Thread.sleep(5000);
    }

    @And("I am on the Home page")
    public void iAmOnTheHomePage() throws InterruptedException {
        boardsPage = new BoardsPage(driver);
        boardsPage.navigateToHomePage();
        Thread.sleep(5000);
    }


    @And("Enter a board title")
    public void enterABoardTitle() throws InterruptedException {
        homePage = new HomePage(driver);
        Thread.sleep(5000);
        homePage.setAddBoardTitle("Test");
        Thread.sleep(5000);
    }

    @And("Click Create Board button")
    public void clickCreateBoardButton() throws InterruptedException {
        homePage.clickCreateBoardBtn();
        Thread.sleep(5000);
    }

    @Then("A board is created")
    public void aBoardIsCreated() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(), "Test | Trello");
        Thread.sleep(5000);
        driver.close();
    }

    @And("I arrive at the Boards page")
    public void iArriveAtTheBoardsPage() throws InterruptedException {
        Thread.sleep(5000);
        boardsPage = new BoardsPage(driver);
        boardsPage.boardsPageDisplayed();
        driver.close();
    }


    @When("I click on Create New Board")
    public void iClickOnCreateNewBoard() {
        boardsPage.createNewBoard();
    }

    @And("Select a background image")
    public void selectABackgroundImage() {
        boardsPage.setSelectBackground();
    }

    @When("I click on View All Closed Boards")
    public void iClickOnViewAllClosedBoards() {
        boardsPage.setViewAllClosedBoards();
    }

    @Then("Boards that have been closed will be displayed")
    public void boardsThatHaveBeenClosedWillBeDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//button[@data-testid='close-board-delete-board-button']")).isDisplayed(), "Not on closed boards view");
        driver.close();
    }

    @When("I click on the Create a board link")
    public void iClickOnTheCreateABoardLink() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.clickCreateABoardLink();
        Thread.sleep(5000);
    }


    @When("I click on the Account icon")
    public void iClickOnTheAccountIcon() {
        homePage = new HomePage(driver);
        homePage.clickAccountIcon();
    }

    @And("Click on the Logout link")
    public void clickOnTheLogoutLink() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickLogoutLink();
    }


    @And("I am on the Templates page")
    public void iArriveAtTheTemplatesPage() throws InterruptedException {
        boardsPage = new BoardsPage(driver);
        Thread.sleep(5000);
        boardsPage.navigateToTempPage();
        Thread.sleep(5000);
    }

    @When("I select {string} from the left hand side menu")
    public void iSelectFromTheLeftHandSideMenu(String temp) {
        templatesPage = new TemplatesPage(driver);
        templatesPage.setSelectTemplateFromLeftMenu(temp);
    }

    @Then("the template gallery for {string} is displayed")
    public void theTemplateGalleryForIsDisplayed(String template) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'"+template+"')]")).isDisplayed());
        driver.close();


    }


    @When("I click the dots icon from the top navigation bar")
    public void iClickTheDotsIconFromTheTopNavigationBar() {
        homePage = new HomePage(driver);
        homePage.clickDotsTopNavBar();
    }

    @Then("the More from Atlassian menu options are displayed")
    public void theMoreFromAtlassianMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'More Atlassian products')]")).isDisplayed());
        driver.close();
    }


    @Then("able to select a search result")
    public void searchResultsAreDisplayed() throws InterruptedException {

        Thread.sleep(5000);
        WebElement searchresults = driver.findElement(By.xpath("//*[@data-test-id='search-dialog-input']"));
        searchresults.sendKeys(ARROW_DOWN);
        searchresults.sendKeys(ENTER);
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Test | Trello");
        driver.close();
    }

    @When("I click on the information icon")
    public void iClickOnTheInformationIcon() {
        boardsPage.setInformationIconNavBar();
    }

    @Then("information menu options are displayed")
    public void informationMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Pricing']")).isDisplayed());
        driver.close();
    }

    @When("I click on the Notifications icon")
    public void iClickOnTheNotificationsIcon() {
        boardsPage.setNotificationsIconNavBar();
    }

    @Then("notification menu options are displayed")
    public void notificationMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Notifications']")).isDisplayed());
        driver.close();
    }

    @Then("account menu options are displayed")
    public void accountMenuOptionsAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Account']")).isDisplayed());
        driver.close();
    }


    @Given("I am on the Trello login page")
    public void iAmOnTheTrelloLoginPage() {


        driver = driverManager.createDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://trello.com/login");
    }

    @When("I enter valid login credentials")
    public void iEnterValidLoginCredentials() throws InterruptedException {
        login = new LoginPage(driver);
        login.enterUserName("zalan.wadood@roq.co.uk");
        login.clickLoginWithAltassian();
        Thread.sleep(5000);
        login.enterPassword("Mayday123!");
    }

    @And("submit the details")
    public void submitTheDetails() {
        login.clickLogin();
    }

    @And("submit the invalid details")
    public void submitTheInvalidDetails() {
        login.clickLoginInvalidDetails();
    }

    @When("I enter {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) throws InterruptedException {
        login = new LoginPage(driver);
        login.enterUserName(username);
        login.clickLoginWithAltassian();
        Thread.sleep(5000);
        login.enterPassword(password);
        Thread.sleep(5000);
    }

    @Then("an error message will be displayed")
    public void anErrorMessageWillBeDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        login.displayErrorMess();
        driver.close();
    }

    @Then("I am logged out of Trello and log out of your Atlassian account page is displayed")
    public void logOutOfYourAtlassianAccountPageIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//h5[contains(text(),'Log out of your Atlassian account')]")).isDisplayed());
        driver.close();
    }

    @When("I enter no Username")
    public void userEntersNoUsername() {
        login = new LoginPage(driver);
        login.enterUserName("");
    }

    @And("Click the Continue button")
    public void clicksTheContinueButton() {
        login.clickLoginWithAltassian();
    }

    @Then("Continue button remains displayed")
    public void userIsNotAbleToSeeTheLoginButton() {
        Assert.assertTrue(driver.findElement(By.id("login")).isDisplayed());
        driver.close();

    }

    @When("I click on an existing board")
    public void iClickOnAnExistingBoard() {
        boardsPage.clickExistingBoard();
        
    }

    @Then("board is displayed")
    public void boardIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@title='Board']")).isDisplayed());
        driver.close();
    }


    @When("I select {string} from the featured categories")
    public void iSelectFromTheFeaturedCategories(String cat) {
        templatesPage = new TemplatesPage(driver);
        templatesPage.setSelectTemplateFromFeaturedCategories(cat);

    }

    @When("I click on the Workspaces dropdown")
    public void iClickOnTheWorkspacesDropdown() {
        templatesPage = new TemplatesPage(driver);
        templatesPage.clickWorkspacesDropdown();
    }


    @Then("my workspaces are displayed")
    public void myWorkspacesAreDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='JcyewqfbHwlRb6'][contains(text(),'Your Workspaces')]")).isDisplayed());
        driver.close();
    }

    @When("I enter search criteria into the search box")
    public void iEnterSearchCriteriaIntoTheSearchBox() throws InterruptedException {
        templatesPage = new TemplatesPage(driver);
        templatesPage.enterSearchCriteria("Test");

    }

    @And("I arrive at Boards page")
    public void iArriveAtBoardsPage() throws InterruptedException {
        Thread.sleep(5000);
        boardsPage = new BoardsPage(driver);
        boardsPage.boardsPageDisplayed();
    }

    @And("I arrive Boards page")
    public void iArriveBoardsPage() throws InterruptedException {
        Thread.sleep(5000);
        boardsPage = new BoardsPage(driver);
        boardsPage.boardsPageDisplayed();
    }
}
