package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class CheckoutPage extends Utility {

    By checkoutText = By.xpath("//h1[text()='Checkout']");
    By newCustomer = By.xpath("//h2[text()='New Customer']");
    By guestCheckout = By.xpath("//label[text()='Guest Checkout']");
    By continueBtn = By.cssSelector("#button-account");
    By firstNameField = By.id("input-payment-firstname");
    By lastNameField = By.id("input-payment-lastname");
    By emailField = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By addressField = By.id("input-payment-address-1");
    By cityField = By.id("input-payment-city");
    By postCodeField = By.id("input-payment-postcode");
    By country = By.id("input-payment-country");
    By region = By.id("input-payment-zone");
    By continueTab = By.id("button-guest");
    By comment = By.xpath("//textarea[@name='comment']");
    By checkBox = By.xpath("//input[@type='checkbox']");
    By textContinue = By.id("button-payment-method");
    By paymentWarning = By.xpath("//div[@class='alert alert-warning alert-dismissible']");
    By myAccount = By.xpath("//span[text()='My Account']");

    public void verifyCheckoutText() {
        verifyText("Checkout", checkoutText, "Incorrect Message");
    }

    public void verifyNewCustomerText() {
        verifyText("New Customer", newCustomer, "Page is not displayed");
    }

    public void clickOnGuestCheckout() {
        pmClickOnElement(guestCheckout);
    }

    public void clickOnContinueBtn() {
        pmClickOnElement(continueBtn);
    }

    public void inputFirstNameField(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }
    public void inputLastNameField(String lastName){
        sendTextToElement(lastNameField, lastName);
    }
    public void inputEmailField(String email){
        sendTextToElement(emailField, email);
    }
    public void inputTelephoneField(String telNumber){
        sendTextToElement(telephone, telNumber);
    }

      public void inputAddressField(String address){
        sendTextToElement(addressField, address);
    }
    public void inputCity(String city){
        sendTextToElement(cityField, city);
    }
    public void inputPostCode(String postCode){
        sendTextToElement(postCodeField, postCode);
    }
    public void selectCountry(String country1){
        pmSelectByVisibleTextFromDropDown(country, country1);
    }
    public void selectRegion(String region1){
        pmSelectByVisibleTextFromDropDown(region, region1);
    }
    public void clickOnContinueTab(){
        pmClickOnElement(continueTab);
    }
    public void inputComment(String comment1){
        sendTextToElement(comment, comment1);
    }
    public void clickOnCheckBox(){
        pmClickOnElement(checkBox);
    }
    public void clickOnTextContinue(){
        pmClickOnElement(textContinue);
    }
    public void verifyPaymentWarning(){
        verifyText("Warning: No Payment options are available. Please contact us for assistance!",paymentWarning,"message is not displayed");
    }
public void clickOnMyAccount(){
        pmClickOnElement(myAccount);
}


}
