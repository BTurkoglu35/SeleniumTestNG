package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HesapSilAutomationExercisePage {
    public HesapSilAutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="(//html[@lang='en'])")
    public WebElement anasayfa;

    @FindBy(xpath="//*[.=' Signup / Login']")
    public WebElement SignupLogin;

    @FindBy(xpath="//*[.='New User Signup!']")
    public WebElement newUserLoginText;

    @FindBy (xpath = "//*[@name='name']")
    public WebElement name;

    @FindBy (xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformation;

    @FindBy (xpath = "(//*[@class='radio-inline'])[1]")
    public WebElement mrTitle;

    @FindBy (xpath = "(//*[@class='radio-inline'])[2]")
    public WebElement mrsTitle;

    @FindBy (xpath = "//*[@id='days']")
    public WebElement days;

    @FindBy (xpath = "//*[@id='months']")
    public WebElement months;

    @FindBy (xpath = "//*[@id='years']")
    public WebElement years;

    @FindBy (xpath = "(//*[@class='checkbox'])[1]")
    public WebElement bultenimizeKaydolun;

    @FindBy (xpath = "//*[@id='country']")
    public WebElement country;

    @FindBy (xpath = "//*[.='Account Created!']")
    public WebElement accountCreated;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement continueAccountCreated;

    @FindBy (xpath = "//*[@id='state']")
    public WebElement state;

    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement kullaniciAdiIleGirisYapildi;

    @FindBy (xpath = "//*[@class='fa fa-trash-o']")
    public WebElement deleteAccount;

    @FindBy (xpath = "(//*[text()='Delete Account'])[2]")
    public WebElement deleteAccountNewWindow;

}
