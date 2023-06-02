package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaNewCustomerContinuePage {
    WebDriver driver;
    By continueLocator = By.xpath("//a[contains(text(),'Continue')]");
    public LambdaNewCustomerContinuePage(WebDriver driver){ this.driver = driver;

    }
    public  void clickOnContinueButton(){
        driver.findElement(continueLocator).click();

    }
}
