package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class DesktopPage extends Utility {

    By desktopTitle = By.xpath("//h2[text()='Desktops']");
    By sortBy = By.id("input-sort");
    By productList = By.cssSelector(".product-thumb h4 a");
    By sortByAToZ = By.id("input-sort");
    By hpLP3065 = By.xpath("//a[text()='HP LP3065']");


    public void verifyDeskTopTitle(){
        verifyText("Desktops",desktopTitle,"Title is not visible");
    }


    public void selectZToAFromSortByDropdown(String filter){
        pmSelectByVisibleTextFromDropDown(sortBy,filter);
    }

    public void verifyProductArrangedInDecendingOrder(){
        verifyProductAreInDescendingOrder(productList);
    }
    public void selectAToZFromSortByDropDown(String filter1){
        pmSelectByVisibleTextFromDropDown(sortByAToZ, filter1);

    }
    public void selectProductHPLP3065(){
        pmClickOnElement(hpLP3065);
    }




}
