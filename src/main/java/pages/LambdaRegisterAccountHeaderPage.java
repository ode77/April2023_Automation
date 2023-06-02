package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaRegisterAccountHeaderPage {
    WebDriver driver;
   private By registerAcctPageIsDisplayed = By.xpath("//h1[contains(text(),'Register Account')]");
    public LambdaRegisterAccountHeaderPage(WebDriver driver){ this.driver = driver;

    }

        public boolean IsRegisteredPageDisplayed() {
            return driver.findElement(registerAcctPageIsDisplayed).isDisplayed();
    }
}
