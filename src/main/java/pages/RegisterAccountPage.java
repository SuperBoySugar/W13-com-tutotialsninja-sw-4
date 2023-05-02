package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class RegisterAccountPage extends Utility {

    By registerAccount = By.xpath("//h1[text()='Register Account']");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confimPass = By.id("input-confirm");
    By pPCheckbox = By.xpath("//input[@type='checkbox']");
    By regContinueBtn = By.xpath("//input[@value='Continue']");
    By successMessage = By.xpath("//h1[text()='Your Account Has Been Created!']");



    public void verifyTextRegisterAccount() {
        verifyText("Register Account", registerAccount, "page is not displayed");
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName);
    }

    public void enterEmail(String email1) {
        sendTextToElement(email, email1);
    }

    public void enterTelephone(String phone) {
        sendTextToElement(telephone, phone);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void enterConfirmPassword(String confPass) {
        sendTextToElement(confimPass, confPass);
    }

    public void clickOnPrivacyPolicyCheckbox(){
        pmClickOnElement(pPCheckbox);
    }

    public void clickContinueButtonOnRegisterPage(){
        pmClickOnElement(regContinueBtn);
    }

    public void verifyAccountCreatedSuccessfullyText(){
        verifyText("Your Account Has Been Created!", successMessage,"Message is not displayed");

    }


}
