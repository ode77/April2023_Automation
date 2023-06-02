package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LambdaHomePage {
    WebDriver driver;
    private By MyAccount = By.xpath("//span[contains(text(),'My account')] ");
    private By searchField = By.xpath("//div[@id='entry_217822']//input[@placeholder='Search For Products']");
    private By searchLocator = By.xpath("//div[@class='search-button']");
    private By loginLocator = By.xpath("//span[contains(text(),' Login')]");
    private By logoutLocator = By.xpath("//a[contains(text(),'Logout')]");
    private By homePageIsDisplayed = By.xpath("//a[@title='Poco Electro']");

    public LambdaHomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterMyAccount() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(MyAccount).get(1)).moveToElement(driver.findElement(loginLocator)).click().perform();

    }

    public void enterItemSearchField() {
        driver.findElement(searchField).sendKeys("Samsung");
    }

    public void clickOnSearchButton() {
        driver.findElements(searchLocator).get(0).click();

    }
    public void clickOnLogoutButton(){
        driver.findElement(logoutLocator).click();
    }
    public boolean homePageDisplayed(){
        return driver.findElement(homePageIsDisplayed).isDisplayed();
    }


    }

