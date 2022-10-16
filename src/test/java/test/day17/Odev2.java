package test.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Odev2  extends TestBaseBeforeAfter {
     /*
     Yeni bir Class Olusturun : C03_SoftAssert
     “http://zero.webappsecurity.com/” Adresine gidin
     Sign in butonuna basin
     Login kutusuna “username” yazin
     Password kutusuna “password” yazin
     Sign in tusuna basin
     Online banking menusu icinde Pay Bills sayfasina gidin
     “Purchase Foreign Currency” tusuna basin
     “Currency” drop down menusunden Eurozone u secin
     soft assert kullanarak "Eurozone (Euro)" secildigini test edin
     soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
     "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
     "China  (yuan)","Denmark (krone)","Eurozone (euro)",
     "Great Britain (pound)","Hong Kong  (dollar)","Japan (yen)",
     "Mexico (peso)","Norway (krone)","New Zealand  (dollar)",
     "Sweden (krona)","Singapore (dollar)","Thailand (baht)"
     */

    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();

        driver.get("http://zero.webappsecurity.com/");

        driver.findElement(By.xpath("//*[@id='signin_button']")).click();

        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");

        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        driver.navigate().back();

        driver.findElement(By.xpath("//*[@id='onlineBankingMenu']")).click();

        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();

        driver.findElement(By.cssSelector(".ui-tabs-nav.ui-helper-reset>:nth-child(3)")).click();
        //  “Currency” drop down menusunden Eurozone u secin
        WebElement dropDornCurrency= driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select select=new Select(dropDornCurrency);
        select.selectByVisibleText("Eurozone (euro)");
        //   soft assert kullanarak "Eurozone (Euro)" secildigini test edin

        softAssert.assertTrue(driver.findElement(By.xpath("//*[text()='Eurozone (euro)']")).isSelected());
        //     soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        List<String> expectedDD=new ArrayList<>(Arrays.asList( "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)",
                "China  (yuan)","Denmark (krone)","Eurozone (euro)",
                "Great Britain (pound)","Hong Kong  (dollar)","Japan (yen)",
                "Mexico (peso)","Norway (krone)","New Zealand  (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"));

        List<WebElement>actualDD=select.getOptions();
        actualDD.forEach(t-> System.out.println(t.getText()+","));

        for (int i = 0; i <actualDD.size() ; i++) {
            softAssert.assertEquals( actualDD.get(i).getText(),expectedDD.get(i),"secenekler eslesmiyor");


        }

    }
}
