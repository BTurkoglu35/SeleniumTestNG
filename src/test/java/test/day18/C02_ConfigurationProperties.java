package test.day18;

import utilities.ConfigReader;
import utilities.Driver;
import org.testng.annotations.Test;

public class C02_ConfigurationProperties {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));

    }
}
