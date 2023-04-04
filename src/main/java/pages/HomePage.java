package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//wybierze do zakupu Hummingbird Printed Sweater
// (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%),
public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement signInBtn;

    public void clickSignInBtn(){
        signInBtn.click();
    }

}
