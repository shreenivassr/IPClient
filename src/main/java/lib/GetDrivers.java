package lib;

import com.experitest.selenium.MobileWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by RSSrinivas on 1/6/2016.
 */
public class GetDrivers {
    public static <T> T GetDriverInstance(String cap){
        T driver=null;
        if( cap.equals("chrome")){
            //driver = (T) new ChromeDriver();
            System.setProperty("webdriver.chrome.driver","C:\\Selenium drivers\\chromedriver.exe");
            driver = (T) new ChromeDriver();
        } else if ( cap.equals("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Selenium drivers\\IEDriverServer.exe");
            driver = (T) new InternetExplorerDriver();
        } else if ( cap.equals("mob_chrome")){
            driver = (T) new MobileWebDriver();
            ((MobileWebDriver)driver).setDevice();
            ((MobileWebDriver)driver).application();

        }
        return driver;
    }

    public static void main(String[] args) {
        GetDrivers d = new GetDrivers();

        System.out.println(d.GetDriverInstance("mob_chrome") instanceof  String);
        System.out.println(d.GetDriverInstance("chrome") instanceof  WebDriver);
    }
}

