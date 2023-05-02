package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class HomePage extends Utility {

    By topMenuOption = By.xpath("//ul[@class='nav navbar-nav']//li//a");
    By desktop = By.xpath("//a[text()='Desktops']");
    By laptopsAndNotebooks = By.xpath("//a[text()='Laptops & Notebooks']");
    By componants = By.xpath("//a[text()='Components']");
    By myAccount = By.xpath("//footer//a[text()='My Account']");


    public void mouseHoverAndClickOnDesktop() {
        doMouseHoverAndClick(desktop);
    }

    public void clickOnShowAllDesktop() {
        selectMenu(topMenuOption, "Show AllDesktops");
    }

    public void mouseHoverAndClickOnLaptopsAndNotebooks() {
        doMouseHoverAndClick(laptopsAndNotebooks);
    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        selectMenu(topMenuOption, "Show AllLaptops & Notebooks");
    }
    public void mouseHoverOnComponantsAndClick(){
        doMouseHoverAndClick(componants);
    }
    public void clickOnShowAllComponant(){
        selectMenu(topMenuOption,"Show AllComponents");
    }
    public void clickOnMyAccount() {
        pmClickOnElement(myAccount);

    }

}
