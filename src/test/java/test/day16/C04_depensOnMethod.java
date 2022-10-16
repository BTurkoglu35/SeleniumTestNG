package test.day16;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C04_depensOnMethod extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        //amazon ona sayfasina gidelim
        driver.get("https://www.amazon.com");

    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        //Nutella aratalim
        driver.findElement(By.xpath("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }

    @Test(dependsOnMethods="test2")
    public void test3() {
        //sonuc yazisinin amazon icerdigini test edelim
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));
    }
}
