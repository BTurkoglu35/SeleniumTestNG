package test.exercise;


import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HesapSilAutomationExercisePage;

public class Soru1 extends TestBaseRapor {

    HesapSilAutomationExercisePage autoE;

    @Test
    public void test1() throws InterruptedException {
        extentTest = extentReports.createTest("Hesap sil", "Hesab basarili bir sekilde silinmeli");
        autoE = new HesapSilAutomationExercisePage();
        SoftAssert softAssert = new SoftAssert();
        //2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        extentTest.info("automationexercise sayfasina giris yapildi");
        //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        softAssert.assertTrue(autoE.anasayfa.isDisplayed(), "anasayfa goruntulenmedi");
        String expectedUrl = "https://www.automationexercise.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl, actualUrl, "anasayfa goruntulenmedi");
        extentTest.info("anasayfa goruntulenmedi");
        //4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        autoE.SignupLogin.click();
        extentTest.info("kayıt Ol / Giriş Yap butonuna basildi");
        //5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
        softAssert.assertTrue(autoE.newUserLoginText.isDisplayed());
        extentTest.info("Yeni Kullanıcı Kaydı dogrulandi");
        //6. Adı ve e-posta adresini girin
        //7. 'Kaydol' düğmesini tıklayın
        String email = Driver.Faker().internet().emailAddress();
        String name = Driver.Faker().name().fullName();
        Driver.Actions().click(autoE.name).sendKeys(name).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        extentTest.info("adi ve soyadi bilgileri girildi kaydet tusuna basildi");
        //8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünür olduğunu doğrulayın
        softAssert.assertTrue(autoE.enterAccountInformation.isDisplayed());
        extentTest.info("Hesap bilgilerini girin ifadesi gorunur olduğunu doğrulandi");
        //9. Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
        Driver.Actions().click(autoE.mrsTitle).sendKeys(Keys.TAB)
                .sendKeys(name).sendKeys(Keys.TAB).sendKeys(email).sendKeys(Keys.TAB)
                .sendKeys(Driver.Faker().internet().password()).sendKeys(Keys.TAB).perform();
        Driver.Select(autoE.days).selectByValue("4");
        Driver.Select(autoE.months).selectByVisibleText("April");
        Driver.Select(autoE.years).selectByVisibleText("1993");
        //10. 'Bültenimize kaydolun!' onay kutusunu seçin.
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
        //12. Doldurma ayrıntıları: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
        //13. 'Hesap Oluştur düğmesini' tıklayın
        Thread.sleep(2000);
        Driver.Actions().click(autoE.bultenimizeKaydolun).sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .sendKeys(Driver.Faker().name().firstName()).sendKeys(Keys.TAB).sendKeys(Driver.Faker().name().lastName())
                .sendKeys(Keys.TAB).sendKeys("trendyol").sendKeys(Keys.TAB).sendKeys(Driver.Faker().address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(Driver.Faker().address().fullAddress()).sendKeys(Keys.TAB).perform();
        Driver.Select(autoE.country).selectByVisibleText("Singapore");
        Driver.Actions().click(autoE.state).sendKeys(Driver.Faker().address().state()).sendKeys(Keys.TAB)
                .sendKeys(Driver.Faker().address().country()).sendKeys(Keys.TAB).sendKeys(Driver.Faker().address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(Driver.Faker().phoneNumber().phoneNumber()).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        extentTest.info("Hesap olusturmak icin bilgiler girildi");
        //14. 'HESAP OLUŞTURULDU!' görünür
        softAssert.assertTrue(autoE.accountCreated.isDisplayed());
        extentTest.info("hesap olusturuldu yazisi gorunurlugu dogrulandi");
        //15. 'Devam' düğmesini tıklayın
        autoE.continueAccountCreated.click();
        extentTest.info("continue butonuna basildi");
        //16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
        softAssert.assertTrue(autoE.kullaniciAdiIleGirisYapildi.isDisplayed());
        extentTest.info("Kullanıcı adı olarak oturum açıldı dogrulandi");
        //17. 'Hesabı Sil' düğmesini tıklayın
        autoE.deleteAccount.click();
        extentTest.info("hesabi sil butonuna basildi");
        //18. 'HESAP SİL!' görünür
        softAssert.assertTrue(autoE.deleteAccountNewWindow.isDisplayed());
        extentTest.info("hesabi sil yazisi gorunurlugu dogrulandi");
        softAssert.assertAll();


    }
}
