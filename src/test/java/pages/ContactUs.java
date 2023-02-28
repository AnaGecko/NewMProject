package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.LoggerApp;

import java.time.Duration;

public class ContactUs {

    WebDriver driver;
    private static final Logger logger = LogManager.getLogger(LoggerApp.class);

    By contact_name = By.xpath(("//input[@name=\"your-name\"]"));
    By mobile = By.xpath(("//input[@name=\"mobile-number\"]"));
    By subject = By.xpath(("//input[@name=\"your-subject\"]"));
    By message = By.xpath(("//span[@data-name=\"your-message\"]/textarea"));
    By email = By.xpath(("//input[@name=\"your-email\"]"));

    By contactUsSendButton = By.xpath(("//input[@value=\"Send\"]"));
    By applyButton = By.xpath(("//input[@type=\"button\"][@value=\"Apply\"]"));


    public ContactUs(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.driver = driver;

    }

    public void enterContactName() {
        driver.findElement(contact_name).sendKeys("Andrijana");
    }

    public void mobile() {
        driver.findElement(mobile).sendKeys("078441090");
    }


    public void subject() {
        driver.findElement(subject).sendKeys("Test");
    }

    public void addMessage() {
        driver.findElement(message).sendKeys("Test123");
    }

    public void wrongEmail() {
        driver.findElement(email).sendKeys("test@test");
    }

    public void wrongEmailTwo() {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("test@t");
    }
    public void wrongEmailThree() {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("test@t.");
    }
    public void wrongEmailFour() {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("test");
    }
    public void wrongEmailFive() {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("test@test@");
    }

    public void contactUsSendButton() {
        driver.findElement(contactUsSendButton).click();
    }

    public void clickApply() {
        driver.findElement(applyButton).click();
    }

    public void invalidEmailMessage() {

        String message = driver.findElement(By.xpath("//span[@class=\"wpcf7-not-valid-tip\"]")).getText();
        System.out.println(message);

    }

}
