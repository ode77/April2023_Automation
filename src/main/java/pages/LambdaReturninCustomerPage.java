package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaReturninCustomerPage {
    WebDriver driver;
    private By emailAddress = By.id("input-email");
    private By passWord = By.id("input-password");
    private By loginLocator = By.xpath("//input[@value='Login']");
    public LambdaReturninCustomerPage(WebDriver driver){ this.driver = driver;

    }
    public  void enterEmailAddress(String eMail){
        driver.findElement(emailAddress).sendKeys(eMail);
    }
    public void enterPassWord(String pWord){
        driver.findElement(passWord).sendKeys(pWord);
    }
    public void clickOnLoginButton(){
        driver.findElement(loginLocator).click();
    }
}
