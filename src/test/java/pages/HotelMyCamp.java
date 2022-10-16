package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelMyCamp {

    public HotelMyCamp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy (xpath = "//*[@id='btnSubmit']")
    public WebElement submit;

    @FindBy(xpath = "//*[@class='page-content-wrapper']")
    public WebElement girisSayfasi;

    @FindBy (xpath = "//*[@class='validation-summary-errors']")
    public WebElement hataMesaji;

    @FindBy (xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy (xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy (xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy (xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy (xpath = "//*[text()='RoomReservation was inserted successfully']")
    public WebElement reservationSuccessfully;

    @FindBy (css = ".btn.btn-primary")
    public WebElement reservationOk;
}
