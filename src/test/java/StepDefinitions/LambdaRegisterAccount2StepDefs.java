//package StepDefinitions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class LambdaRegisterAccount2StepDefs {
//    WebDriver driver;
//    @Before
//    public void initialize(){
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities dp = new DesiredCapabilities();
//        dp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(dp);
//        driver = new ChromeDriver(options);
//        //maximize the screen
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
//    }
//
//    @Given("I am on the Lambdatest home page {string}")
//    public void i_am_on_the_lambdatest_home_page(String lambdaUrl) {
//        //maximize the screen
//        driver.manage().window().maximize();
//        //Navigate to the lambda home page
//        driver.get(lambdaUrl);
////        driver.navigate().to(lambdaUrl);
//
//
//    }
//
//    @When("I click on MyAccount Menu")
//    public void i_click_on_my_account_menu() {
//        List<WebElement> myAccount = driver.findElements(By.xpath("//span[contains(text(),'My account')] "));
//        myAccount.get(1).click();
//
//    }
//
//    @When("I click on Continue under the New Customer")
//    public void i_click_on_continue_under_the_new_customer() {
//        WebElement Continue = driver.findElement(By.xpath("//a[contains(text(),'Continue')] "));
//        Continue.click();
//    }
//
//    @Then("the Register Account page should be displayed")
//    public void the_register_account_page_should_be_displayed() {
//        WebElement registerAccountHeader = driver.findElement(By.xpath("//h1[@class='page-title h3']"));
//        assertThat(registerAccountHeader.getText(), is(equalTo("Register Account")));
//        System.out.println(registerAccountHeader.getText());
//        String actualResult = registerAccountHeader.getText();
//        assertThat(actualResult,is(equalTo("Register Account")));
//
//    }
//
//    @And("I enter valid details for First Name as {string}, Last Name as {string}, E-mail as {string}, Telephone as {string}, Password and ConfirmPword as {string}")
//    public void iEnterValidDetailsForFirstNameAsLastNameAsEMailAsTelephoneAsPasswordAndConfirmPwordAs(String fName, String lName, String eMail, String tPhone, String pWord) {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys(fName);
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys(lName);
//        WebElement emailAddress = driver.findElement(By.id("input-email"));
//        emailAddress.sendKeys(pNumber() + eMail);
//        WebElement telephoneNum = driver.findElement(By.id("input-telephone"));
//        telephoneNum.sendKeys(tPhone);
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys(pWord);
//        WebElement confirmPword = driver.findElement(By.id("input-confirm"));
//        confirmPword.sendKeys(pWord);
//    }
//
//    static int pNumber() {
//        Random ran = new Random();
//        return ran.nextInt(1000);
//    }
//
//    @When("I accept the privacy policy")
//    public void i_accept_the_privacy_policy() {
//        WebElement privacyPolicy = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        privacyPolicy.click();
//    }
//
//    @When("I click on Continue button on the Register and Account page")
//    public void i_click_on_continue_button_on_the_register_and_account_page() {
//        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
//        continueButton.click();
//
//    }
//
////    @Then("Register Confirmation page is displayed")
////    public void register_confirmation_page_is_displayed() {
////        WebElement registerConfirmation = driver.findElement(By.xpath("//h1[@class='page-title my-3']"));
////        assertThat(registerConfirmation.isDisplayed(), is(equalTo(true)));
//
//
////    }
//
//    @Then("I {string} of my account")
//    public void iOfMyAccount(String arg0) {
//        WebElement logOut = driver.findElement(By.xpath("//a[contains(text(),' Logout')]"));
//
//    }
//
//    @When("I enter valid input for all other mandatory fields and accept Privacy Policy")
//    public void i_enter_valid_input_for_all_other_mandatory_fields_and_accept_privacy_policy() {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys("Nnena");
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys("garren");
//        WebElement eMail = driver.findElement(By.id("input-email"));
//        eMail.sendKeys("nnena@gmail.com");
//        WebElement telePhone = driver.findElement(By.id("input-telephone"));
//        telePhone.sendKeys("089978543");
//        WebElement privacyPolicy = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        privacyPolicy.click();
//
//    }
//
//    @When("I enter same invalid password for Password and Confirm Password")
//    public void i_enter_same_invalid_password_for_password_and_confirm_password() {
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys("tel");
//        WebElement confirmPassWord = driver.findElement(By.id("input-confirm"));
//        confirmPassWord.sendKeys("tel");
//
//    }
//
//    @Then("I should get error message as per design three")
//    public void iShouldGetErrorMessageAsPerDesignThree() {
//        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='text-danger']"));
//        assertThat(errorMessage.getText(), is(equalTo("Password must be between 4 and 20 characters!")));
//
//
//    }
//
//    @When("I enter valid password for Password")
//    public void i_enter_valid_password_for_password() {
//        WebElement validPassWord = driver.findElement(By.id("input-password"));
//        validPassWord.sendKeys("yahoo");
//
//    }
//
//    @When("I enter non matching Confirm Password")
//    public void i_enter_non_matching_confirm_password() {
//        WebElement nonMatchingConfirmPword = driver.findElement(By.id("input-confirm"));
//        nonMatchingConfirmPword.sendKeys("yaho7");
//
//    }
//
//    @Then("I should get error message as per design five")
//    public void iShouldGetErrorMessageAsPerDesignFive() {
//        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='text-danger']"));
//        assertThat(errorMessage.getText(), is(equalTo("Password confirmation does not match password!")));
//
//    }
//
//    @When("I enter invalid details for Last Name with valid input for all other mandatory fields")
//    public void iEnterInvalidDetailsForLastNameWithValidInputForAllOtherMandatoryFields() {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys("Nnena");
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys("");
//        WebElement eMail = driver.findElement(By.id("input-email"));
//        eMail.sendKeys("nnena@gmail.com");
//        WebElement telePhone = driver.findElement(By.id("input-telephone"));
//        telePhone.sendKeys("089978543");
//        WebElement privacyPolicy = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        privacyPolicy.click();
//
//    }
//
//    @Then("I should get error message as per design seven")
//    public void iShouldGetErrorMessageAsPerDesignSeven() {
//        WebElement lNameErrorMessage = driver.findElement(By.xpath("//div[@class='text-danger']"));
//        assertThat(lNameErrorMessage.getText(), is(equalTo("Last Name must be between 1 and 32 characters!")));
//
//    }
//
//    @When("I enter invalid details for Telephone number with valid input for all other mandatory fields")
//    public void iEnterInvalidDetailsForTelephoneNumberWithValidInputForAllOtherMandatoryFields() {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys("Nnena");
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys("Odele");
//        WebElement eMail = driver.findElement(By.id("input-email"));
//        eMail.sendKeys("nnena@gmail.com");
//        WebElement telePhone = driver.findElement(By.id("input-telephone"));
//        telePhone.sendKeys("08");
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys("yahoo");
//        WebElement confirmPword = driver.findElement(By.id("input-confirm"));
//        confirmPword.sendKeys("yahoo");
//        WebElement privacyPolicy = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        privacyPolicy.click();
//    }
//
//    @Then("I should get error message as per design eight")
//    public void iShouldGetErrorMessageAsPerDesignEight() {
//        WebElement telErrorMessage = driver.findElement(By.xpath("//div[@class='text-danger']"));
//        assertThat(telErrorMessage.getText(), is(equalTo("Telephone must be between 3 and 32 characters!")));
//
//    }
//
//    @When("I enter valid input for all other mandatory fields")
//    public void i_enter_valid_input_for_all_other_mandatory_fields() {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys("Nnena");
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys("Odele");
//        WebElement eMail = driver.findElement(By.id("input-email"));
//        eMail.sendKeys("nnena9@gmail.com");
//        WebElement telePhone = driver.findElement(By.id("input-telephone"));
//        telePhone.sendKeys("0899789056");
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys("yahoo");
//        WebElement confirmPword = driver.findElement(By.id("input-confirm"));
//        confirmPword.sendKeys("yahoo");
//
//
//    }
//
//    @When("I leave the Privacy Policy box unticked")
//    public void i_leave_the_privacy_policy_box_unticked() {
//        WebElement privacyPolicy = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        privacyPolicy.isEnabled();
//
//    }
//
//    @Then("I should get error message as per design nine")
//    public void i_should_get_error_message_as_per_design_nine() {
//        WebElement privacyPolicyErrorMsg = driver.findElement(By.xpath("//div[contains(text(),'You must agree to the Privacy Policy!')]"));
//        assertThat(privacyPolicyErrorMsg.isDisplayed(), is(equalTo(true)));
//
//
//
//    }
//
//    @When("I enter invalid details for Email address with valid input for all other mandatory fields")
//    public void iEnterInvalidDetailsForEmailAddressWithValidInputForAllOtherMandatoryFields() {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys("Nnena");
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys("Odele");
//        WebElement eMail = driver.findElement(By.id("input-email"));
//        eMail.isSelected();
//        WebElement telePhone = driver.findElement(By.id("input-telephone"));
//        telePhone.sendKeys("0899657890");
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys("yahoo");
//        WebElement confirmPword = driver.findElement(By.id("input-confirm"));
//        confirmPword.sendKeys("yahoo");
//        WebElement privacyPolicy = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        privacyPolicy.click();
//
//    }
//
//    @And("I should get error message as per design six")
//    public void iShouldGetErrorMessageAsPerDesignSix() {
//        WebElement eMailErrorMsg = driver.findElement(By.xpath("//div[@class='text-danger']"));
//        assertThat(eMailErrorMsg.getText(), is(equalTo("E-Mail Address does not appear to be valid!")));
//
//
//    }
//
//    @When("I enter username as  {string} and password {string}")
//    public void i_enter_username_as_and_password(String eMail, String pWord) {
//        WebElement emailAddress = driver.findElement(By.id("input-email"));
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        emailAddress.sendKeys(eMail);
//        passWord.sendKeys(pWord);
//    }
//
//    @When("I click on Login button")
//    public void i_click_on_login_button() {
//        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
//        loginButton.click();
//
//    }
//
//    @When("I click on {string} menu")
//    public void i_click_on_menu(String string) {
//        List<WebElement> shopByCategories = driver.findElements(By.xpath("//a[@data-toggle='mz-pure-drawer']"));
//        shopByCategories.get(7).click();
//
//    }
//
//    @When("I click on {string} from the left hand menu")
//    public void i_click_on_from_the_left_hand_menu(String soft) {
//        WebElement softWare = driver.findElement(By.xpath("//span[contains(text(),'Software')]"));
//        softWare.click();
//
//    }
//
//    @When("I choose {string}")
//    public void i_choose(String string) {
//        List<WebElement> palmTreoPro = driver.findElements(By.xpath("//a[@class='text-ellipsis-2']"));
//        palmTreoPro.get(1).click();
//
//    }
//
//    @When("I click on Buy Now")
//    public void i_click_on_buy_now() {
//        WebElement buyNow = driver.findElement(By.xpath("//button[@title='Buy now']"));
//        buyNow.click();
//
//    }
//
//    @And("And I populate all the the mandatory field")
//    public void andIPopulateAllTheTheMandatoryField() {
//        WebElement firstName = driver.findElement(By.id("input-payment-firstname"));
//        WebElement lastName = driver.findElement(By.id("input-payment-lastname"));
//        WebElement addRess = driver.findElement(By.id("input-payment-address-1"));
//        WebElement city = driver.findElement(By.id("input-payment-city"));
//        WebElement postCode = driver.findElement(By.id("input-payment-postcode"));
//        Select select = new Select(driver.findElement(By.id("input-payment-country")));
//        select.selectByVisibleText("Ireland");
//        select = new Select(driver.findElement(By.id("input-payment-zone")));
//        select.selectByVisibleText("Dublin");
//        firstName.sendKeys("sheye");
//        lastName.sendKeys("Odele");
//        addRess.sendKeys("12 Belfry Green");
//        city.sendKeys("Balbriggan");
//        postCode.sendKeys("k32F");
//
//
//    }
//
//    @When("I accept terms and condition")
//    public void i_accept_terms_and_condition() {
//        WebElement acceptTC = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        acceptTC.click();
//    }
//
//    @When("I click on continue")
//    public void i_click_on_continue() {
//        List<WebElement> continueButton = driver.findElements(By.xpath("//button[@type='submit']"));
//        continueButton.get(2).click();
//
//    }
//
//    @When("I click on Confirm order button")
//    public void i_click_on_confirm_order_button() {
//        WebElement confirmOrder = driver.findElement(By.id("button-confirm"));
//        confirmOrder.click();
//
//    }
//
//    @Then("{string} is displayed")
//    public void is_displayed(String string) {
//        WebElement orderPlaced = driver.findElement(By.xpath("//h1[contains(text(),' Your order has been placed!')]"));
//        assertThat(orderPlaced.isDisplayed(), is(true));
//
//
//    }
//
//    @When("I hover on my account and I click on register link")
//    public void iHoverOnMyAccountAndIClickOnRegisterLink() {
//        List<WebElement> myAccount = driver.findElements(By.xpath("//span[contains(text(),'My account')] "));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(myAccount.get(1)).perform();
//        WebElement Register = driver.findElement(By.xpath("//span[contains(text(),' Register')] "));
//        Register.click();
//
//    }
////    @When("I search for {string}")
////    public void iSearchFor(String arg0) {
////        WebElement searchField = driver.findElement(By.xpath("//div[@id='entry_217822']//input[@placeholder='Search For Products']"));
////        Actions actions = new Actions(driver);
////        actions.sendKeys(searchField, "HTC").perform();
////        WebElement searchButton = driver.findElement(By.xpath("//button[normalize-space()='Search']"));
////        searchButton.click();
//
////    }
//
////    @Then("{string} page is displayed.")
////    public void pageIsDisplayed(String arg0) {
////        WebElement htcPageDisplayed = driver.findElement(By.xpath("//h1[contains(text(),'Search - HTC')]"));
////        assertThat(htcPageDisplayed.isDisplayed(), is(true));
////    }
//        @After
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }
//    /////////////////////////////////////////////////////////////////////////////////////////////////
//
//    @Given("user is on Lambdatest home page {string}")
//    public void user_is_on_lambdatest_home_page(String lamdadURL) {
//        driver.manage().window().maximize();
//        driver.get(lamdadURL);
//
//    }
//    @When("user hover over MyAccount Menu and click on Register link")
//    public void user_hover_over_my_account_menu_and_click_on_register_link() {
//        List<WebElement> myAccount = driver.findElements(By.xpath("//span[contains(text(),'My account')] "));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(myAccount.get(1)).perform();
//        WebElement RegisterButton = driver.findElement(By.xpath("//span[contains(text(),' Register')]"));
//        RegisterButton.click();
//
//    }
//    @Then("Register page is displayed")
//    public void register_page_is_displayed() {
//        WebElement registerPage = driver.findElement(By.xpath("//h1[contains(text(),'Register Account')]"));
////        assertThat(registerPage.isDisplayed(),is(true));
//        assertThat(registerPage.getText(),is(equalTo("Register Account")));
//
//    }
//    @And("user enters valid details for First Name as {string}, Last Name as {string}, E-mail as {string}, Telephone as {string}, Password and ConfirmPassword as {string}")
//    public void userEntersValidDetailsForFirstNameAsLastNameAsEMailAsTelephoneAsPasswordAndConfirmPasswordAs(String fName, String lName, String eMail, String Telephone, String pWord) {
//        WebElement firstName = driver.findElement(By.id("input-firstname"));
//        firstName.sendKeys(fName);
//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        lastName.sendKeys(lName);
//        WebElement emailAddress = driver.findElement(By.id("input-email"));
//        emailAddress.sendKeys(lNumber()+eMail);
//        WebElement telephonNum = driver.findElement(By.id("input-telephone"));
//        telephonNum.sendKeys(Telephone);
//        WebElement passWord = driver.findElement(By.id("input-password"));
//        passWord.sendKeys(pWord);
//        WebElement confirmPword = driver.findElement(By.id("input-confirm"));
//        confirmPword.sendKeys(pWord);
//    }
//
//    static int lNumber() {
//        Random ran = new Random();
//        return ran.nextInt(1000);
//
//    }
//
//    @And("user accept the Privacy Policy")
//    public void user_accept_the_privacy_policy() {
//        WebElement privacyPolicy = driver.findElement(By.xpath("//label[@for='input-agree']"));
//        privacyPolicy.click();
//
//    }
//    @And("user  click on the Continue button on the Registration and Account page")
//    public void user_click_on_the_continue_button_on_the_registration_and_account_page() {
//        WebElement countinueButton = driver.findElement(By.xpath("//input[@type='submit']"));
//        countinueButton.click();
//
//    }
//    @Then("Register Confirmation page is displayed")
//    public void register_confirmation_page_is_displayed() {
//        WebElement confirmationPage = driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
//        assertThat(confirmationPage.isDisplayed(),is(true));
////        assertThat(confirmationPage.getText(),is(equalTo("Your Account Has Been Created!")));
//
//    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @When("I search for {string}")
//    public void i_search_for(String string) {
//        WebElement searchField = driver.findElement(By.xpath("//div[@id='entry_217822']//input[@placeholder='Search For Products']"));
//        Actions action = new Actions(driver);
//        action.sendKeys(searchField, "HTC").perform();
//        List <WebElement> searchButton = driver.findElements(By.xpath("//div[@class='search-button']"));
//        searchButton.get(0).click();
//
//
//}
//    @Then("{string} page is displayed.")
//    public void page_is_displayed(String string) {
//        WebElement htcPage = driver.findElement(By.xpath("//h1[contains(text(),'Search - HTC')]"));
////        assertThat(htcPage.getText(),is(equalTo("Search - HTC")));
//        assertThat(htcPage.isDisplayed(),is(equalTo(true)));
//
//    }
//    @Then("I click on {string}")
//    public void i_click_on(String string) {
//        List <WebElement> htcPhone = driver.findElements(By.xpath("//img[@class='lazy-load']"));
//        htcPhone.get(3).click();
//
//
//    }
//
//
//    @And("I click on Add to cart")
//    public void iClickOnAddToCart() {
//        List <WebElement> addCart = driver.findElements(By.xpath("//button[contains(text(),'Add to Cart')]"));
//        addCart.get(1).click();
//    }
//}
