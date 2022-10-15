package test.day20;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import Utilities.ConfigReader;

public class C03_E2ETest {


    @Test
    public void E2ETest() throws InterruptedException {
        //  Tests packagenin altına class olusturun: CreateHotel
        //  Bir metod olusturun: createHotel
        //  https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelMycampUrl"));
        HotelMyCamp hmcPage = new HotelMyCamp();
        //  Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //  Username : manager
        //  Password  : Manager1!
        //  Login butonuna tıklayın.
        hmcPage.login.click();
        Driver.actions().click(hmcPage.name).sendKeys(ConfigReader.getProperty("Username"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //  Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hmcPage.hotelManagement.click();
        hmcPage.roomReservation.click();
        hmcPage.addRoomReservation.click();
        //  Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //  Save butonuna tıklayın.
        Driver.select(hmcPage.idUser).selectByVisibleText(ConfigReader.getProperty("Username"));
        Driver.actions().sendKeys(Keys.TAB).sendKeys("Happy Hotel")
                .sendKeys(Keys.TAB).sendKeys("1500").sendKeys(Keys.TAB).sendKeys("10/02/2022", Keys.ENTER)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(Driver.faker().name().fullName()).sendKeys(Keys.TAB)
                .sendKeys(Driver.faker().phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(Driver.faker().internet().emailAddress()).sendKeys(Keys.TAB).sendKeys("skajdlaksjdaasd")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        //  “RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(3000);
        Assert.assertTrue(hmcPage.reservationSuccessfully.isDisplayed());
        //  OK butonuna tıklayın.
        hmcPage.reservationOk.click();

    }
}
