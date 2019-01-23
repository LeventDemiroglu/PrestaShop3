package com.prestashop.Tests.functional_test.cart;

import com.prestashop.Utilities.BrowserUtilities;
import com.prestashop.Utilities.TestBase;
import com.prestashop.pages.HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartCheckoutDelete extends TestBase {

    @Test
    public void cartLogout() {

        HomePage hmp = new HomePage();

        BrowserUtilities.open();

        action.moveToElement(hmp.hoverProducthomePage).perform();

        hmp.addCart.click();

        hmp.continueShop.click();

        action.moveToElement(hmp.hoverAnotherproduct).perform();

        hmp.addAnotherProduct.click();

        hmp.proceedAnotherProduct.click();

        Assert.assertTrue(hmp.msgTwoProducts.isDisplayed());

        action.moveToElement(hmp.hoverCartforDelete).perform();

        hmp.deleteProduct.click();

        Assert.assertTrue(hmp.msgOneProduct.isDisplayed());

    }
}
