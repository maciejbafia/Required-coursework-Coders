package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.*;

import java.time.Duration;

public class ChangeProfileAddressSteps {

    public static WebDriver driver;
    String url = "https://mystore-testlab.coderslab.pl/index.php";

    @Given("Not logged in but have created account while on the main page of app")
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("After selecting Sign in from main page login to your account with {string} and {string}")
    public void loginFromMainPage(String email, String password){
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInBtn();
        LogInToYourAccountPage logInToYourAccountPage = new LogInToYourAccountPage(driver);
        logInToYourAccountPage.loginToAccount(email, password);
    }

    @Then("Create new address and fill address form, with {string} {string} {string} {string} {string} {string} {string}")
    public void createFirstNewAddress(String alias, String address, String city, String postalCode,String country, String state ,String phoneNumber){
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickAddresses();
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.clickCreateNewAddress();
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.newAddress(alias,address,city, postalCode,country, state ,phoneNumber);
    }

    @And("Check your Addresses tab to see if {string} information like was updated and correct and match")
    public void checkAddressValues(String alias, String name, String address, String city, String postalCode,String country, String state ,String phoneNumber){
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.checkChanges(alias, name, address, city, postalCode, country, state ,phoneNumber);
    }

//    @But"Delete updated address and refresh page to see if changes occurred")
}
