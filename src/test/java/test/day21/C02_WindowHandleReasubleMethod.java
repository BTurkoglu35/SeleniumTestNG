package test.day21;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class C02_WindowHandleReasubleMethod {
    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        //● Click Here butonuna basın.
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin

        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows");

        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        ArrayList<String>pencereler=new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(pencereler.get(1));
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.quitDriver();

    }

    @Test
    public void test02() {
        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows");

        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Driver.quitDriver();

    }
}
