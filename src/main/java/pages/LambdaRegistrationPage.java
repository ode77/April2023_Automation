package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class LambdaRegistrationPage {
    WebDriver driver;
   private By firstName = By.id("input-firstname");
   private By lastName = By.id("input-lastname");
    private By eMailAddress = By.id("input-email");
    private By telePhone = By.id("input-telephone");
    private By passWord = By.id("input-password");
    private By confirmPassWord = By.id("input-confirm");
    private By pravacyPolicy = By.xpath("//label[@for='input-agree']");
    private By continueLocator = By.xpath("//input[@value='Continue']");
    public LambdaRegistrationPage(WebDriver driver){ this.driver = driver;

    }
    public  void enterFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);}
    public void enterLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void enterEmailAddress(String eMail){
        driver.findElement(eMailAddress).sendKeys(pNumber() +eMail);
    }
    public void enterTelephoneNum(String tPhone){
        driver.findElement(telePhone).sendKeys(tPhone);
    }
    public void enterPassWord(String pWord){
        driver.findElement(passWord).sendKeys(pWord);
    }
    public void enterConfirmPWord(String pWord){
        driver.findElement(confirmPassWord).sendKeys(pWord);
    }
    public void clickOnPrivacyPolicy(){
        driver.findElement(pravacyPolicy).click();
    }
    public void clickOnContinueButton(){
        driver.findElement(continueLocator).click();
    }
    static int pNumber() {
        Random ran = new Random();
        return ran.nextInt(1000);
    }

}
