package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaRegisterAccount3StepDefs {
    WebDriver driver;

    @Before
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities dp = new DesiredCapabilities();
        dp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(dp);
        driver = new ChromeDriver(options);
        //maximize the screen
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Given("I am on the Lambdatest home page {string}")
    public void i_am_on_the_lambdatest_home_page(String lambdaUrl) {
        //maximize the screen
        driver.manage().window().maximize();
        //Navigate to the lambda home page
        driver.get(lambdaUrl);
//        driver.navigate().to(lambdaUrl);

    }

    @When("I click on MyAccount Menu")
    public void i_click_on_my_account_menu() {
        LambdaHomePage lambdaHomePage = new LambdaHomePage(driver);
        lambdaHomePage.enterMyAccount();

    }

    @When("I click on Continue under the New Customer")
    public void i_click_on_continue_under_the_new_customer() {
        LambdaNewCustomerContinuePage lambdaNewCustomerContinuePage = new LambdaNewCustomerContinuePage(driver);
        lambdaNewCustomerContinuePage.clickOnContinueButton();
    }

    @Then("the Register Account page should be displayed")
    public void the_register_account_page_should_be_displayed() {
        LambdaRegisterAccountHeaderPage lambdaRegisterAccountHeaderPage = new LambdaRegisterAccountHeaderPage(driver);
        assertThat(lambdaRegisterAccountHeaderPage.IsRegisteredPageDisplayed(), is(true));
    }

    @And("I enter valid details for {string}, {string}, {string}, {string}, {string}")
    public void iEnterValidDetailsFor(String fName, String lName, String eMail, String tPhone, String pWord) {
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.enterFirstName(fName);
        lambdaRegistrationPage.enterLastName(lName);
        lambdaRegistrationPage.enterEmailAddress(eMail);
        lambdaRegistrationPage.enterTelephoneNum(tPhone);
        lambdaRegistrationPage.enterPassWord(pWord);
        lambdaRegistrationPage.enterConfirmPWord(pWord);
    }


    @When("I accept the privacy policy")
    public void i_accept_the_privacy_policy() {
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.clickOnPrivacyPolicy();

    }

    @When("I click on Continue button on the Register and Account page")
    public void i_click_on_continue_button_on_the_register_and_account_page() {
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.clickOnContinueButton();

    }

    @Then("Register Confirmation page is displayed")
    public void register_confirmation_page_is_displayed() {
        LambdaRegisterAccountCreatedPage lambdaRegisterAccountCreatedPage = new LambdaRegisterAccountCreatedPage(driver);
        assertThat(lambdaRegisterAccountCreatedPage.IsAccountPageDisplayed(), is(true));


    }

    @Then("I {string} of my account")
    public void iOfMyAccount(String arg0) {
        LambdaRegisterAccountCreatedPage lambdaRegisterAccountCreatedPage = new LambdaRegisterAccountCreatedPage(driver);
        lambdaRegisterAccountCreatedPage.clickOnLogoutButton();

    }

    @When("I search for {string} on search field")
    public void i_search_for_on_search_field(String string) {
        LambdaHomePage lambdaHomePage = new LambdaHomePage(driver);
        lambdaHomePage.enterItemSearchField();


    }

    @When("I click on Search Button")
    public void i_click_on_search_button() {
        LambdaHomePage lambdaHomePage = new LambdaHomePage(driver);
        lambdaHomePage.clickOnSearchButton();

    }

    @Then("{string} page is displayed.")
    public void page_is_displayed(String string) {
        LambdaSamsungConfirmationPage lambdaSamsungConfirmationPage = new LambdaSamsungConfirmationPage(driver);
        assertThat(lambdaSamsungConfirmationPage.IsSamsungPageDisplayed(), is(equalTo(true)));

    }

    @Then("I click on {string}")
    public void i_click_on(String string) {
        LambdaSamsungConfirmationPage lambdaSamsungConfirmationPage = new LambdaSamsungConfirmationPage(driver);
        lambdaSamsungConfirmationPage.clickOnSamsungPhone();

    }

    @And("I click on Add to cart")
    public void i_click_on_add_to_cart() {
        LambdaProductPage lambdaProductPage = new LambdaProductPage(driver);
        lambdaProductPage.clickOnAddToCart();

    }

    @And("I click on Cart Menu")
    public void i_click_on_cart_menu() {
        LambdaProductPage lambdaProductPage = new LambdaProductPage(driver);
        lambdaProductPage.clickOnCartButton();

    }

    @And("Click on Checkout")
    public void click_on_checkout() {
        LambdaProductPage lambdaProductPage = new LambdaProductPage(driver);
        lambdaProductPage.clickOnCheckOutButton();

    }

    @And("I Hover over MyAccount menu and I click on Login link")
    public void i_hover_over_my_account_menu_and_i_click_on_login_link() {
        LambdaHomePage lambdaHomePage = new LambdaHomePage(driver);
        lambdaHomePage.enterMyAccount();

    }

    @And("I enter Valid {string} and {string}")
    public void i_enter_valid_and(String eMail, String pWord) {
        LambdaReturninCustomerPage lambdaReturninCustomerPage = new LambdaReturninCustomerPage(driver);
        lambdaReturninCustomerPage.enterEmailAddress(eMail);
        lambdaReturninCustomerPage.enterPassWord(pWord);

    }

    @And("I click on Login Button")
    public void i_click_on_login_button() {
        LambdaReturninCustomerPage lambdaReturninCustomerPage = new LambdaReturninCustomerPage(driver);
        lambdaReturninCustomerPage.clickOnLoginButton();

    }

    @And("I click on Logout link")
    public void i_click_on_logout_link() {
        LambdaHomePage lambdaHomePage = new LambdaHomePage(driver);
        lambdaHomePage.clickOnLogoutButton();


    }

    @Then("Account Logout Page is Displayed")
    public void account_logout_page_is_displayed() {
        LambdaAccountLogOutPage lambdaAccountLogOutPage = new LambdaAccountLogOutPage(driver);
        assertThat(lambdaAccountLogOutPage.IsAccountLogout(), is(equalTo(true)));

    }

    @Then("I click on Continue")
    public void i_click_on_continue() {
        LambdaAccountLogOutPage lambdaAccountLogOutPage = new LambdaAccountLogOutPage(driver);
        lambdaAccountLogOutPage.clickOnContinueButton();
    }
    @Then("Home page is Displayed")
    public void homePageIsDisplayed() {
        LambdaHomePage lambdaHomePage = new LambdaHomePage(driver);
        assertThat(lambdaHomePage.homePageDisplayed(),is(equalTo(true)));

    }
    @And("I enter valid details as")
    public void iEnterValidDetailsAs(List<String> dataTable) {
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.enterFirstName(dataTable.get(0));
        lambdaRegistrationPage.enterLastName(dataTable.get(1));
        lambdaRegistrationPage.enterEmailAddress(dataTable.get(2));
        lambdaRegistrationPage.enterTelephoneNum(dataTable.get(3));
        lambdaRegistrationPage.enterPassWord(dataTable.get(4));
        lambdaRegistrationPage.enterConfirmPWord(dataTable.get(4));

    }
    @And("I enter valid details for Register account")
    public void iEnterValidDetailsForRegisterAccount(List<List<String>> dataTable) {
        LambdaRegistrationPage lambdaRegistrationPage = new LambdaRegistrationPage(driver);
        lambdaRegistrationPage.enterFirstName(dataTable.get(1).get(1));
        lambdaRegistrationPage.enterLastName(dataTable.get(2).get(1));
        lambdaRegistrationPage.enterEmailAddress(dataTable.get(3).get(1));
        lambdaRegistrationPage.enterTelephoneNum(dataTable.get(4).get(1));
        lambdaRegistrationPage.enterPassWord(dataTable.get(5).get(1));
        lambdaRegistrationPage.enterConfirmPWord(dataTable.get(5).get(1));

    }

    @After
    public void tearDown() throws IOException {
//        takeScreenshot();
        driver.close();
        driver.quit();
    }




//    private void takeScreenshot() throws IOException {
//        TakesScreenshot scrShot = ((TakesScreenshot) driver);
//        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(SrcFile, new File("target/screenshot" +
//                System.currentTimeMillis() + ".png"));
//    }


}