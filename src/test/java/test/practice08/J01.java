package test.practice08;

import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuTestPage;

public class J01 {
    HerOkuTestPage herOkuTestPage;
    @Test
    public void test01() {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get(" https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Click all the buttons and verify they are all clicked
       herOkuTestPage = new HerOkuTestPage();
        //kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        //ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir
        Driver.Actions().click(herOkuTestPage.onblur).click(herOkuTestPage.onclick)
                .click(herOkuTestPage.onclick)
                .contextClick(herOkuTestPage.oncontextmenu)
                .doubleClick(herOkuTestPage.ondoubleclick)
                .click(herOkuTestPage.onfocus)
                .click(herOkuTestPage.onkeydown).sendKeys(Keys.ARROW_DOWN).click(herOkuTestPage.onkeydown)
                .click(herOkuTestPage.onkeyup).sendKeys(Keys.ARROW_UP).click(herOkuTestPage.onkeyup)
                .click(herOkuTestPage.onkeypress).sendKeys(Keys.SPACE).click(herOkuTestPage.onkeypress)
                .moveToElement(herOkuTestPage.onmouseover)
                .moveToElement(herOkuTestPage.onmouseleave).moveToElement(herOkuTestPage.onmousedown)
                .moveToElement(herOkuTestPage.onmousedown).click().perform();

        Assert.assertTrue(herOkuTestPage.EventTriggered.size()==11);
    }
}
