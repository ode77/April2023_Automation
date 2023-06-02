package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaAccountLogOutPage {
    WebDriver driver;
   private By accountLogOut = By.xpath("//h1[contains(text(),' Account Logout')]");
   private By continueLocator = By.xpath("//a[contains(text(),'Continue')]");

    public LambdaAccountLogOutPage(WebDriver driver){ this.driver = driver;

    }

        public boolean IsAccountLogout() {
            return driver.findElement(accountLogOut).isDisplayed();
    }
    public void clickOnContinueButton(){
        driver.findElement(continueLocator).click();
    }
}
