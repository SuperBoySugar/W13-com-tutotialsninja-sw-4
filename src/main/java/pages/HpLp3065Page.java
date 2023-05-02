package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utility.Utility;

import java.util.List;

public class HpLp3065Page extends Utility {

    By textHPLP3065 = By.xpath("//h1[text()='HP LP3065']");
    By deliveryDate = By.xpath("//div[@class='input-group date']//button[@type='button']");
    By quantity = By.id("input-quantity");
    By addToCart = By.xpath("//button[text()='Add to Cart']");
    By textMessage = By.xpath("//div[text()='Success: You have added ']");
    By shoppingCart = By.xpath("//a[text()='shopping cart']");


    public void verifyTextHpLp3065() {
        verifyText("HP LP3065", textHPLP3065, "page is not displayed");

    }

//    String year = "2022";
//    String month = "November";
//    String date = "30";

    public void clickOnDeliveryDate() {

        String year = "2022";
        String month = "November";
        String date = "30";
        pmClickOnElement(By.xpath("//div[@class='input-group date']//button[@type='button']"));
        while (true) {
            String monthYear = driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='picker-switch']")).getText();
            System.out.println(monthYear); // Apr 2023
            String[] a = monthYear.split(" ");
            String mon = a[0];
            String yer = a[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                pmClickOnElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        // Select the date
        List<WebElement> allDates = driver.findElements(By.xpath("//tbody//tr//td[@class='day']"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }


        }
    }
    public void inputQuantity(String qty){
        sendTextToElement(quantity, Keys.BACK_SPACE + qty);
    }
    public void clickOnAddToCartBtn(){
        pmClickOnElement(addToCart);
    }
    public void verifyTextMessage(){
        verifyText("Success: You have added HP LP3065 to your shopping cart!\n" +
                "×", By.xpath("//div[text()='Success: You have added ']"), "Shopping Cart is empty");

    }
    public void clickOnShoppingCart(){
        pmClickOnElement(shoppingCart);
    }

}
