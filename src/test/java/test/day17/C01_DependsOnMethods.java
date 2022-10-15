package test.day17;

import org.testng.annotations.Test;

public class C01_DependsOnMethods {

    @Test
    public void test01() {
        driver.get("https://wamazon1.com");

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        driver.get("http://www.facebook.com");
    }


    @Test(dependsOnMethods = "test02")
    public void test03() {
        driver.get("http://www.bestbuy.com");
    }


    @Test
    public void test04() {
        driver.get("http://www.youtube.com");
    }
}
