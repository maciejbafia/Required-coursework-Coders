package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

//    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    @FindBy(xpath = "//a[contains(@href,'controller=my-account')]")
//    @FindBy(xpath = "a[href*='https://mystore-testlab.coderslab.pl/index.php?controller=my-account']")
    WebElement signInBtn;

    public void clickSignInBtn(){
        signInBtn.click();
    }

}
