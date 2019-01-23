package com.prestashop.Tests.functional_test.cart;

import com.prestashop.Utilities.BrowserUtilities;
import com.prestashop.Utilities.ConfirugationReader;
import com.prestashop.Utilities.TestBase;
import com.prestashop.pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartLogout extends TestBase {

    @Test
    public void cartLogout() throws InterruptedException {

        HomePage hmp = new HomePage();

        //1.Open browser
        //2.Go to http://automationpractice.com/index.php

        BrowserUtilities.open();

        // 3.Login as any valid user

        hmp.signIn.click();

        hmp.login("ledemiroglu@hotmail.com", "252322Ks.");

        // 4.Go back to home page

        Thread.sleep(5000);

        hmp.backHomePage.click();

        action.moveToElement(hmp.hovercartIcon).perform();

        //5.Add any product in the homepage to the cart

        hmp.addCart.click();

        // 6.Hover over the cart icon

        action.moveToElement(hmp.cartIcon).perform();

        // 7.Verify that cart contains the product

        Assert.assertTrue(hmp.cartIcon.isDisplayed());

        hmp.closeWindow.click();

        // 8.Log out

        hmp.signOut.click();

        // 9.Verify word empty is displayed in the Cart icon

        Assert.assertTrue(hmp.empty.getText().contains("empty"));


    }
}
