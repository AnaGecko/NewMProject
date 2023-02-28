package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUs;
import utilities.LoggerApp;
import utilities.ReadConfig;

import java.time.Duration;

//import static stepDefinitions.SetUp.driver;

public class OpenPossitionSofia {

    SetUp setup = new SetUp();
    ContactUs createForm;
    ReadConfig readconfig = new ReadConfig();
    WebDriverWait wait = new WebDriverWait(setup.driver, Duration.ofSeconds(10));
    private static final Logger logger = LogManager.getLogger(LoggerApp.class);


    @Given("user is on Career page")
    public void user_is_on_career_page() {
//        readconfig.getApplicationURL();
        setup.driver.navigate().to("https://www.musala.com/");
        WebElement acceptCookie = setup.driver.findElement(By.xpath("//a[@id=\"wt-cli-accept-all-btn\"]"));
        acceptCookie.click();
        WebElement careers = setup.driver.findElement(By.xpath("//*[@id=\"menu-main-nav-1\"]/li[5]/a"));
        careers.click();
    }

    @When("click on Open Position page")
    public void click_on_open_position_page() {
        WebElement careers = setup.driver.findElement(By.xpath("//button[@class=\"contact-label contact-label-code btn btn-1b\"]"));
        careers.click();
        String currentUrl = setup.driver.getCurrentUrl();
        logger.info(currentUrl);
//        System.out.println(currentUrl);
        WebElement sofia = setup.driver.findElement(By.xpath("//select[@name=\"get_location\"]/option[3]"));
        sofia.click();
    }

    @Then("filter available position by cities")
    public void filter_available_position_by_cities() {
        System.out.println("Sofia");
        WebElement positionOne = setup.driver.findElement(By.xpath("//*[text()='User experience (UX) designer']"));
        positionOne.getText();
        WebElement moreInfoOne = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/user-experience-ux-designer/\"]"));
        moreInfoOne.getText();

        WebElement positionTwo =setup.driver.findElement(By.xpath("//*[text()='Employee Relations Support Specialist']"));
        positionTwo.getText();
        WebElement moreInfoTwo = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/employee-relations-support-specialist/\"]"));
        moreInfoTwo.getText();

        WebElement positionThree = setup.driver.findElement(By.xpath("//*[text()='Join us as an UI/UX Designer!']"));
        positionTwo.getText();
        WebElement moreInfoThree = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/ui-ux-designer/\"]"));
        moreInfoTwo.getText();

        WebElement positionFour = setup.driver.findElement(By.xpath("//*[text()='Business Development Associate']"));
        positionTwo.getText();
        WebElement moreInfoFour = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/business-development-associate/\"]"));
        moreInfoTwo.getText();

        WebElement positionFive = setup.driver.findElement(By.xpath("//*[text()='Data Engineer-AWS']"));
        positionTwo.getText();
        WebElement moreInfoFive = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/data-engineer-aws/\"]"));
        moreInfoTwo.getText();

        WebElement positionSix = setup.driver.findElement(By.xpath("//*[text()='Join us as an Accounting Expert!']"));
        positionTwo.getText();
        WebElement moreInfoSix = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/accounting-expert/\"]"));
        moreInfoTwo.getText();

        WebElement positionSeven = setup.driver.findElement(By.xpath("//*[text()='Senior Java Developer']"));
        positionTwo.getText();
        WebElement moreInfoSeven = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/senior-java-developer/\"]"));
        moreInfoTwo.getText();

        WebElement positionEight = setup.driver.findElement(By.xpath("//*[text()='DevOps Engineer']"));
        positionTwo.getText();
        WebElement moreInfoEight = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/devops-engineer/\"]"));
        moreInfoTwo.getText();

        WebElement positionNine = setup.driver.findElement(By.xpath("//*[text()='Full-Stack Developer']"));
        positionTwo.getText();
        WebElement moreInfoNine = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/full-stack-developer-3/\"]"));
        moreInfoTwo.getText();

        WebElement positionTen = setup.driver.findElement(By.xpath("//*[text()='Node.js Developer']"));
        positionTwo.getText();
        WebElement moreInfoTen = setup.driver.findElement(By.xpath("//a[@href=\"https://www.musala.com/job/node-js-developer/\"]"));
        moreInfoTwo.getText();





        logger.info("Position:"+ positionOne);
        logger.info("More Info:"+ moreInfoOne);

        logger.info("Position:"+ positionTwo);
        logger.info("More Info:"+ moreInfoTwo);

        logger.info("Position:"+ positionThree);
        logger.info("More Info:"+ moreInfoThree);

        logger.info("Position:"+ positionFour);
        logger.info("More Info:"+ moreInfoFour);

        logger.info("Position:"+ positionFive);
        logger.info("More Info:"+ moreInfoFive);

        logger.info("Position:"+ positionSix);
        logger.info("More Info:"+ moreInfoSix);

        logger.info("Position:"+ positionSeven);
        logger.info("More Info:"+ moreInfoSeven);

        logger.info("Position:"+ positionEight);
        logger.info("More Info:"+ moreInfoEight);

        logger.info("Position:"+ positionNine);
        logger.info("More Info:"+ moreInfoNine);

        logger.info("Position:"+ positionTen);
        logger.info("More Info:"+ moreInfoTen);
        setup.driver.quit();


    }

}


