package test.practice05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class J02 {
    @Test
    public void test1() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//*[@id='button1']")).click();
        // 3. Açılır metni alın
        String actualAlertMetni = driver.switchTo().alert().getText();
        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedAlertMetin = "I am an alert box!";
        Assert.assertEquals(expectedAlertMetin, actualAlertMetni);
        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();

    }
}
