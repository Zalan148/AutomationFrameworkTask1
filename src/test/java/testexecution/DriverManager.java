package testexecution;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DriverManager {

    static public WebDriver driver;

    String browser;

    public WebDriver createDriver() {

        browser = BrowserManager.browsertorun;

        if (browser.equals("chrome"))
        {
            WebDriverManager.chromedriver().create();
            driver = new ChromeDriver();
        } else if (browser.equals("edge"))
        {
            WebDriverManager.edgedriver().create();
            driver = new EdgeDriver();
        }

        return driver;
    }

}
