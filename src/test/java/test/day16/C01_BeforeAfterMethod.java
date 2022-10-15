package test.day16;

import Utilities.TestBAseBeforeAfter;

import org.testng.annotations.Test;
import org.testng.internal.annotations.BaseBeforeAfter;

public class C01_BeforeAfterMethod extends TestBAseBeforeAfter {
    //TestNG framework'unda @Before ve @After notasyonlari yerine @BeforeMethod ve @AfterMethod kullanilir
    //Calisma prensibi JUnit'deki Before,After ile aynidir
    @Test
    public void AmozonTesti() {
        driver.get("https://amazon.com");
    }

    @Test(groups = "gp1")
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducationTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
