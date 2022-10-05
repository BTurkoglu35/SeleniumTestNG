package test.exercise;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationExercisePage;

public class Soru10 {


    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();
        AutomationExercisePage autoE= new AutomationExercisePage();
        // 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        // Ana sayfanın başarıyla görünür olduğunu doğrulayın
        softAssert.assertTrue(autoE.anasayfa.isDisplayed(),"anasayfa goruntulenmedi");
        // Altbilgiye ilerleyin
        ReusableMethods.jsScroll(autoE.altBilgi);
        // 'ABONELİK' metnini doğrulayın
        softAssert.assertTrue(autoE.subscription.isDisplayed(),"Subscription yazisi gorunur degil");
        // Girişe e-posta adresini girin ve ok düğmesine tıklayın
        Driver.Actions().click(autoE.subscription).sendKeys("ertk@gmail.com",Keys.ENTER).perform();
        // Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür
        softAssert.assertTrue(autoE.successSucribe.isDisplayed(),"SuccessSucribe yazisi gorunur degil");
        softAssert.assertAll();
    }
}
