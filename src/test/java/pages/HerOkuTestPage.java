package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HerOkuTestPage {
    public HerOkuTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@id='onblur']")
    public WebElement onblur;

    @FindBy(xpath="//*[@id='onclick']")
    public WebElement onclick;

    @FindBy (xpath = "//*[@id='oncontextmenu']")
    public WebElement oncontextmenu;

    @FindBy (xpath = "//*[@id='ondoubleclick']")
    public WebElement ondoubleclick;

    @FindBy (xpath = "//*[@id='onfocus']")
    public WebElement onfocus;

    @FindBy (xpath = "//*[@id='onkeydown']")
    public WebElement onkeydown;

    @FindBy (xpath = "//*[@id='onkeyup']")
    public WebElement onkeyup;

    @FindBy (xpath = "//*[@id='onkeypress']")
    public WebElement onkeypress;

    @FindBy (xpath = "//*[@id='onmouseover']")
    public WebElement onmouseover;

    @FindBy (xpath = "//*[@id='onmouseleave']")
    public WebElement onmouseleave;

    @FindBy (xpath = "//*[@id='onmousedown']")
    public WebElement onmousedown;

    @FindBy (xpath = "//*[.='Event Triggered']")
    public List<WebElement>EventTriggered;








}
