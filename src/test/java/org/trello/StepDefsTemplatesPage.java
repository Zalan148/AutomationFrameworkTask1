package org.trello;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.trello.pages.TemplatesPage;
import testexecution.DriverManager;

public class StepDefsTemplatesPage {


    TemplatesPage templatesPage = new TemplatesPage(DriverManager.driver);

    @When("I select {string} from the featured categories")
    public void iSelectFromTheFeaturedCategories(String cat) {
        templatesPage.setSelectTemplateFromFeaturedCategories(cat);
    }

    @Then("the template gallery for {string} is displayed")
    public void theTemplateGalleryForIsDisplayed(String template) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(DriverManager.driver.findElement(By.xpath("//span[contains(text(),'"+template+"')]")).isDisplayed());
    }

}
