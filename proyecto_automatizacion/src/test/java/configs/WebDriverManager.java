package configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webDriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--window-size=300,200");

            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
