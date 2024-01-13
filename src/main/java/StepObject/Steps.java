package StepObject;

import PageObject.Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Steps extends Objects {
    WebDriver driver;

    public Steps(WebDriver driver) {
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

    public void scrollDownAction() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            driver.findElement(scroll).sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(3000);
        }
    }

    public void socialButtonClickable() throws InterruptedException {

        try {
            driver.findElement(facebookIcon).click();
            Thread.sleep(1500);
            driver.findElement(linkedinIcon).click();
            Thread.sleep(1500);
            driver.findElement(twitterIcon).click();
            Thread.sleep(1500);


            System.out.println("social buttons are clickable.");
        } catch (Exception e) {
            System.out.println("social buttons are not clickable or not found.");
            Thread.sleep(2000);
        }


    }

    public void addProductInCart() {
        List<By> productList = new ArrayList<>();
        productList.add(addBike);
        productList.add(addBackPack);
        productList.add(addJaket);
        productList.add(addTshirt);

        for (By inventory : productList) {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(inventory));
            driver.findElement(inventory).click();
        }

        /*
        for (int i = 0; i < productList.size(); i++) {
            By inventory = productList.get(i);
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(inventory));
            driver.findElement(inventory).click();
        }*/


    }

    public void goToCartAction() {
        driver.findElement(cartButton).click();
    }

    public void goToCheckOutAction() {
        driver.findElement(checkOutButton).click();
    }

    public void firstNameInput(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);

    }

    public void lastNameInput(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void zipCodeInput(String zipCode) {
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }

    public void continueToCheckOutAction() {
        driver.findElement(continueButton).click();
    }

    public void finishOrderingAction() {
        driver.findElement(finishButton).click();
    }
    public void removeProductFromCart(){
        driver.findElement(removeBackPackButton).click();
    }
    public void continueShoppingFromCartAction(){
        driver.findElement(continueShoppingButton).click();
    }
    public void openBurgerMenuAction(){
        driver.findElement(burgerMenuButton).click();
    }
    public void logOutAction(){
        driver.findElement(logOutButton).click();
    }
}


