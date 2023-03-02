package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUs;
import utilities.LoggerApp;
import utilities.ReadConfig;

import java.time.Duration;


//import static stepDefinitions.SetUp.driver;

public class Careers {
    SetUp setup = new SetUp();
    ContactUs createForm;
    ReadConfig readconfig = new ReadConfig();
    WebDriverWait wait = new WebDriverWait(setup.driver, Duration.ofSeconds(10));
    JavascriptExecutor jse = (JavascriptExecutor)setup.driver;

    Actions actions = new Actions(setup.driver);
//    FirefoxDriver waitt = new FirefoxDriver();

//    FirefoxDriver WebDriver = new FirefoxDriver(setup.driver, Duration.ofSeconds(10));
    private static final Logger logger = LogManager.getLogger(LoggerApp.class);



    @Given("user is on Career")
    public void user_is_on_Career() {

        setup.driver.get(readconfig.getApplicationURL());
//        setup.driverr.get(readconfig.getApplicationURL());
//        setup.driver.navigate().to("https://www.musala.com/");
        WebElement acceptCookie = setup.driver.findElement(By.xpath("//a[@id=\"wt-cli-accept-all-btn\"]"));
        acceptCookie.click();
        WebElement careers = setup.driver.findElement(By.xpath("//*[@id=\"menu-main-nav-1\"]/li[5]/a"));
        careers.click();
    }
    @When("click on Open Position")
    public void click_on_Open_Position() {
        WebElement careers = setup.driver.findElement(By.xpath("//button[@class=\"contact-label contact-label-code btn btn-1b\"]"));
        careers.click();
        String currentUrl = setup.driver.getCurrentUrl();
        logger.info(currentUrl);
//        System.out.println(currentUrl);
        WebElement anywhere = setup.driver.findElement(By.xpath("//select[@name=\"get_location\"]/option[5]"));
        anywhere.click();
    }

    @Then("click on open Job")
    public void click_on_open_Job() {
        WebElement clickJob = setup.driver.findElement(By.xpath("//div[@class=\"inner-wraper\"]/article[1]"));
        clickJob.click();
        boolean whatWeOffer = setup.driver.findElement(By.xpath("//*[@id=\"post-5397\"]//div[2]/div[2]/div[2]")).isDisplayed();
        boolean responsibilities = setup.driver.findElement(By.xpath("//*[@id=\"post-5397\"]//div/div[1]/div[2]/div[1]/div[2]")).isDisplayed();
        boolean generalDescription = setup.driver.findElement(By.xpath("//*[@id=\"post-5397\"]//div[2]/div[1]/div[1]/div[1]/div[2]")).isDisplayed();
        boolean requirements = setup.driver.findElement(By.xpath("//*[@id=\"post-5397\"]//div[2]/div[1]/div[1]/div[2]/div[2]")).isDisplayed();
        boolean apply = setup.driver.findElement(By.xpath("//input[@value=\"Apply\"]")).isDisplayed();
        jse.executeScript("scroll(0, 250)");
        WebElement m = setup.driver.findElement(By.xpath("//a[@class =\"fancybox\"]/input[@type=\"button\"]"));
        JavascriptExecutor j = (JavascriptExecutor) setup.driver;
        j.executeScript("arguments[0].click();", m);

        setup.driver.findElement(By.xpath("//input[@name=\"your-name\"]")).sendKeys("");
        setup.driver.findElement(By.xpath("//input[@name=\"your-email\"]")).sendKeys("test@");
        setup.driver.findElement(By.xpath("//input[@name=\"mobile-number\"]")).sendKeys("078123123");
        setup.driver.findElement(By.xpath("//input[@class=\"wpcf7-form-control wpcf7-file label-cf\"]")).sendKeys("C:\\picture.jpg");
        setup.driver.findElement(By.xpath("//span[@data-name=\"your-message\"]/textarea")).sendKeys("Test");
        String invalidMessage = setup.driver.findElement(By.xpath("//span[@data-name=\"your-email\"]/span")).getText();
        logger.info(invalidMessage);
        String emptyName = setup.driver.findElement(By.xpath("//span[@data-name=\"your-name\"]/span")).getText();
        logger.info(emptyName);



        setup.driver.quit();

    }

}




