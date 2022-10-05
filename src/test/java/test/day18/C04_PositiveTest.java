package test.day18;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;

public class C04_PositiveTest {
 //  Bir Class olustur : PositiveTest
 //  2) Bir test method olustur positiveLoginTest()  https://www.hotelmycamp.com/ adresine git  login butonuna bas
 //  test data username: manager ,  test data password : Manager1!
 //  Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


    @Test
    public void positiveLoginTest() {
        String url= ConfigReader.getProperty("hotelMycampUrl");
        Driver.getDriver().get(url);

        HotelMyCamp myCamp=new HotelMyCamp();
        myCamp.login.click();

        String username=ConfigReader.getProperty("Username");
        myCamp.name.sendKeys(username);

        String password=ConfigReader.getProperty("password");
        myCamp.password.sendKeys(password);

        myCamp.submit.click();

        Assert.assertTrue(myCamp.girisSayfasi.isDisplayed());

        Driver.closeDriver();
    }

}
