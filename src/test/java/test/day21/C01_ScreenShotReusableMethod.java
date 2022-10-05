package test.day21;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.annotations.Test;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {
        //hepsiburada sayfasina gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //ve sayfanin resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");
        //sayfayi kapatiniz
        Driver.closeDriver();
    }
}
