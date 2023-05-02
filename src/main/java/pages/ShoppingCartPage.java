package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utility.Utility;

public class ShoppingCartPage extends Utility {

    By textShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By textHplp3065 = By.cssSelector("form .text-left a[href^='https']");
    By deliveryDate = By.cssSelector("form tr:nth-child(1) > td:nth-child(2) > small:nth-child(3)");
    By model = By.cssSelector("form tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3)");
    By total = By.cssSelector("tbody tr td:nth-child(6)");
    By messageShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By macBook = By.cssSelector("form .text-left a[href^='https']");
    By changeQuantity = By.cssSelector("input[name*='quantity']");
    By updateBtn = By.cssSelector("button[type='submit']");
    By updateMessage = By.xpath("//div[contains (text(), 'Success: You have modified')]");
    By totalUpdate = By.cssSelector("tbody tr td:nth-child(6)");
    By checkoutBtn = By.xpath("//a[@class='btn btn-primary']");


    public void verifyTextShoppingCart(){
        verifyText("Shopping Cart  (1.00kg)",textShoppingCart,"Text is not displayed correctly");
    }

    public void verifyTextHpLp3065(){
        verifyText("HP LP3065", textHplp3065,"Product is not correct");
    }
    public void verifyDeliverDate(){
        verifyText("Delivery Date:2022-11-30", deliveryDate,"Delivery Date displayed incorrect");
    }
    public void verifyModel(){
        verifyText("Product 21", model,"Incorrect Model");

    }
    public void verifytotal(){
        verifyText("$122.00", total,"Total display incorrect");
    }

    public void textMessageShoppingCart(){
        verifyText("Shopping Cart  (0.00kg)",messageShoppingCart,"Page is not displayed");

    }
    public void verifyProductMacBook(){
        verifyText("MacBook",macBook,"MacBook is not displayed");
    }
    public void changeQuantity(String qty){
        sendTextToElement(changeQuantity, Keys.BACK_SPACE + qty);
    }
    public void clickOnUpdateBtn(){
        pmClickOnElement(updateBtn);
    }

    public void verifyUpdateMessage(){
        verifyText("Success: You have modified your shopping cart!\n" +
                "×", updateMessage,"Quantity is not modified");
    }
    public void verifyTotalUpdate(){
        verifyText("$1,204.00",totalUpdate,"Incorrect Total");
    }
    public void clickOnCheckoutBtn(){
        pmClickOnElement(checkoutBtn);
    }
}
