package org.trello;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.trello.sections.LeftSection;
import testexecution.DriverManager;

public class StepDefsLeftSection {


    LeftSection leftSection = new LeftSection(DriverManager.driver);

    @And("I am on the Home page")
    public void iAmOnTheHomePage() {
        leftSection.navigateToHomePage();
    }

    @And("I am on the Templates page")
    public void iArriveAtTheTemplatesPage() {
        leftSection.navigateToTempPage();
    }

    @When("I select {string} from the left hand side menu")
    public void iSelectFromTheLeftHandSideMenu(String temp) {
        leftSection.setSelectTemplateFromLeftMenu(temp);
    }
}
