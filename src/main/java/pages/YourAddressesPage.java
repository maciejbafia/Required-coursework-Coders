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

    @FindBy(xpath = "(//div[@class='address-body'])[2]")
    WebElement addressInformation;

    @FindBy(xpath = "(//div[@class='address-body'])[2]")
    WebElement secondAddressBody;

    @FindBy(xpath = "(//div[@class='address-footer']//span[contains(text(),'Delete')])[2]")
    WebElement deleteAddressBtn;

    public boolean isAddressDisplayed(){
        return secondAddressBody == null;
    }

    public String getAddressInfo() {
        return addressInformation.getText();
    }

    public void clickCreateNewAddress(){
        createNewAddressBtn.click();
    }

    public void clickContinue(){
        continueBtn.click();
    }

    public void deleteAddress(){
        deleteAddressBtn.click();
    }

    public boolean deleteAndCheck(){
        deleteAddress();
        return isAddressDisplayed();
    }

}







