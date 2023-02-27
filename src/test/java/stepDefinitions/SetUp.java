package stepDefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReadConfig;


import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SetUp {

    WebDriver driver = new ChromeDriver();
    ReadConfig readconfig = new ReadConfig();


    public void openBrowser() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "Drivers/chromeDriver/chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", projectPath + "Drivers/chromeDriver/geckodriver.exe");

        WebDriver driver = new ChromeDriver();
//        driver = new ChromeDriver();
        FirefoxDriver WebDriver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.musala.com/");

    }


}