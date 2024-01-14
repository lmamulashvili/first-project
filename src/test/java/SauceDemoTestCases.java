import StepObject.Steps;
import Utils.BrowserActions;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.Data.*;

public class SauceDemoTestCases extends BrowserActions {

    @Test
    @Epic("Authentication")
    @Feature("Login")
    @Story("Login with Correct Data")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test for verifying login functionality with correct credentials.")
    public void loginWithCorrectData() {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    @Epic("Authentication")
    @Feature("Login")
    @Story("Login with Incorrect Data")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test for verifying login functionality with incorrect credentials.")
    public void loginWithIncorrectData() {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(incorrectUsernameData);
        step1.passwordFieldAction(incorrectPasswordData);
        step1.logInButtonAction();

        WebElement errorMessage = driver.findElement(By.cssSelector("[class='error-message-container error']"));
        String backgroundColor = errorMessage.getCssValue("background-color");
        System.out.println("Background Color" + backgroundColor);

        Assert.assertEquals("rgba(226, 35, 26, 1)", backgroundColor, "Background color does not match.");
    }

    @Test
    @Epic("Authentication")
    @Feature("Login")
    @Story("Login with Empty Data")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test for verifying login functionality with Empty credentials.")
    public void loginWithEmptyData() {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(emptyUsernameData);
        step1.passwordFieldAction(emptyPasswordData);
        step1.logInButtonAction();
        WebElement errorMessage = driver.findElement(By.cssSelector("[class='error-message-container error']"));
        String backgroundColor = errorMessage.getCssValue("background-color");
        System.out.println("Background Color" + backgroundColor);

        Assert.assertEquals("rgba(226, 35, 26, 1)", backgroundColor, "Background color does not match.");
    }

    @Test
    @Epic("Authentication")
    @Feature("LogOut")
    @Story("LogOut")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test logout")
    public void LogOut() throws InterruptedException {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        Thread.sleep(2000);
        step1.openBurgerMenuAction();
        Thread.sleep(2000);
        step1.logOutAction();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    @Epic("Home Page")
    @Feature("Scroll")
    @Story("Scroll down")
    @Severity(SeverityLevel.MINOR)
    @Description("Test for scrolling to bottom")
    public void homePageScrollDown() throws InterruptedException {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        Thread.sleep(3000);

        step1.scrollDownAction();
        Thread.sleep(3000);

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    @Epic("Social")
    @Feature("Social Links Opening")
    @Story("Social Links")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test opening social links")
    public void clickSocialButtons() throws InterruptedException {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualURL, expectedURL);
        Thread.sleep(3000);
        step1.scrollDownAction();
        Thread.sleep(3000);
        step1.socialButtonClickable();
        Thread.sleep(7000);
    }

    @Test
    @Epic("Cart")
    @Feature("Add products to cart")
    @Story("Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test adding products in cart")
    public void addProductsIncart() throws InterruptedException {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualURL, expectedURL);
        Thread.sleep(3000);
        step1.addProductInCart();
        Thread.sleep(3000);
    }

    @Test
    @Epic("Cart")
    @Feature("remove products to cart")
    @Story("Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test remove products from cart")
    public void removeItemFromCart() throws InterruptedException {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        Thread.sleep(2000);
        step1.addProductInCart();
        Thread.sleep(2000);
        step1.goToCartAction();
        Thread.sleep(1000);
        step1.removeProductFromCart();
        Thread.sleep(2000);
        step1.continueShoppingFromCartAction();
        Thread.sleep(2000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    @Epic("Order")
    @Feature("Order Products")
    @Story("Order Products")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test ordering products")
    public void orderProductSuccess() throws InterruptedException {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        Thread.sleep(2000);
        step1.addProductInCart();
        Thread.sleep(2000);
        step1.goToCartAction();
        step1.scrollDownAction();
        step1.goToCheckOutAction();
        Thread.sleep(2000);
        step1.firstNameInput(correctFirstName);
        step1.lastNameInput(correctLastName);
        step1.zipCodeInput(correctZipCode);
        step1.continueToCheckOutAction();
        step1.scrollDownAction();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
        Assert.assertEquals(actualUrl, expectedUrl);
        Thread.sleep(2000);
        step1.finishOrderingAction();
        Thread.sleep(2000);
        String actualUrl2 = driver.getCurrentUrl();
        String expectedUrl2 = "https://www.saucedemo.com/checkout-complete.html";
        Assert.assertEquals(actualUrl2, expectedUrl2);
    }

    @Test
    @Epic("Order")
    @Feature("Fail Order")
    @Story("Fail Order")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test fail order")
    public void orderProductFail() throws InterruptedException {
        Steps step1 = new Steps(driver);
        step1.usernameFieldAction(correctUsernameData);
        step1.passwordFieldAction(correctPasswordData);
        step1.logInButtonAction();
        Thread.sleep(2000);
        step1.addProductInCart();
        Thread.sleep(2000);
        step1.goToCartAction();
        Thread.sleep(2000);
        step1.goToCheckOutAction();
        Thread.sleep(2000);
        step1.firstNameInput(emptyFirstName);
        step1.lastNameInput(emptyLastName);
        step1.zipCodeInput(emptyZipCode);
        step1.continueToCheckOutAction();
        WebElement errorMessage = driver.findElement(By.className("error-button"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}



