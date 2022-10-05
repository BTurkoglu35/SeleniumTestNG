package test.day20;

import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import Utilities.ConfigReader;

public class C01_smokePozitifTest {
    @Test
    public void testPozitifTest() {
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
    }

}
