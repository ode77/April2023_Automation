package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LambdaAccountLoginPage {
    WebDriver driver;
   private By loginLocator = By.id("input-account-login");

    public LambdaAccountLoginPage(WebDriver driver){ this.driver = driver;

    }
    public  void clickOnLoginButton(String login){
//        Select select = new Select(driver.findElement(loginLocator));
//        select.selectByVisibleText(login);
        driver.findElement(loginLocator).click();

    }

}
