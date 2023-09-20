package org.trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.trello.common.ElementPresenceWait;

public class TemplatesPage {
    WebDriver driver;

    //constructor that will be automatically called as soon as the object of the class is created
    public TemplatesPage(WebDriver driver) {
        this.driver = driver;
    }

    //perform corresponding actions after locating each web element
    public void setSelectTemplateFromFeaturedCategories(String cat) {

        By header = By.xpath("//h1[text()='Featured categories']");
        ElementPresenceWait.waitUntilVisibilityLocated(driver, header);
        By selectTemplateFromFeaturedCat = By.xpath("//span[@class='A2qOFKWdcU_KeW'][contains(text(),'"+cat+"')]");
        WebElement selTemp = ElementPresenceWait.waitUntilClickable(driver, driver.findElement(selectTemplateFromFeaturedCat));
        selTemp.click();

    }

}
