package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class MacBookPage extends Utility {
    By textMacBook = By.xpath("//h1[text()='MacBook']");
    By addToCartBtn = By.id("button-cart");
    By successMessage = By.xpath("//div[text()='Success: You have added ']");
    By shoppingCart = By.xpath("//a[text()='shopping cart']");


    public void verifyTextMacBook() {
        verifyText("MacBook", textMacBook, "Page is not displayed");
    }

    public void clickOnAddToCartBtn() {
        pmClickOnElement(addToCartBtn);

    }

    public void verifySuccessMessage() {
        verifyText("Success: You have added MacBook to your shopping cart!\n" +
                "×", successMessage, "Message not Display");
    }

    public void clickOnShoppingCart(){
        pmClickOnElement(shoppingCart);
    }
}