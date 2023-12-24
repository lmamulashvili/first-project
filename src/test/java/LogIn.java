import StepObject.LogInSteps;
import Utils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.LogInData.*;

public class LogIn extends BrowserActions {

    @Test
    public void loginWithCorrectData() {
        LogInSteps step1 = new LogInSteps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void loginWithIncorrectData() {
        LogInSteps step1 = new LogInSteps(driver);
        step1.usernameFieldAction(incorrectUsernameData);
        step1.passwordFieldAction(incorrectPasswordData);
        step1.logInButtonAction();

        WebElement errorMessage = driver.findElement(By.cssSelector("[class='error-message-container error']"));
        String backgroundColor = errorMessage.getCssValue("background-color");
        System.out.println("Background Color" + backgroundColor);

        Assert.assertEquals("rgba(226, 35, 26, 1)", backgroundColor, "Background color does not match.");
    }


}



