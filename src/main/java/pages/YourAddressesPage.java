package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class YourAddressesPage {
    public YourAddressesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "//span[contains(text(),'Create new address')]")
    WebElement createNewAddressBtn;

    @FindBy(xpath = "//div/h4/text()")
    WebElement submittedAlias;

    @FindBy(xpath = "//div/address/text()[1]")
    WebElement submittedName;

    @FindBy(xpath = "//div/address/text()[2]")
    WebElement submittedAddress;

    @FindBy(xpath = "//div/address/text()[3]")
    WebElement submittedCityStatePostCode;

    @FindBy(xpath = "//div/address/text()[4]")
    WebElement submittedCountry;

    @FindBy(xpath = "//div/address/text()[5]")
    WebElement submittedPhoneNumber;

    public void clickCreateNewAddress(){
        createNewAddressBtn.click();
    }

    public boolean checkChanges(String alias, String name, String address, String city, String postalCode,String country, String state ,String phoneNumber){
        Assert.assertEquals(submittedAlias.getText(), alias);
        Assert.assertEquals(submittedName.getText(), name);
        Assert.assertEquals(submittedAddress.getText(), address);
        Assert.assertEquals(submittedCityStatePostCode.getText(), city + state + postalCode);
        Assert.assertEquals(submittedCountry.getText(), country);
        Assert.assertEquals(submittedPhoneNumber.getText(), phoneNumber);
        return true;

}
}
