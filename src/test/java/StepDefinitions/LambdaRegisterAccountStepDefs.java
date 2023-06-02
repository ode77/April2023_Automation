package StepDefinitions;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class LambdaRegisterAccountStepDefs {
//    WebDriver driver;
//    @Given("I am on the Lambdatest home page {string}")
//    public void i_am_on_the_lambdatest_home_page(String lambdaUrl) {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities dp = new DesiredCapabilities();
//        dp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(dp);
//        driver = new ChromeDriver(options);
//        //maximize the screen
//        driver.manage().window().maximize();
//        //Navigate to the lambda home page
////        driver.get(lambdaUrl);
//        driver.navigate().to(lambdaUrl);
//
//    }
//    @When("I click on MyAccount Menu")
//    public void i_click_on_my_account_menu() {
//        driver.findElements(By.xpath("//span[contains(text(),'My account')] ")).get(1).click();
//    }
//    @When("I click on Continue under the New Customer")
//    public void i_click_on_continue_under_the_new_customer() {
//        driver.findElement(By.xpath("//a[contains(text(),'Continue')] ")).click();
//    }
//    @Then("the Register Account page should be displayed")
//    public void the_register_account_page_should_be_displayed() {
//       assertThat(driver.findElement(By.xpath("//h1[@class='page-title h3']")).getText(),is(equalTo("Register Account")));
//    }
//
//
//}
