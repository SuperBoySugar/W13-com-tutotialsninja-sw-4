package testsuite;

import org.testng.annotations.Test;
import pages.ComponantsPage;
import pages.DesktopPage;
import pages.HomePage;
import pages.LaptopsAndNotebooks;
import testbase.BaseTest;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopsAndNotebooks laptopsAndNotebooks = new LaptopsAndNotebooks();
    ComponantsPage componantsPage = new ComponantsPage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // Mouse hover and click on desktop
        homePage.mouseHoverAndClickOnDesktop();
        // Click on Show all desktop
        homePage.clickOnShowAllDesktop();
        // Verify desktop title
        desktopPage.verifyDeskTopTitle();
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        // Mouse hover and Click on Laptop and notebooks
        homePage.mouseHoverAndClickOnLaptopsAndNotebooks();
        // Click on Show all laptop and notebook
        homePage.clickOnShowAllLaptopsAndNotebooks();
        // Verify Laptop and Notebooks
        laptopsAndNotebooks.verifyTextLaptosAndNotebooks();
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        // Mouse hover on components
        homePage.mouseHoverOnComponantsAndClick();
        // Click on Show all components
        homePage.clickOnShowAllComponant();
        // Verify text Components
        componantsPage.verifyTextComponants();


    }


}
