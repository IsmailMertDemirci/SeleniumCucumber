package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {
    public TutorialPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')]")
    public WebElement phonesPDAs;

    @FindBy (xpath = "//h4")
    public List<WebElement> phoneList;

    @FindBy (xpath = "//*[text()='Add to Cart']")
    public List<WebElement> addToCart;

    @FindBy (css = "[id='cart-total']")
    public WebElement sepet;

    @FindBy (xpath = "//td[@class='text-left']")
    public List<WebElement> sepetList;




}
