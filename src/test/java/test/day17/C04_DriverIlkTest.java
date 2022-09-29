package test.day17;

import Utilities.Driver;
import org.testng.annotations.Test;

public class C04_DriverIlkTest {
    /*
    Testbase class'ina extend ederek kulllandigimiz driverr yerine artik driver class'inda kullanacagimiz
    getDriver() statik methodunu kullaniriz
     */
    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://hepsiburada.com");
        Driver.closeDriver();
    }
}
