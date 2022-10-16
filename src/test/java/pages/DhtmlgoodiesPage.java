package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DhtmlgoodiesPage {
    public DhtmlgoodiesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
       // Bir page sayfası ilk oluşturulduğunda, ilk yapmamız gereken şey burada bir Constructor oluşturmak. Public olmak zorunda!
       /*
               PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
        yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.

               Page Factory’i kullanımına bakacak olursak PageFactory model, Web elementlerini
        @FindBy annotionu ile algılar. How kalıbı ile birlikte elementlerin ayırt edici
        locator’ından hangisini kullanacaksak belirtilir. Sonrasında ise o ayırt edici
        locator’ın adı tanımlanır. Public WebElement ile birlikte test senaryolarında
        kullanmak üzere isimlendirmesi yaparız. Burada isimlendirme daha sonra baktığında
        anlayabilmek için önemlidir, okunaklı olmalıdır.
        */
    }
//capitals-baskentler
    @FindBy (xpath = "//*[@id='box1']")
    public WebElement oslo;

    @FindBy (xpath = "//*[@id='box2']")
    public WebElement stockholm;

    @FindBy (xpath = "//*[@id='box3']")
    public WebElement washington;

    @FindBy (xpath = "//*[@id='box4']")
    public WebElement Copenhagen;

    @FindBy (xpath = "//*[@id='box5']")
    public WebElement Seoul;

    @FindBy (xpath = "//*[@id='box6']")
    public WebElement Rome;

    @FindBy (xpath = "//*[@id='box7']")
    public WebElement Madrid;

    //countries-ulkeler
    @FindBy (xpath = "//*[@id='box106']")
    public WebElement Italy;

    @FindBy (xpath = "//*[@id='box107']")
    public WebElement Spain;

    @FindBy (xpath = "//*[@id='box101']")
    public WebElement Norway;

    @FindBy (xpath = "//*[@id='box104']")
    public WebElement Denmark;

    @FindBy (xpath = "//*[@id='box105']")
    public WebElement SouthKorea;

    @FindBy (xpath = "//*[@id='box102']")
    public WebElement Sweden;

    @FindBy (xpath = "//*[@id='box103']")
    public WebElement UnitedStates;



}
