package testCases;

import base.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import page.AssertPage;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class TC_1 extends BaseTest {


    AssertPage assertPage;
    LoginPage loginPage;

    @Before
    public void setUp2() {
        assertPage = new AssertPage();
        loginPage = new LoginPage();
    }

    @Test

    public void successfullAssert() {
        loginPage.sendKeysUser("standard_user");
        loginPage.sendKeysPass("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertTrue(assertPage.isActualHeaderSuccessfullDisplayed());
        Assert.assertTrue(assertPage.isBurgerMenuSuccessfullDisplayed());
        Assert.assertTrue(assertPage.isFacebookSuccessfullDisplayed());
        Assert.assertTrue(assertPage.isLinkedinSuccessfullDisplayed());
        Assert.assertTrue(assertPage.isTwitterSuccessfullDisplayed());
        Assert.assertTrue(assertPage.isShhoppingCartSuccessfullDisplayed());


    }

}
