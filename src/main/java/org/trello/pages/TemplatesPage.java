package org.trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TemplatesPage {
    WebDriver driver;

    //locate each web element on the page
    By workspacesDropdown = By.xpath("//span[@class='Wl2FeSr_eBix8W'][text()='Workspaces']");
    By searchCriteriaBox = By.xpath("//*[@placeholder='Search']");

    //constructor that will be automatically called as soon as the object of the class is created
    public TemplatesPage(WebDriver driver) {
        this.driver = driver;
    }

    //perform corresponding actions after locating each web element
    public void setSelectTemplateFromLeftMenu(String temp){
        By selectTemplateFromLeftMenu = By.xpath("//span[@class='DD3DlImSMT6fgc'][contains(text(),'"+temp+"')]");
        driver.findElement(selectTemplateFromLeftMenu).click();
    }


    public void setSelectTemplateFromFeaturedCategories(String cat) {
        By selectTemplateFromFeaturedCat = By.xpath("//span[@class='A2qOFKWdcU_KeW'][contains(text(),'"+cat+"')]");
        driver.findElement(selectTemplateFromFeaturedCat).click();
    }


    public void clickWorkspacesDropdown(){
        driver.findElement(workspacesDropdown).click();
    }

    public void enterSearchCriteria(String search) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(searchCriteriaBox).click();

        driver.findElement(searchCriteriaBox).sendKeys(search);

    }
}
