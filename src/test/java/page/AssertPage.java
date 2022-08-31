package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AssertPage extends BaseTest {
    public AssertPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='title']")
    WebElement actualHeader;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement shoppingCart;

    @FindBy(xpath = "//button[contains(@id,'react-burger-menu-btn')]")
    WebElement burgerMenu;

    @FindBy(xpath = "//li[contains(@class,'social_twitter')]")
    WebElement twitter;

    @FindBy(xpath = "//li[contains(@class,'social_facebook')]")
    WebElement facebook;

    @FindBy(xpath = "//li[contains(@class,'social_linkedin')]")
    WebElement linkedin;

    public boolean isActualHeaderSuccessfullDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(actualHeader));
        return actualHeader.isDisplayed();

    }

    public boolean isBurgerMenuSuccessfullDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(burgerMenu));
        return burgerMenu.isDisplayed();
    }

    public boolean isShhoppingCartSuccessfullDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(shoppingCart));
        return shoppingCart.isDisplayed();
    }

    public boolean isTwitterSuccessfullDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(twitter));
        return twitter.isDisplayed();
    }

    public boolean isFacebookSuccessfullDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(facebook));
        return facebook.isDisplayed();
    }

    public boolean isLinkedinSuccessfullDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(linkedin));
        return linkedin.isDisplayed();
    }


}
