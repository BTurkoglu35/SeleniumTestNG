package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//*[@id='email']")
    public WebElement email;

    @FindBy(css = "input[id='pass']")
    public WebElement password;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement login;

    @FindBy (xpath = "//div[@class='_9ay7']")
    public WebElement girisYpilmadi;



}
