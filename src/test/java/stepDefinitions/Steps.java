package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver = null;


    //    @Given("user is on login page")
    @Given("user is on login page")
    public void user_is_on_login_page() {

        System.out.println("Browser is opened");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "Drivers/chromeDriver/chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", + projectPath "C:/Users/andrijanaj/IdeaProjects/SeleniumCucumberBDD/src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

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