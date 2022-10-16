package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BluePage {
    public BluePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLogin;

    @FindBy(xpath ="//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath ="//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath ="//button[@class='btn btn-primary']")
    public WebElement ikinciLogin;

    @FindBy(xpath ="//*[@id='dropdown-basic-button']")
    public WebElement basariliGirisKullaniciIsmi;

    @FindBy(xpath ="//*[@name='car']")
    public WebElement arabaSecim;

    @FindBy(name = "pickUpLocation")
    public WebElement pickUpLocation;
}

