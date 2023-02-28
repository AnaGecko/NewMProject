package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.LoggerApp;
import utilities.ReadConfig;


import java.util.concurrent.TimeUnit;

public class SetUp {


    WebDriver driver = new ChromeDriver();
    ReadConfig readconfig = new ReadConfig();
    private static final Logger logger = LogManager.getLogger(LoggerApp.class);




    public void openBrowser() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "Drivers/chromeDriver/chromedriver.exe");

//        WebDriver driver = new ChromeDriver();
//        String baseURL=readconfig.getApplicationURL();
//        driver = new ChromeDriver();
        FirefoxDriver WebDriver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("https://www.musala.com/");
        readconfig.getApplicationURL();
    }

}