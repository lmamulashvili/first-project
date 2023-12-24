package StepObject;

import PageObject.LogInObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends LogInObject {
    WebDriver driver;

    public LogInSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void usernameFieldAction(String username) {
        driver.findElement(usarnameField).sendKeys(username);
    }

    public void passwordFieldAction(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void logInButtonAction() {
        driver.findElement(logInButton).sendKeys(Keys.ENTER);
    }
}
