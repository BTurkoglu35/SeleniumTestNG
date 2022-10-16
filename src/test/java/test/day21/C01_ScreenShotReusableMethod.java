package test.day21;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;



public class C01_ScreenShotReusableMethod {
private static Logger logger=  LogManager.getLogger(C01_ScreenShotReusableMethod.class.getName());
    @Test
    public void test01() throws IOException {
        logger.info("hepsi burada sitesine gidilir");
        //hepsiburada sayfasina gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //ve sayfanin resmini aliniz
        logger.info("ekran goruntusu aliniz");
        ReusableMethods.getScreenshot("hepsiburada");
        //sayfayi kapatiniz
        logger.info("sayfa kapatilir");
        Driver.closeDriver();
    }
}
