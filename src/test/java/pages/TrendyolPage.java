package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendyolPage {
    public TrendyolPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//div[@class='tF2Cxc']//div[@class='yuRUbf']//a//h3[@class='LC20lb MBeuO DKV0Md']")
    public WebElement trenyolGoogleLinki;

    @FindBy (css = "[class='search-bar']")
    public WebElement trendyolSearchbox;

    @FindBy (xpath = "//div[@class='title']")
    public WebElement trendyolShoesSayisi;

    @FindBy (css = "[id='pw-search-input']")
    public WebElement morhipoSearchBox;

    @FindBy (css = "[class='bigger']")
    public WebElement morhipoShoes;

}
