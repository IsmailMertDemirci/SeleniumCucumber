package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarStepDefinitions {
    BlueRentalCarsPage brc=new BlueRentalCarsPage();
    @Given("Kullanici bluerentacar sayfasina gider")
    public void kullaniciBluerentacarSayfasinaGider() {
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brc.loginHome.click();
    }

    @And("Gecersiz username girer")
    public void gecersizUsernameGirer() {
        brc.email.sendKeys(ConfigReader.getProperty("wrongUserEmail"));
    }

    @And("Gecersiz password girer")
    public void gecersizPasswordGirer() {
        brc.password.sendKeys(ConfigReader.getProperty("wrongPass"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() throws InterruptedException {
        brc.loginGiris.click();
        Thread.sleep(2000);
    }

    @Then("Sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(brc.hataliGiris).perform();
        Assert.assertTrue(brc.hataliGiris.isDisplayed());
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("Gecersiz email {string} girer")
    public void gecersizEmailGirer(String email) {
        brc.email.sendKeys(email);
    }

    @And("Gecersiz password {string} girer")
    public void gecersizPasswordGirer(String password) {
        brc.password.sendKeys(password);
    }
}
