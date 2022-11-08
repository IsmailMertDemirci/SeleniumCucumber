package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TestPagePage {
    public TestPagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "[id='button']")
    public WebElement clickButton;


    @FindBy (xpath = "//p[text()=' down 32']")
    public List<WebElement> down32List;

    @FindBy (xpath = "//p[text()='click']")
    public List<WebElement> clickList;



}
