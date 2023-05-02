package testsuite;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegisterAccountPage;
import testbase.BaseTest;

public class MyAccountsTest extends BaseTest {

    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterAccountPage registerAccountPage = new RegisterAccountPage();


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // Click on My account link on footer
        homePage.clickOnMyAccount();
        // Click on Register link
        myAccountPage.myAccountOptionRegister("Register");
        // Verify Register title
        registerAccountPage.verifyTextRegisterAccount();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Click on My account link on footer
        homePage.clickOnMyAccount();
        // Click on Login link
        myAccountPage.myAccountOptionRegister("Login");
        // Verify returning customer text
        myAccountPage.verifyReturningCustomerText();
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        // Click on My account link on footer
        homePage.clickOnMyAccount();
        // Click on Register link
        myAccountPage.myAccountOptionRegister("Register");
        // Enter First Name
        registerAccountPage.enterFirstName("Rishi");
        // Enter Last Name
        registerAccountPage.enterLastName("Patel");
        // Enter Email
        registerAccountPage.enterEmail(randomEmailGenerator());
        // Enter Telephone
        registerAccountPage.enterTelephone("0987654321");
        // Enter Password
        registerAccountPage.enterPassword("Password123");
        // Enter Confirm Password
        registerAccountPage.enterConfirmPassword("Password123");
        // Click on Policy Checkbox
        registerAccountPage.clickOnPrivacyPolicyCheckbox();
        // Click on Continue button
        registerAccountPage.clickContinueButtonOnRegisterPage();
        // Verify account created text
        registerAccountPage.verifyAccountCreatedSuccessfullyText();
        // Click on Continue button
        myAccountPage.clickOnContinueButton();
        // Click on My Account
        homePage.clickOnMyAccount();
        // Click on Logout
        myAccountPage.myAccountOptionRegister("Logout");
        // Verify Logout message
        myAccountPage.verifyLogoutMessage();
        // Click on Continue button
        myAccountPage.clickContinueBtnOnLogout();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        // Click on My account link
        homePage.clickOnMyAccount();
        // Click on Login link
        myAccountPage.myAccountOptionRegister("Login");
        // Enter email address
        myAccountPage.enterEmaiAddress("abc123@gmail.com");
        // Enter Password
        myAccountPage.enterPassword("Password123");
        // Click on Login button
        myAccountPage.clickOnLoginBtn();
        // Verify Account text
        myAccountPage.verifyMyAccountText();
        // Click on My account link
        homePage.clickOnMyAccount();
        // Click on Logout
        myAccountPage.myAccountOptionRegister("Logout");
        // Verify Logout message
        myAccountPage.verifyLogoutMessage();
        // Click Continue button
        myAccountPage.clickContinueBtnOnLogout();
    }
}
