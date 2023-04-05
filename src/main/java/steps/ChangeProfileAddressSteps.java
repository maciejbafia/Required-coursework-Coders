package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.*;

import java.time.Duration;

public class ChangeProfileAddressSteps {

    public static WebDriver driver;
    public String url = "https://mystore-testlab.coderslab.pl/index.php";

    @Given("Not logged in but have created account while on the main page of app")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    @When("Click Sign in on main page")
    public void goToLoginPage(){
        HomePage homePage = new HomePage(driver);
        homePage.clickSignInBtn();
    }

    @And("Login to your account with {string} and {string}")
        public void loginFromMainPage(String email, String password){
        LogInPage logInPage = new LogInPage(driver);
        logInPage.loginToAccount(email, password);
    }

    @Then("Create new address and fill address form, with {string} {string} {string} {string} {string} {string}")
    public void createFirstNewAddress(String alias, String address, String city, String postalCode,String country_value,String phoneNumber){
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickAddresses();
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.clickCreateNewAddress();
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.newAddress(alias,address,city,postalCode,country_value,phoneNumber);
    }

    @And("Check your Addresses tab to see if {string} information {string} {string} {string} {string} {string} {string} was updated and correct")
    public void checkAddressValues(String alias, String user, String address, String city, String postalCode,String country,String phoneNumber){
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        Assert.assertEquals(yourAddressesPage.getAddressInfo(),user+ "\n" +alias + "\n" + address + "\n" + city+ "\n" + postalCode+ "\n" + country+ "\n" + phoneNumber);
    }

    @But("Delete updated address and check if changes occurred")
    public void deleteAddressAndCheck(){
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        Assert.assertFalse(yourAddressesPage.deleteAndCheck());
        driver.quit();
    }
}
