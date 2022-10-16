package test.practice07;

import utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToDoPage;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J01 {


    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("ToDoUrl"));
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        ToDoPage webUniversityPage = new ToDoPage();
        //Buradaki listeyi yapilacaklar listesine toplu olarak gonderen=bilem amaci
        List<String> isListesi = new ArrayList<>(Arrays.asList("Kahvalti hazirla", "bulasiklari yika", "bebekle ilgilen", "odeve yardim et", "selenium'a calis", "uyu"));
        for (String each:isListesi
             ) {
        Driver.actions().click(webUniversityPage.addNewToDo).sendKeys(each,Keys.ENTER).perform();
        }

       //Tüm yapılacakların üzerini çiz.
        List<WebElement>todos=webUniversityPage.todosWebelement;
        for (WebElement w:todos) {
            w.click();
        }
        //Tüm yapılacakları sil.
        for (WebElement w:webUniversityPage.deleteButtons) {
            w.click();
        }
        Thread.sleep(3000);
        //Tüm yapılacakların silindiğini doğrulayın.
        List<WebElement>newtodos=webUniversityPage.newTodosWebelement;
        Assert.assertEquals(0,newtodos.size());
        }


    }

/*
Expaotory testing:  test senaryolarının önceden oluşturulmadığı, testçilerin sistemi test anında kontrol ettiği bir tür yazılım testidir.
 Herhangi bir test senaryosuna bağlı kalmaksızın yazılımları serbestçe keşfederek buldukları bug’ları raporlamasına dayanır.
 Test uzmanlarının minimum planlama ve maksimum test uygulamasına katıldığı uygulamalı bir yaklaşımdır.
 Testin yürütülmesinden önce neyin test edileceğine dair fikirleri not edebilirler.
Keşif Testi (Exploratory Testing), diğer test yaklaşımlarında kolayca kapsanmayan hataları ve eksiklikleri keşfetmeye, ortaya çıkarmaya dayanır.
 Özellikle yazılım test döngüsünün başlarında sıkça başvurulan bir test türüdür.
 Test uzmanı açısından ise istediği şekilde son kullanıcı senaryoları oluşturma imkanı olduğu için eğlencelidir.
 */