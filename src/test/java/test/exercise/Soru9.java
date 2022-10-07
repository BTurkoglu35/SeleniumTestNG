package test.exercise;

import Utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;
import Utilities.ConfigReader;

public class Soru9 {
    @Test
    public void testName() {
        SoftAssert softAssert = new SoftAssert();
        AutomationExercisePage autoE= new AutomationExercisePage();
        //2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        softAssert.assertTrue(autoE.anasayfa.isDisplayed(),"anasayfa goruntulenmedi");
        //4. 'Ürünler' düğmesine tıklayın
        autoE.products.click();
        //5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        softAssert.assertTrue(autoE.allProductsText.isDisplayed(),"tum urunler ssayfasina gidilemedi");
        //6. Arama girişine ürün adını girin ve ara düğmesine tıklayın##
          Driver.Actions().click(autoE.urunAramaKutusu).sendKeys("Blue Top").click(autoE.aramaKutusuClick).perform();
        //7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        softAssert.assertTrue(autoE.searchedProducts.isDisplayed(),"aranan urunler bolumu gorunur");
        //8. Aramayla ilgili tüm ürünlerin görünür olduğunu doğrulayın
        autoE.viewProductBlueTop.click();
        softAssert.assertTrue(autoE.ilkUrunIsim.isDisplayed());
         softAssert.assertAll();
    }
}