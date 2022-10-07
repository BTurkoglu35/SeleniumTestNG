package test.day23;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BluePage;

public class C02_DataProvider {
     BluePage bluePage;

    @DataProvider
    public static Object[][] kullanicBilgileri() {
        return new Object[][]{{"jdj@gmail.com","4561"},{"hgytr@gmail.com","7845"},{"ueurr@gmail.com","4568"}};
    }


    @Test(dataProvider = "kullanicBilgileri")
    public void test01(String email, String password) {
         //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //login butonuna bas
        bluePage=new BluePage();
        bluePage.ilkLogin.click();
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        bluePage.email.sendKeys(email);
        bluePage.password.sendKeys(password);
        //login butonuna tiklayin
        bluePage.ikinciLogin.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(bluePage.ikinciLogin.isDisplayed());
    }
}
