package org.trello.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.trello.common.ElementPresenceWait;


public class HeaderSection {
    WebDriver driver;

    By informationIconNavBar = By.xpath("//span[@data-testid='HelpIcon']");
    By notificationsIconNavBar = By.xpath("//button[@data-testid='header-notifications-button']");
    By accountIcon = By.xpath("//span[@title='zalan.wadood (zalanwadood1)']");
    By logoutLink = By.xpath("//span[contains(text(),'Log out')]");
    By dotsTopNavBar = By.xpath("//span[@data-testid='ApplicationSwitcherIcon']");
    By searchCriteriaBox = By.xpath("//*[@placeholder='Search']");
    By workspacesDropdown = By.xpath("//span[@class='i67i1H0j1SpGBe'][text()='Workspaces']");
    By settingsLink = By.xpath("//Span[contains(text(), 'Settings')]");

    //constructor that will be automatically called as soon as the object of the class is created
    public HeaderSection(WebDriver driver) {
        this.driver = driver;
    }

    public void setInformationIconNavBar(){
        ElementPresenceWait.waitUntilTitleVisible(driver,"Boards | Trello");
        WebElement setInfoIcon = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(informationIconNavBar));
        setInfoIcon.click();
    }

    public void setNotificationsIconNavBar(){
        ElementPresenceWait.waitUntilTitleVisible(driver,"Boards | Trello");
        WebElement setNotif = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(notificationsIconNavBar));
        setNotif.click();
    }

    public void clickAccountIcon(){
        ElementPresenceWait.waitUntilTitleVisible(driver,"Home | Trello");
        WebElement setLink = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(settingsLink));
        setLink.click();
        WebElement acctIcn = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(accountIcon));
        acctIcn.click();
    }

    public void clickLogoutLink(){
        ElementPresenceWait.waitUntilTitleVisible(driver,"Zalan Wadood's workspace");
        WebElement logoutLk = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(logoutLink));
        logoutLk.click();
    }

    public void clickDotsTopNavBar(){
        ElementPresenceWait.waitUntilTitleVisible(driver,"Home | Trello");
        WebElement clickDots = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(dotsTopNavBar));
        clickDots.click();
    }

    public void enterSearchCriteria(String search) {
        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(driver, header);
        WebElement enterSearch = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(searchCriteriaBox));
        enterSearch.click();
        enterSearch.sendKeys(search);
    }

    public void clickWorkspacesDropdown(){
        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(driver, header);
        WebElement workSpacesDd = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(workspacesDropdown));
        workSpacesDd.click();
    }

}
