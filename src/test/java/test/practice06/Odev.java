package test.practice06;

import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Saucedemo;
import Utilities.ConfigReader;

public class Odev {
      /*
//     * Navigate to  https://www.saucedemo.com/
//     * Enter the username  as standard_user
//     * Enter the password as   secret_sauce
//     * Click on login button
//     * Choose price low to high
//       and verify that PRICE (LOW TO HIGH) is visible
     */

    @Test
    public void test01() {
     String url=ConfigReader.getProperty("saucedemoUrl");
     Driver.getDriver().get(url);

        Saucedemo saucedemo=new Saucedemo();
        saucedemo.username.sendKeys(ConfigReader.getProperty("usernameSauce"));

        saucedemo.password.sendKeys(ConfigReader.getProperty("passwordSauce"));

        saucedemo.loginButton.click();

        saucedemo.filter.click();

        Driver.Select(saucedemo.filter).selectByVisibleText("Price (low to high)");

        Assert.assertTrue(saucedemo.lowtoHigh.isSelected());

    }
}
