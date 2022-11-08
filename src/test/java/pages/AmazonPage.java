package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucYazisi;

    @FindBy (css = "[id='nav-link-accountList-nav-line-1']")
    public WebElement helloYazisi;  // Anasayfadaki Hello/sign bolumu

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement girisYap;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='continue']")
    public WebElement devamEt;

    @FindBy(xpath = "//*[text()='There was a problem']")
    public WebElement thereWasProblem;

    @FindBy(xpath = "//*[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(xpath = "//*[@class='a-link-normal']")
    public WebElement forgotYourPassword;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssistance;

    @FindBy (id="createAccountSubmit")
    public WebElement createYourAmazon;

    @FindBy (css = "[class='a-spacing-small']")
    public WebElement createAccountYazisi;


}
