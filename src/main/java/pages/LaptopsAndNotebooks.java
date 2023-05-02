package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class LaptopsAndNotebooks extends Utility {

    By laptopsAndNotebooks = By.xpath("//h2[text()='Laptops & Notebooks']");
    By sortByHighToLow = By.id("input-sort");
    By macBook = By.xpath("//a[text()='MacBook']");



    public void verifyTextLaptosAndNotebooks() {
        verifyText("Laptops & Notebooks", laptopsAndNotebooks, "Text is not displayed");
    }

    public void selectHighToLowFromSortByDropDown(String filter) {
        pmSelectByVisibleTextFromDropDown(sortByHighToLow, filter);
    }

    public void validateProductPricesAreSortedByHighToLow() {
        verifyProductsAreSortedByHighToLow();
    }

    public void selectMacBook(){
        pmClickOnElement(macBook);
    }


    }



