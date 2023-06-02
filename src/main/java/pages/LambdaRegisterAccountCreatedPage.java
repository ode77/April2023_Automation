package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaRegisterAccountCreatedPage {
    WebDriver driver;
   private By accountCreatedPageIsDisplayed = By.xpath("//h1");
   private By logoutLocator = By.xpath("//a[contains(text(),' Logout')]");
    public LambdaRegisterAccountCreatedPage(WebDriver driver){ this.driver = driver;

    }

        public boolean IsAccountPageDisplayed() {
            return driver.findElement(accountCreatedPageIsDisplayed).isDisplayed();
    }
    public void clickOnLogoutButton(){
        driver.findElement(logoutLocator).click();
    }
}
