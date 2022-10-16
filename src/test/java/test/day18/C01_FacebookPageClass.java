package test.day18;

import utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;

public class C01_FacebookPageClass {
    /*
    https://www.facebook.com/ adresine gi
    POM’a uygun olarak email, sifre kutularini ve giris yap
    butonunu locate edin
    Faker class’ini kullanarak email ve sifre degerlerini
    yazdirip, giris butonuna basin
    Basarili giris yapilamadigini test edin
     */

    @Test
    public void test01() {

        Driver.getDriver().get(" https://www.facebook.com/");

        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();


        facebookPage.email.sendKeys(faker.internet().emailAddress());

        facebookPage.password.sendKeys(faker.internet().password());

        facebookPage.login.click();

        Assert.assertTrue(facebookPage.girisYpilmadi.isDisplayed());



    }
}
