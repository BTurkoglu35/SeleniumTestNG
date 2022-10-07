package test.practice09;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBaseRapor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;


public class J01_SearchProductTest extends TestBaseRapor {
    AutomationExercisePage autoE;
    @Test
    public void searchProductPage() {
        autoE= new AutomationExercisePage();
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve password ile giris yapabilmeli ");

        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        extentTest.info("url'e gidildi");
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String homeUrl="https://www.automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), homeUrl);
        extentTest.info("url'e gidildi");
        // 4. 'Ürünler' butonuna tıklayın
        autoE.products.click();
        extentTest.info("Ürünler' butonuna tıklandi");
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(autoE.allProductsText.isDisplayed());
        extentTest.info(" TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulandi");
        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        Driver.Actions().click(autoE.urunAramaKutusu).sendKeys("Blue Top").click(autoE.aramaKutusuClick).perform();
        extentTest.info("Arama girişine ürün adı girildi ve ara düğmesine tıklayındi");
        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
       Assert.assertTrue(autoE.searchedProducts.isDisplayed(),"aranan urunler bolumu gorunur");
        extentTest.info("ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın");
        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        Assert.assertTrue(autoE.searchProductBlueTop.isDisplayed());
        extentTest.info("Aramayla ilgili ürünün (\"blue top\") görünür olduğunu doğrulayındi");




    }
}
