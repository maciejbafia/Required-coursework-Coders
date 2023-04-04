package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInToYourAccountPage {
    //takpachniestozlotych@mail.pl
    //testtest
    public LogInToYourAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-email")
    WebElement emailInput;

    @FindBy(id = "field-password")
    WebElement passwordInput;

    @FindBy(id = "submit-login")
    WebElement signInBtn;

    public void loginToAccount(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInBtn.click();
    }
}