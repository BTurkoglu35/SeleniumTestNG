package test.day22;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BluePage;

public class C01_RaporluTest extends TestBaseRapor {
    BluePage bluePage;
    @Test
    public void test01() {
    bluePage=new BluePage();
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve password ile giris yapabilmeli ");
        //   -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("web sayfasina gidildi");
        //   -login butonuna bas
       bluePage.ilkLogin.click();
       extentTest.info("ilk login yapildi");
        //   -test data user email: customer@bluerentalcars.com ,
        bluePage.email.sendKeys(ConfigReader.getProperty("brcUser"));
        extentTest.info("email adresi girildi");
        //   -test data password : 12345 dataları girip login e basın
        bluePage.password.sendKeys(ConfigReader.getProperty("brcPassword"));
       extentTest.info("password girildi");
        //   -login butonuna tiklayin
        bluePage.ikinciLogin.click();
       extentTest.info("kullanici girisi yapildi");
        //   -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

     String actualIsim=bluePage.basariliGirisKullaniciIsmi.getText();
     String expectedIsim="John Walker";
     Assert.assertEquals(expectedIsim, actualIsim);
     extentTest.info("sayfaya basarili bir sekilde girildi");


    }
}
