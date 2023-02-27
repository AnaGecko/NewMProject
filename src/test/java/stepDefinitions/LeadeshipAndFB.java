package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ContactUs;
import utilities.ReadConfig;


public class LeadeshipAndFB {

    static SetUp setup = new SetUp();
    ContactUs createForm;
    ReadConfig readconfig = new ReadConfig();
//    WebDriver driver;
//

    @Test
    @Given("user is on home page")
    public void user_is_on_home_page() {
        readconfig.getApplicationURL();
//        setup.driver.navigate().to("https://www.musala.com/");
        WebElement acceptCookie = setup.driver.findElement(By.xpath("//a[@id=\"wt-cli-accept-all-btn\"]"));
        acceptCookie.click();

    }

    @When("user click on Company")
    public void user_click_on_Company() {
//       leadership.clickCompany();
        WebElement company = setup.driver.findElement(By.xpath("//div[@id=\"navbar\"]/div/ul/li[1]/a"));
        company.click();

    }

    @And("verify URL and Leadership section")
    public void verify_URL_and_Leadership_section() {

        WebElement leadership = setup.driver.findElement(By.xpath("//div[@class='cm-content']/h2"));
        leadership.getText();
        String currentUrl = setup.driver.getCurrentUrl();
        System.out.println(currentUrl);

    }

    @Then("click on FB page")
    public void click_on_FB_page() {
        WebElement company = setup.driver.findElement(By.xpath("//*[contains(@href,'https://www.facebook.com/MusalaSoft?fref=ts')]"));
        company.click();
        setup.driver.findElement(By.xpath("//*[contains(@href,'https://www.facebook.com/MusalaSoft?fref=ts')]")).getText();
    }


    @And("verify that a new page is opened in new browser")
    public void verify_that_a_new_page_is_opened_in_new_browser() {
    }

}




