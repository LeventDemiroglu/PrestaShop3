package com.prestashop.pages;

import com.prestashop.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //CART LOGIN

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    public WebElement hoverProducthomePage;

    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]")
    public WebElement addCart;

    @FindBy(xpath= "//*[@id='homefeatured']/li[2]/div/div[1]/div/a[1]/img")
    public WebElement hovercartIcon;

    @FindBy(xpath = "//a[@title='Proceed to checkout']//span")
    public WebElement proceedBtn;

    @FindBy(xpath="//a[@title='Log in to your customer account']")
    public WebElement signIn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath="//button[@id='SubmitLogin']//span")
    public WebElement signInBtn;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement hvrCart;

    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/p/7/7-cart_default.jpg']")
    public WebElement hvrCartIcan;


    public void login(String emailText, String passwordText){
        email.sendKeys(emailText);
        password.sendKeys(passwordText);
        signInBtn.click();
    }

    //CART LOGOUT

    @FindBy(xpath = "//a[@title='Home']//span")
    public WebElement backHomePage;

    @FindBy(xpath = "//div[@class='product-image-container layer_cart_img']//img[@title='Blouse']")
    public WebElement cartIcon;

    @FindBy(xpath= "//*[@id='layer_cart']/div[1]/div[1]/span")
    public WebElement closeWindow;

    @FindBy(xpath="//a[@title='Log me out']")
    public WebElement signOut;

    @FindBy(xpath="//span[@class='ajax_cart_no_product']")
    public WebElement empty;



    //CART ICON DELETE


    @FindBy(xpath = "//a[@class='ajax_cart_block_remove_link']")
    public WebElement deleteee;

    @FindBy(xpath="//a[@title='View my shopping cart']")
    public WebElement cartCheck;









    //CART CHECKOUT DELETE

    @FindBy(xpath= "//span[@title='Continue shopping']//span")
    public WebElement continueShop;

    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line hovered']//img[@title='Printed Dress']")
    public WebElement hoverAnotherproduct;

    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]")
    public WebElement addAnotherProduct;

    @FindBy(xpath= "//a[@title='Proceed to checkout']//span")
    public WebElement proceedAnotherProduct;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement msgTwoProducts;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement hoverCartforDelete;

    @FindBy(xpath = "//dt[@class='first_item']//a[@title='remove this product from my cart']")
    public WebElement deleteProduct;

    @FindBy(xpath= "//span[@class='heading-counter']")
    public WebElement msgOneProduct;

}
