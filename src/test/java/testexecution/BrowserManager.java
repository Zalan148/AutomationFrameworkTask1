package testexecution;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserManager {

   @Test
   @Parameters({"browser"})
    public void BrowserSelect(String browser){
       browsertorun = browser;
    }

    static String browsertorun;

}
