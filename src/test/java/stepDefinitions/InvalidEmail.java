package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ContactUs;
import utilities.ReadConfig;

//import static stepDefinitions.SetUp.driver;

public class InvalidEmail {

//    WebDriver driver;


    SetUp setup = new SetUp();
//    LeadershipAndFb login;
    ContactUs createForm;
    ReadConfig readconfig = new ReadConfig();


    @Given("user is on the page")
    public void user_is_on_the_page() {

//        readconfig.getApplicationURL();
        setup.driver.navigate().to("https://www.musala.com/");
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
        createForm.invalidEmailMessage();
        setup.driver.quit();
    }

}
