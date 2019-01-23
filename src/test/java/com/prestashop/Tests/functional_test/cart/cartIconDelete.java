package com.prestashop.Tests.functional_test.cart;

import com.prestashop.Utilities.BrowserUtilities;
import com.prestashop.Utilities.TestBase;
import com.prestashop.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartIconDelete extends TestBase {


    HomePage hmp = new HomePage();

    @Test
    public void cartIconDelete() {

        //1.Open browser
        // 2.Go to http://automationpractice.com/index.php

        BrowserUtilities.open();

        // 3.Add any product in the homepage to the cart

        action.moveToElement(hmp.hoverProducthomePage).perform();

        hmp.addCart.click();

        // 4.Click on Continue shopping

        hmp.continueShop.click();


        // 5.Hover over the cart icon

        action.moveToElement(hmp.hovercartIcon).perform();

        // 6.Click the x to delete the product

        hmp.deleteee.click();

        // 7.Verify word empty is displayed in the Cart icon

        Assert.assertTrue(hmp.cartCheck.getText().contains("Empty"));


    }
}
