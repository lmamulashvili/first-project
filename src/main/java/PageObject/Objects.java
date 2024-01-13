package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.BrowserActions.driver;

public class Objects {
    protected By
            usarnameField = By.id("user-name"),
            passwordField = By.name("password"),
            logInButton = By.id("login-button"),
            scroll = By.xpath("/html/body"),
            facebookIcon = By.className("social_facebook"),
            linkedinIcon = By.className("social_linkedin"),
            twitterIcon = By.className("social_twitter"),
            addBackPack = By.name("add-to-cart-sauce-labs-backpack"),
            addBike = By.name("add-to-cart-sauce-labs-bike-light"),
            addTshirt = By.name("add-to-cart-sauce-labs-bolt-t-shirt"),
            addJaket = By.name("add-to-cart-sauce-labs-fleece-jacket"),
            cartButton = By.className("shopping_cart_link"),
            checkOutButton = By.id("checkout"),
            continueShoppingButton = By.name("continue-shopping"),
            firstNameField = By.id("first-name"),
            lastNameField = By.id("last-name"),
            zipCodeField = By.id("postal-code"),
            continueButton = By.id("continue"),
            finishButton = By.id("finish"),
            removeBackPackButton = By.name("remove-sauce-labs-backpack"),
            burgerMenuButton = By.id("react-burger-menu-btn"),
            logOutButton = By.id("logout_sidebar_link");


}
