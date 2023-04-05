package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddressesPage {
    public YourAddressesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@data-link-action='add-address']//span[contains(text(),'Create new address')]")
    WebElement createNewAddressBtn;

    @FindBy(xpath = "//button[@name='confirm-addresses'][contains(text(),'Continue')]")
    WebElement continueBtn;

    @FindBy(xpath = "//div[@class='address-body']")
    WebElement addressInformation;


    public String getAddressInfo() {
        return addressInformation.getText();
    }

    public void clickCreateNewAddress(){
        createNewAddressBtn.click();
    }

    public void clickContinue(){
        continueBtn.click();
    }

}







