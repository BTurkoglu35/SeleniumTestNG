package test.day21;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.HepsiBuradaPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork {
    //Hepsiburada sayfasina gidiniz
    //Elektronik altinda bilgisayar/tablet altindaki tum linkleri tiklayalim
    //Her linkten sonra o sayfaya gittigimizi test edelim ve o sayfanin resmini alalim
    //sayfayi kapatalim

    @Test
    public void test01() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("hepsiburadaUrl"));
        HepsiBuradaPage hepsiBurada = new HepsiBuradaPage();

        List<WebElement> liste = new ArrayList<>(Arrays.asList(hepsiBurada.lbilgisyarlar, hepsiBurada.ltablet, hepsiBurada.lmasaustuBilgisayar, hepsiBurada.loyuncuOzel, hepsiBurada.lveriDepolama
                , hepsiBurada.ltumKategoriler, hepsiBurada.lbilgisayarBilesenleri, hepsiBurada.lyurtDisindan, hepsiBurada.lagModemAkilliEv
                , hepsiBurada.lgrafikTablet, hepsiBurada.lcevreBilimleri, hepsiBurada.lyazilimUrunleri, hepsiBurada.laksesuarlar, hepsiBurada.lkulaklik));

        for (int i = 0; i < liste.size(); i++) {
            Driver.Actions().moveToElement(hepsiBurada.elektronik).perform();
            ReusableMethods.waitFor(2);
            Driver.Actions().moveToElement(hepsiBurada.tabletBilgisayar).perform();
            ReusableMethods.waitFor(2);

            ReusableMethods.waitFor(2);
            liste.get(i).click();

            ReusableMethods.waitFor(2);
            Driver.Actions().sendKeys(Keys.PAGE_DOWN).perform();

            ReusableMethods.waitFor(2);
            ReusableMethods.getScreenshot("link"+i + 1);

            Driver.getDriver().navigate().back();

        }


    }


    @Test
    @Ignore
    public void test02() throws IOException {
        //Amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amazonPage = new AmazonPage();
        //Nutella aratiniz
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazisi webelemntinin resmini alin
        ReusableMethods.getScreenshotWebElement("result", amazonPage.aramaSonucElementi);
    }
}
