package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OfficePage extends SetUp {

    @Given("user is on Stynt page")
    public void user_is_on_Stynt_page() {
        driver.navigate().to("https://qa.stynt.com/");
    }

    @When("user click on the login button")
    public void user_click_on_the_login_button() {
        System.out.println("The text box is populated");
        WebElement officeLogin = driver.findElement(By.xpath("//a[@id='officesSiteLink']"));
        officeLogin.click();
        WebElement advance = driver.findElement(By.xpath("//button[@class=\"secondary-button small-link\"]"));
        advance.click();
        WebElement proceed = driver.findElement(By.xpath("//a[@class='small-link']"));
        proceed.click();
    }
    @And("accept cookies")
    public void accept_cookies() {
        WebElement acceptCokiee = driver.findElement(By.xpath("//button[@class='cc-btn cc-dismiss btn btn-orange']"));
        acceptCokiee.click();
    }
    @Then("user is navigated to the login page")
    public void user_is_navigated_to_the_login_page() {
        System.out.println("The user is navigated to login page");
    driver.quit();
    }


}
