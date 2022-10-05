package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HepsiBuradaPage {
    public HepsiBuradaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//*[@class='sf-MenuItems-WulWXvlfIAwNiOUGY7FP'])[1]")
    public WebElement elektronik;

    @FindBy(xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement tabletBilgisayar;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1854']")
    public WebElement lbilgisyarlar;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1855']")
    public WebElement ltablet;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1856']")
    public WebElement lmasaustuBilgisayar;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-2362']")
    public WebElement loyuncuOzel;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1860']")
    public WebElement lveriDepolama;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1857']")
    public WebElement ltumKategoriler;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1861']")
    public WebElement lbilgisayarBilesenleri;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-3397']")
    public WebElement lyurtDisindan;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1858']")
    public WebElement lagModemAkilliEv;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-4043']")
    public WebElement lgrafikTablet;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1859']")
    public WebElement lcevreBilimleri;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1864']")
    public WebElement lyazilimUrunleri;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-1862']")
    public WebElement laksesuarlar;

    @FindBy(xpath = "//*[@class='sf-ChildMenuItems-KdzkrxSVhcwDy3od0Yre item-2709']")
    public WebElement lkulaklik;


}