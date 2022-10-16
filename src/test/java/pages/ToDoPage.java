package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToDoPage {
    public ToDoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement addNewToDo;

    @FindBy (xpath = "//li")
    public List<WebElement> todosWebelement;

    @FindBy (xpath = "//i[@class='fa fa-trash']")
    public List<WebElement>deleteButtons;

    @FindBy (xpath = "//li")
    public List<WebElement> newTodosWebelement;



}
