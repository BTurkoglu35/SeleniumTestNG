package test.day18;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C03_ConfigReader {

    @Test(groups = "gp2")
    public void test01() {

        //amazona gidelim
        String urlamzn= ConfigReader.getProperty("amznUrl");
        String urlface=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlface);
        Driver.closeDriver();


    }
}
