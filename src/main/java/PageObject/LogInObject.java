package PageObject;

import org.openqa.selenium.By;

public class LogInObject {
    protected By
            usarnameField = By.id("user-name"),
            passwordField = By.name("password"),
            logInButton = By.id("login-button");
}
