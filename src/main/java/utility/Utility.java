package utility;

import browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.*;


public class Utility extends ManageBrowser {

    /**
     * This method will click on element
     *
     * @ param by
     */
    public void pmClickOnElement(By by) {
        WebElement link = driver.findElement(by);
        link.click();
    }

    /**
     * This method will get text from element
     */
    public String doGetTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    /**
     * This method will find the element and clear all the data from it
     *
     * @param by
     */
    public void doFindElementAndClearText(By by) {
        WebElement elementToClear = driver.findElement(by);
        elementToClear.clear();
    }

    /**
     * This method will extract the value of a particular attribute from an element
     *
     * @param by
     * @param attribute
     * @return
     */
    public String doGetAttributeFromElement(By by, String attribute) {
        return driver.findElement(by).getAttribute(attribute);
    }


  public void selectMenu(By by, String menu) {
        List<WebElement> names = driver.findElements(by);
        for (WebElement name : names) {
//            Thread.sleep(1000);
            if (name.getText().equalsIgnoreCase(menu)) {
//                Thread.sleep(1000);
                name.click();
                break;
            }
        }
    }

    /**
     * This Method will verify text using Assert
     */
    public void verifyText(String expectedMessage, By by, String displayMessage) {
        String actualMessage = doGetTextFromElement(by);
        Assert.assertEquals(actualMessage, expectedMessage, displayMessage);
    }

    //*************************** Select Class Methods ***************************************//

    /**
     * This method will select the option by visible text
     */
    public void pmSelectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    /**
     * This method will select the option by value
     */
    public void selectByValueFromDropDown(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }

    /**
     * This method will select the option by index
     */
    public void selectByIndexFromDropDown(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }

    /**
     * This method will select the option by contains text
     */
    public void pmSelectByContainsTextFromDropDown(By by, String text) {
        List<WebElement> allOptions = new Select(driver.findElement(by)).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }

//*************************** Action Methods ***************************************//


    // This method will mouse hover on element
    public void mouseHoverToElement(By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
//        Thread.sleep(3000);
//        waitUnitVisibilityOfElementLocated(by,2000);
        actions.moveToElement(mouseHoover).build().perform();
    }

    /**
     * This method will use to hover mouse on element
     */
    public void doMouseHoverNoClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    /**
     * This method will mouse hover and Click on element
     */
    public void doMouseHoverAndClick(By by) {
        Actions hover = new Actions(driver);
        WebElement a = driver.findElement(by);
        hover.moveToElement(a).click().build().perform();
    }

    /**
     * This method will Mouse hover on First element then Second element but will not click
     */
    public void doMouseHoverOnFirstThenSecondElement(By by1, By by2) {
        Actions hover = new Actions(driver);
        WebElement destination1 = driver.findElement(by1);
        WebElement destination2 = driver.findElement(by2);
        hover.moveToElement(destination1).moveToElement(destination2).build().perform();
    }

    /**
     * This Method will hover mouse on one element, then on second element
     * and click the second element
     */
    public void doMouseHoverOnFirstThenSecondAndClick(By by1, By by2) {
        Actions hover = new Actions(driver);
        WebElement destination1 = driver.findElement(by1);
        WebElement destination2 = driver.findElement(by2);
        hover.moveToElement(destination1).moveToElement(destination2).click().build().perform();
    }

    // Generate Random email
    public String randomEmailGenerator(){
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random randomEmail= new Random();
        while (email.length()<10) {
            int index = (int) (randomEmail.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String saltStr = (email.toString()+"@gmail.com");
        return saltStr;
    }


//    By productList = By.cssSelector(".product-thumb h4 a");

    public void verifyProductAreInDescendingOrder(By by) {
//        Thread.sleep(2000);
        List<WebElement> originalList = driver.findElements(by);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }

        originalProductNameList.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingList = driver.findElements(by);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        System.out.println(afterSortingProductName);
//        Assert.assertEquals("Product not sorted", originalProductNameList, afterSortingProductName.toString());
        Assert.assertEquals(originalProductNameList, afterSortingProductName, "Product Not Sorted");
    }

    /**
     * This Methd will Sort product by Name A - Z
     */
    By productTitle = By.cssSelector(".products .product-item-info .product-item-name");

    public void verifyProductAreInAscendingOrder() {
        List<WebElement> originalList = driver.findElements(productTitle);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingList = driver.findElements(productTitle);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList, afterSortingProductName, "Product Not Sorted");

    }

    /**
     * This method will verify if products has been sorted in High to Low order
     */
    public Map<String, ArrayList> verifyProductsAreSortedByHighToLow() {
        Map<String, ArrayList> mapArrays = new HashMap<String, ArrayList>();
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        pmSelectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        mapArrays.put("originalProductsPrice", (ArrayList) originalProductsPrice);
        mapArrays.put("afterSortByPrice", afterSortByPrice);
        return mapArrays;
    }


    // This method will select options from the list
    public void selectMyAccountOptions(By by, String option) {
        List<WebElement> topOptionNames = driver.findElements(by);
        for (WebElement names : topOptionNames) {
            if (names.getText().equalsIgnoreCase(option)) {
                names.click();
                break;


            }
        }
    }

}
