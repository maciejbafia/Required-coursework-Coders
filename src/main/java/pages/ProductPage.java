package pages;//wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
//wybierze 5 sztuk według parametru podanego w teście
// (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
//dodaj produkt do koszyka,

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //proceed to checkout
}
