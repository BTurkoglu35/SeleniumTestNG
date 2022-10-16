package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemo {

    public Saucedemo() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//*[@id='user-name']")
    public WebElement username;

    @FindBy(xpath="//*[@id='password']")
    public WebElement password;

    @FindBy(xpath="//*[@id='login-button']")
    public WebElement loginButton;

    @FindBy (css = ".product_sort_container")
    public WebElement filter;

    @FindBy(xpath="//option[@value='lohi']")
    public WebElement lowtoHigh;
}
