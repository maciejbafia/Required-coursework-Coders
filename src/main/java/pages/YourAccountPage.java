package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {
    public YourAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "address-link")
    WebElement addFirstAddressBtn;

    @FindBy(id = "addresses-link")
    WebElement addressesBtn;

    public void clickAddresses(){
        addressesBtn.click();
    }

}
