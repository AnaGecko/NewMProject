package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUs;
import utilities.LoggerApp;
import utilities.ReadConfig;

import java.time.Duration;



//import static stepDefinitions.SetUp.driver;

public class InvalidEmail  {




    SetUp setup = new SetUp();

    ContactUs createForm;
    ReadConfig readconfig = new ReadConfig();
    WebDriverWait wait = new WebDriverWait(setup.driver, Duration.ofSeconds(10));
    private static final Logger logger = LogManager.getLogger(LoggerApp.class);



    @Given("user is on the page")
    public void user_is_on_the_page() {

        setup.driver.get(readconfig.getApplicationURL());
        WebElement acceptCookie = setup.driver.findElement(By.xpath("//a[@id=\"wt-cli-accept-all-btn\"]"));
        acceptCookie.click();
        WebElement contactUs = setup.driver.findElement(By.xpath("//button[@class=\"contact-label btn btn-1b\"]"));
        contactUs.click();

    }
    @And("fill all the required fields")
    public void fill_all_the_required_fields()
    {

        createForm = new ContactUs(setup.driver);
        createForm.enterContactName();
        createForm.wrongEmail();
        createForm.mobile();
        createForm.subject();
        createForm.addMessage();

    }
    @When("user click on Send")
    public void user_click_on_Send() {
        createForm.contactUsSendButton();
    }

    @Then("an error message is presented in the screen")
    public void an_error_message_is_presented_in_the_screen() {
        createForm.invalidEmailMessage();
        createForm.wrongEmailTwo();
        createForm.invalidEmailMessage();
        createForm.wrongEmailThree();
        createForm.invalidEmailMessage();
        createForm.wrongEmailFour();
        createForm.invalidEmailMessage();
        createForm.wrongEmailFive();
        setup.driver.quit();
    }

}
