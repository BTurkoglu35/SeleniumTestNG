package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {
    public AmazonPage() {//Constructor olusturup public yapmamiz gerekir.

        PageFactory.initElements(Driver.getDriver(), this);//page sayfasindaki locatelerimizi driver ile iliskilendirmemizie yariyor

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;
}
   /*
   page object
   Özetle;
   1- Tekrarlardan kurtuluruz
   2- Daha az kod daha çok iş
   3- Kolayca update yapabilme
    */