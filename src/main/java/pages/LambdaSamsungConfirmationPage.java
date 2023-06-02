package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaSamsungConfirmationPage {
    WebDriver driver;
   private By samsungConfirmationPage = By.xpath("//h1[@class='h4']");
   private By samSungPhone = By.xpath("//div[@class='carousel-item active']");

    public LambdaSamsungConfirmationPage(WebDriver driver){ this.driver = driver;

    }

        public boolean IsSamsungPageDisplayed() {
            return driver.findElement(samsungConfirmationPage).isDisplayed();
//    public String  IsSamsungPageDisplayed(){
//    return driver.findElement(samsungConfirmationPage).getText();
   }
        public void clickOnSamsungPhone(){
        driver.findElements(samSungPhone).get(1).click();



   }

    }


