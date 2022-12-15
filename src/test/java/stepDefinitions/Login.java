package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends SetUp{


    @Given("user is on login page")
    public void user_is_on_login_page() {


        driver.navigate().to("https://qa.stynt.com/");
        WebElement officeLogin = driver.findElement(By.xpath("//a[@id='officesSiteLink']"));
        officeLogin.click();
        WebElement advance = driver.findElement(By.xpath("//button[@class=\"secondary-button small-link\"]"));
        advance.click();
        WebElement proceed = driver.findElement(By.xpath("//a[@class='small-link']"));
        proceed.click();
        WebElement acceptCokiee = driver.findElement(By.xpath("//button[@class='cc-btn cc-dismiss btn btn-orange']"));
        acceptCokiee.click();

    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("andy@mailinator.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gecko123");

    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.xpath("//button[@class=\"btn btn-orange float-none m-auto\"]")).click();

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        driver.quit();

    }

}