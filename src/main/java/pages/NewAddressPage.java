package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAddressPage {
    public NewAddressPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //alias, address, city, zip/postal code, country, phone
    @FindBy(id = "field-alias")
    WebElement aliasInput;

    @FindBy(id = "field-address1")
    WebElement addressInput;

    @FindBy(id = "field-city")
    WebElement cityInput;

    @FindBy(id = "field-postcode")
    WebElement zipOrPostalCode;

    @FindBy(id = "field-id_state")
    WebElement stateInput;

    @FindBy(id = "field-id_country")
    WebElement countryInput;

    @FindBy(id = "field-phone")
    WebElement phoneInput;

    @FindBy(xpath = "//footer/button[contains(text(),save)]")
    WebElement saveBtn;

    public void newAddress(String alias, String address, String city, String postalCode,String country, String state ,String phoneNumber){
        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        zipOrPostalCode.sendKeys(postalCode);
        Select countryValue = new Select(countryInput);
        countryValue.selectByValue(country);
        Select stateFromList = new Select(stateInput);
        stateFromList.selectByValue(state);
        phoneInput.sendKeys(phoneNumber);
        saveBtn.click();


    }
}
