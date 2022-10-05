package test.practice06;

import Utilities.Driver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;

public class J01 {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.

    @Test
    public void test01() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtm=new DhtmlgoodiesPage();
     Actions actions = new Actions(Driver.getDriver());
  //      actions.dragAndDrop(dhtm.oslo,dhtm.Norway).perform();
  //      actions.dragAndDrop(dhtm.Copenhagen,dhtm.Denmark).perform();
  //      actions.dragAndDrop(dhtm.Madrid,dhtm.Spain).perform();
  //      actions.dragAndDrop(dhtm.Seoul,dhtm.SouthKorea).perform();
  //      actions.dragAndDrop(dhtm.Rome,dhtm.Italy).perform();
  //      actions.dragAndDrop(dhtm.washington,dhtm.UnitedStates).perform();
  //      actions.dragAndDrop(dhtm.stockholm,dhtm.Sweden).perform();

      actions.dragAndDrop(dhtm.oslo,dhtm.Norway).
              dragAndDrop(dhtm.Copenhagen,dhtm.Denmark).
              dragAndDrop(dhtm.Madrid,dhtm.Spain).
              dragAndDrop(dhtm.Seoul,dhtm.SouthKorea).
              dragAndDrop(dhtm.Rome,dhtm.Italy).
              dragAndDrop(dhtm.washington,dhtm.UnitedStates).
              dragAndDrop(dhtm.stockholm,dhtm.Sweden).perform();

       Driver.closeDriver();
       /*
       framworkler buyudukce yeni classlar yeni test methodlari yeni webelementler olusturdukca icinden cikilmaz
       anlasilmaz ,tekrar bakimi yapilmaz,guncellemesi cok zor hatta imkansiz bir hal alir.

       Uzmanlar reusable,maintanable, rahat manipule edilebilir bir framwork icin bir design pattern olarak
       POM PAGE OBJECT MODEL'e karar vermisler
        1-Driver Classi
        2-Page class
        3-Test Class

        Aradigimiz bir webelementi yada bir methodu kolaylikla bulabilmek ve guncelleyebilmek icin
        javadan ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.

        */

    }
}
