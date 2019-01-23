package com.prestashop.Utilities;

public class BrowserUtilities {

    public static void open() {

        Driver.getDriver().get(ConfirugationReader.getProperty("url"));
    }

}