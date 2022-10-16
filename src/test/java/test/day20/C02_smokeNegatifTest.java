package test.day20;

import utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCamp;
import utilities.ConfigReader;

public class C02_smokeNegatifTest {
    @Test
    public void yanlisKullanici() {//1. senaryo yanlis kullanici dogru sifre
        Driver.getDriver().get(ConfigReader.getProperty("hotelMycampUrl"));

        HotelMyCamp myCamp = new HotelMyCamp();
        myCamp.login.click();

        String username=ConfigReader.getProperty("wrongUsername");
        myCamp.name.sendKeys(username);

        String password=ConfigReader.getProperty("password");
        myCamp.password.sendKeys(password);

        myCamp.submit.click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(myCamp.hataMesaji.isDisplayed());

        softAssert.assertAll();
    }


    @Test
    public void yanlisSifre() {//2.senaryo dogru kullanici yanlis sifre
        Driver.getDriver().get(ConfigReader.getProperty("hotelMycampUrl"));

        HotelMyCamp myCamp = new HotelMyCamp();
        myCamp.login.click();

        String username=ConfigReader.getProperty("Username");
        myCamp.name.sendKeys(username);

        String password=ConfigReader.getProperty("wrongPassword");
        myCamp.password.sendKeys(password);

        myCamp.submit.click();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(myCamp.hataMesaji.isDisplayed());

        softAssert.assertAll();
    }

    @Test
    public void yanlisKullaniciYanlisSifre() {//3. senaryo yanlis kullanici yanlis sifre
        Driver.getDriver().get(ConfigReader.getProperty("hotelMycampUrl"));

        HotelMyCamp myCamp = new HotelMyCamp();
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
