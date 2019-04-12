package cucumberWebTest;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    public WebDriverWait getWait(WebDriver driver) {
        return  new WebDriverWait(driver,15);

    }

    public static WebDriver getDriver(String browser) throws MalformedURLException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kostadin Mladenov\\Documents\\Coding\\BrowserWebDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver", "C:\\Users\\Kostadin Mladenov\\Documents\\Coding\\BrowserWebDrivers\\MicrosoftWebDriver.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kostadin Mladenov\\Documents\\Coding\\BrowserWebDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if(browser.equals("local")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            driver = new ChromeDriver();
                DesiredCapabilities caps = new DesiredCapabilities();
                Capabilities chromeCapabilities = DesiredCapabilities.chrome();
                driver = new RemoteWebDriver(new URL("http://seleniumhub:4444/wd/hub"),chromeCapabilities);
        }

        return driver;
    }
}
