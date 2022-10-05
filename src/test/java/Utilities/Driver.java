package Utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Driver {
    private Driver() {
        //singleton pattern yani tekli kullanim  baska classtan obje
        //olusturarak kullanimini engellemek icin bu classsta private
        //constructor olusturuyoruz.
    }

    static WebDriver driver;
     static Faker faker;
    /*
    Testlerimizi calistirdigimizda her seferinde yeni driver olusturdugu icin her test methodu
    icin yeni bir pencere(driver) aciyor.Eger driver'a bir deger atanmissa yani driver=null ise
    bir kere driverí calistir diyerek bir kere if icini calistiracak.Ve driver artik bir kere
    calsitigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz
    ayni pencere(driver) uzerinde calisacak.
     */

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")){
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            faker=new Faker();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {//driver deger atanmissa
            driver.close();
            driver = null;//kapandiktan sonra sonraki acmalari garanti altina almak icin driverí tekrar null yaptik.
        }


    }

    public static void quitDriver() {
        if (driver != null) {//driverá deger atanmamissa
        driver.quit();
            driver = null;//kapandiktan sonra sonraki acmalari garanti altina almak icin driverí tekrar null yaptik.
        }
    }
      public static Select Select(WebElement x){
        Select select = new Select(x);
        return select;
      }


      public static Actions Actions() {
        Actions actions = new Actions(driver);
        return actions;
      }

      public static Faker Faker(){
        Faker faker = new Faker();
        return faker;
      }

}
