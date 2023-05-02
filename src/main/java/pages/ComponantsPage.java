package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class ComponantsPage extends Utility {

    By componants = By.xpath("//h2[text()='Components']");

    public void verifyTextComponants(){
        verifyText("Components",componants,"Page is displayed");

    }
}
