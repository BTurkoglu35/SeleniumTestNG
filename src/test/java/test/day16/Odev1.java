package test.day16;

import Utilities.TestBAseBeforeClassAfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.priority;

public class Odev1 extends TestBAseBeforeClassAfterClass {
    /*
    1) Bir class oluşturun: YoutubeAssertions

3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin



     */

    @Test(priority = 1)
    public void test1() {
        //2) https://www.youtube.com adresine gidin
        driver.get("https://youtube.com");
    }

    @Test(priority=2)
    public void testtitleTest() {
        //○ titleTest => Sayfa başlığının “YouTube” icerdigini test edin
       String actualTitle=driver.getTitle();
       String str="YouTube";
       Assert.assertTrue(actualTitle.contains(str));
    }

    @Test(priority=3)
    public void test3() {
        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement logo= driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test(priority=4)
    public void test4() {
      //  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox =driver.findElement(By.xpath("//div[@id='search-input']"));
        Assert.assertTrue(searchBox.isEnabled());
    }

    @Test(priority=5)
    public void test5() {
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String actualTitle=driver.getTitle();
        String str="youtube";
        Assert.assertNotEquals(actualTitle, str);
    }
}
