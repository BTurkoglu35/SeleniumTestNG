package test.day19;

import Utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCamp;
import Utilities.ConfigReader;

public class C02_NegatifTest {
//   1 ) Bir Class olustur : NegativeTest
//   2) Bir test method olustur NegativeLoginTest()
//   https://www.hotelmycamp.com/ adresine git
//   login butonuna bas
//   test data username: manager1 ,  test data password : manager1!
//   Degerleri girildiginde sayfaya girilemedigini test et


    @Test
    public void NegativeLoginTest() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMycampUrl"));

        HotelMyCamp myCamp = new HotelMyCamp();
        Thread.sleep(2000);
        myCamp.login.click();

        String username=ConfigReader.getProperty("wrongUsername");
        myCamp.name.sendKeys(username);

        String password=ConfigReader.getProperty("wrongPassword");
        myCamp.password.sendKeys(password);

        myCamp.submit.click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(myCamp.hataMesaji.isDisplayed());

        softAssert.assertAll();


    }
}
