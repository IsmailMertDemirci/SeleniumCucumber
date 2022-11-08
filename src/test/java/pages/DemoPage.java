package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {
    public DemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//li[@id='item-1'])[2]")
    public WebElement alertWE;

    @FindBy (xpath = "(//*[text()='Click me'])[2]")
    public WebElement click;

    @FindBy (xpath = "//*[@id='enableAfter']")
    public WebElement enable;

}