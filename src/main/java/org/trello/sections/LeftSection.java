package org.trello.sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.trello.common.ElementPresenceWait;

public class LeftSection {
    WebDriver driver;
    By homeLink = By.linkText("Home");
    By navigateToTempPage = By.xpath("//span[@class='DD3DlImSMT6fgc'][contains(text(),'Templates')]");

    //constructor that will be automatically called as soon as the object of the class is created
    public LeftSection(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage(){
        ElementPresenceWait.waitUntilTitleVisible(driver,"Boards | Trello");
        WebElement homeLk = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(homeLink));
        homeLk.click();
    }

    public void navigateToTempPage() {
        ElementPresenceWait.waitUntilTitleVisible(driver, "Boards | Trello" );
        WebElement navTemp = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(navigateToTempPage));
        navTemp.click();
    }

    public void setSelectTemplateFromLeftMenu(String temp){
        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(driver, header);
        By selectTemplateFromLeftMenu = By.xpath("//span[@class='DD3DlImSMT6fgc'][contains(text(),'"+temp+"')]");
        WebElement selLeftMenu = ElementPresenceWait.waitUntilClickable(driver,driver.findElement(selectTemplateFromLeftMenu) );
        selLeftMenu.click();
    }

}
