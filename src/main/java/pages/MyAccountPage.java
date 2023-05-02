package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class MyAccountPage extends Utility {

    By listOptions = By.xpath("//div[@class='list-group']//a");
    By returningCustText = By.xpath("//h2[text()='Returning Customer']");
    By accountContinueBtn = By.xpath("//a[text()='Continue']");
    By logoutMessage = By.xpath("//h1[text()='Account Logout']");
    By continueBtnLogout = By.xpath("//a[text()='Continue']");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//input[@value='Login']");
    By myAccountText = By.xpath("//h2[text()='My Account']");


    public void myAccountOptionRegister(String option) {
        selectMenu(listOptions, option);
    }

    public void verifyReturningCustomerText() {
        verifyText("Returning Customer", returningCustText, "Error Text not displayed");
    }

    public void clickOnContinueButton() {
        pmClickOnElement(accountContinueBtn);
    }

    public void verifyLogoutMessage() {
        verifyText("Account Logout", logoutMessage, " Logout message is not displayed");
    }

    public void clickContinueBtnOnLogout() {
        pmClickOnElement(continueBtnLogout);
    }

    public void enterEmaiAddress(String email1) {
        sendTextToElement(email, email1);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void clickOnLoginBtn() {
        pmClickOnElement(loginBtn);
    }

    public void verifyMyAccountText() {
        verifyText("My Account", myAccountText, "My account text not displayed");
    }
}
