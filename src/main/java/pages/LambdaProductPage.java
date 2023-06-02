package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaProductPage {
    WebDriver driver;
   private By productAddCart = By.xpath("//div[@id='entry_216842']");

   private By cartLocator = By.xpath("//div[@id='entry_217825']");
   private By checkoutLocator = By.xpath("//div[@id='entry_217851']");

    public LambdaProductPage(WebDriver driver){ this.driver = driver;

    }
    public  void clickOnAddToCart(){
        driver.findElement(productAddCart).click();

    }
    public void clickOnCartButton(){
        driver.findElement(cartLocator).click();
    }
    public void clickOnCheckOutButton(){
        driver.findElement(checkoutLocator).click();
    }

}
