package test.day16;

import org.testng.annotations.Test;

public class C03_Priority extends utilities.TestBAseBeforeClassAfterClass {
    //Testlerimizi calistiriken istedigimiz siraya gore calismasini istersek
    //priority methodunu kullaniriz
    //priority kullanmazsak default olarak 0'dir
    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://youtube.com");
    }

    @Test //burayi sifir kabull eder bu yuzden ilk bu method calisir
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority =2)
    public void amazon() {
        driver.get("https://www.amazon.com");
    }

}
