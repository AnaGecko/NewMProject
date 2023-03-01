package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utilities.LoggerApp;
import utilities.ReadConfig;


import java.util.concurrent.TimeUnit;

public class SetUp {


    WebDriver driver = new ChromeDriver();
//    WebDriver driverr = new FirefoxDriver();

    ReadConfig readconfig = new ReadConfig();
    private static final Logger logger = LogManager.getLogger(LoggerApp.class);




    public void openBrowser() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "Drivers/chromeDriver/chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", projectPath + "Drivers/geckoDriver/geckodriver.exe");
//        FirefoxDriver WebDriver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        readconfig.getApplicationURL();
    }


//    WebDriver driver;
//    ReadConfig readconfig = new ReadConfig();
//    /**
//     * This function will execute before each Test tag in testng.xml
//     * @param browser
//     * @throws Exception
//     */
//    @BeforeTest
//    @Parameters("browser")
//    public void setup(String browser) throws Exception{
//        //Check if parameter passed from TestNG is 'firefox'
//        if(browser.equalsIgnoreCase("firefox")){
//            //create firefox instance
//            System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
//            driver = new FirefoxDriver();
//        }
//        //Check if parameter passed as 'chrome'
//        else if(browser.equalsIgnoreCase("chrome")){
//            //set path to chromedriver.exe
//            System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
//            //create chrome instance
//            driver = new ChromeDriver();
//        }
//        else{
//            //If no browser passed throw exception
//            throw new Exception("Browser is not correct");
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

}