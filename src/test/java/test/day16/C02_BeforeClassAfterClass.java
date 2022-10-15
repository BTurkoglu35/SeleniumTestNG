package test.day16;

import Utilities.TestBaseBeforeAfterClass;
import org.testng.annotations.Test;

public class C02_BeforeClassAfterClass extends TestBaseBeforeAfterClass {
    @Test
    public void testAmazon() {
        driver.get("https://amazon.com");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testTeccpro() {
        driver.get("https://www.techproeducation.com");
    }
}
