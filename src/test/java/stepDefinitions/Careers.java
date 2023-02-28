package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUs;
import utilities.ReadConfig;

import java.time.Duration;


//import static stepDefinitions.SetUp.driver;

public class Careers {
    SetUp setup = new SetUp();
    ContactUs createForm;
    ReadConfig readconfig = new ReadConfig();
    WebDriverWait wait = new WebDriverWait(setup.driver, Duration.ofSeconds(10));



    @Given("user is on Career")
    public void user_is_on_Career() {
//        driver.get(baseURL);
        setup.driver.navigate().to("https://www.musala.com/");
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
        System.out.println(currentUrl);
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
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-4891\"]/div/div[3]")));
//        element.click();




//        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"post-4891\"]/div/div[2]/div[2]")));
//        element2.click();
        setup.driver.quit();

    }

}




