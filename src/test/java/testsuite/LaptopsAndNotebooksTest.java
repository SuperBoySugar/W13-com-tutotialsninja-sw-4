package testsuite;

import org.testng.annotations.Test;
import pages.*;
import testbase.BaseTest;

public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopsAndNotebooks laptopsAndNotebooks = new LaptopsAndNotebooks();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        // Mouse hover and click on Laptop and Notehbooks
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        // Click on Show all Desktop and notebooks
        homePage.clickOnShowAllLaptopsAndNotebooks();
        // select sorting option
        laptopsAndNotebooks.selectHighToLowFromSortByDropDown("Price (High > Low)");
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){
        // Mouse hover and click on Laptop and Notebooks
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        // Click on Show all Laptop and notebooks
        homePage.clickOnShowAllLaptopsAndNotebooks();
        // Select sorting filter High To Low
        laptopsAndNotebooks.selectHighToLowFromSortByDropDown("Price (High > Low)");
        // Verify products are sorted by High to Low
        laptopsAndNotebooks.validateProductPricesAreSortedByHighToLow();
        // Selecting MacBook
        laptopsAndNotebooks.selectMacBook();
        // Verify Text MacBook
        macBookPage.verifyTextMacBook();
        // Click on Add to Cart Button
        macBookPage.clickOnAddToCartBtn();
        // Verify Success message
        macBookPage.verifySuccessMessage();
        // Clicking on Shopping cart button
        macBookPage.clickOnShoppingCart();
        // Verify Text message shopping cart
        shoppingCartPage.textMessageShoppingCart();
        // Verify product MacBook
        shoppingCartPage.verifyProductMacBook();
        // Change quantity
        shoppingCartPage.changeQuantity("2");
        // Click on Update cart button
        shoppingCartPage.clickOnUpdateBtn();
        // Verify update Message
        shoppingCartPage.verifyUpdateMessage();
        // Verify Total
        shoppingCartPage.verifyTotalUpdate();
        // Clicking on Checkout button
        shoppingCartPage.clickOnCheckoutBtn();
        // Verify Checkout text
        checkoutPage.verifyCheckoutText();
        // Click on Guest Checkout
        checkoutPage.clickOnGuestCheckout();
        // Click on Continue button
        checkoutPage.clickOnContinueBtn();
        // Enter First Name
        checkoutPage.inputFirstNameField("Henry");
        // Enter Last Name
        checkoutPage.inputLastNameField("Smith");
        // Enter Email
        checkoutPage.inputEmailField("abc@gmail.com");
        // Enter Telephone
        checkoutPage.inputTelephoneField("0987654321");
        // Enter Address Line1
        checkoutPage.inputAddressField("10 Downling Street");
        // Enter City
        checkoutPage.inputCity("London");
        // Enter Postal Code
        checkoutPage.inputPostCode("SW1 1AA");
        // Select Country
        checkoutPage.selectCountry("United Kingdom");
        // Select Region
        checkoutPage.selectRegion("Bristol");
        // Click on Continue button
        checkoutPage.clickOnContinueTab();
        // Enter Comment
        checkoutPage.inputComment("Order Placed");
        // Click on checkbox
        checkoutPage.clickOnCheckBox();
        // Click on Continue button
        checkoutPage.clickOnTextContinue();
        // Verify payment warning message
        checkoutPage.verifyPaymentWarning();

    }
}
