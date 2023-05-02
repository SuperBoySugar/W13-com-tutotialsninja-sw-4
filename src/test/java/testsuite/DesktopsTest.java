package testsuite;

import org.testng.annotations.Test;
import pages.DesktopPage;
import pages.HomePage;
import pages.HpLp3065Page;
import pages.ShoppingCartPage;
import testbase.BaseTest;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    HpLp3065Page hpLp3065Page = new HpLp3065Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // Mouse hover click on Desktop
        homePage.mouseHoverAndClickOnDesktop();
        // Click on Show all Desktop option
        homePage.clickOnShowAllDesktop();
        // Selecting Sort by filter 'Name (Z - A)'
        desktopPage.selectZToAFromSortByDropdown("Name (Z - A)");
        // Verifying products are sorted in descending order
        desktopPage.verifyProductArrangedInDecendingOrder();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        // Mouse hover and Click on Desktop tab
        homePage.mouseHoverAndClickOnDesktop();
        // Click on Show All Desktop option
        homePage.clickOnShowAllDesktop();
        // Select Sort by filter 'Name (A - Z)'
        desktopPage.selectAToZFromSortByDropDown("Name (A - Z)");
        // Selecting product
        desktopPage.selectProductHPLP3065();
        // Verifying text
        hpLp3065Page.verifyTextHpLp3065();
        // Selecting Deivery date
        hpLp3065Page.clickOnDeliveryDate();
        // Input quantity
        hpLp3065Page.inputQuantity("1");
        // Click on Add to Cart button
        hpLp3065Page.clickOnAddToCartBtn();
        // Verify text message
        hpLp3065Page.verifyTextMessage();
        // Click on Shopping Cart button
        hpLp3065Page.clickOnShoppingCart();
        // Verifying text shopping Cart
        shoppingCartPage.verifyTextShoppingCart();
        // Verify text HPLP3065
        shoppingCartPage.verifyTextHpLp3065();
        // Verify delivery date
        shoppingCartPage.verifyDeliverDate();
        // Verify product model
        shoppingCartPage.verifyModel();
        // Verify Cart total
        shoppingCartPage.verifytotal();
    }
}
