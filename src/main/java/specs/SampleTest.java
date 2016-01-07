package specs;

import com.experitest.selenium.MobileWebDriver;
import lib.GetDrivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import lib.GetDrivers;
/**
 * Created by RSSrinivas on 1/6/2016.
 */
public class SampleTest<T> {

    private WebDriver browser;


    @Parameters({"cap"})
    @BeforeTest
    public void setUp(String cap){
        browser = GetDrivers.GetDriverInstance(cap);

    }

    @Test
    public void SIPLogin(){

        browser =  browser instanceof WebDriver ? browser : (MobileWebDriver) browser;
        browser.


    }

}
