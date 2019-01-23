package com.prestashop.Tests.functional_test.cart;

import com.prestashop.Utilities.BrowserUtilities;
import com.prestashop.Utilities.ConfirugationReader;
import com.prestashop.Utilities.Driver;
import com.prestashop.pages.HomePage;
import com.prestashop.Utilities.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartLogin extends TestBase {

    @Test
    public void cartLogin() {


        HomePage hmp = new HomePage();

        // 1.Open browser
        // 2.Go to http://automationpractice.com/index.php
        BrowserUtilities.open();

        // 3.Add any product in the homepage to the cart
        action.moveToElement(hmp.hoverProducthomePage).perform();

        hmp.addCart.click();

        // 4.Hover over the cart icon
        action.moveToElement(hmp.hovercartIcon).perform();

        //5.Verify that cart contains the product
        Assert.assertTrue(hmp.hovercartIcon.isDisplayed());

        // 6.Login as any valid user
        hmp.proceedBtn.click();

        hmp.signIn.click();

        hmp.login("ledemiroglu@hotmail.com", "252322Ks.");

        // 7.Hover over the cart icon
        action.moveToElement(hmp.hvrCart).perform();

        // 8.Verify that cart information is same as step 5
        Assert.assertTrue(hmp.hvrCartIcan.isDisplayed());


    }
}
