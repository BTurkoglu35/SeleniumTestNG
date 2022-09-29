package test.day17;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import pages.AmazonPage;

public class C05_PageClass {
    @Test
    public void test01() {
        Driver.getDriver().get("http://amazon.com");
        AmazonPage amazon = new AmazonPage();
        amazon.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        System.out.println(amazon.aramaSonucElementi.getText());


    }
}
