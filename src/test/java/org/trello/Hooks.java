package org.trello;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import testexecution.DriverManager;
import java.io.File;
import java.io.IOException;


public class Hooks {

    WebDriver driver;

    DriverManager driverManager = new DriverManager();
    @Before
    public void setup(){
        driver = driverManager.createDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://trello.com/login");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            File screenshotFile = ((TakesScreenshot) DriverManager.driver).getScreenshotAs(OutputType.FILE);
            File destfile = new File("C://Users//ZalanWadood//screenshot.png");
            FileUtils.copyFile(screenshotFile, destfile);
        }
        DriverManager.driver.close();
    }

}
