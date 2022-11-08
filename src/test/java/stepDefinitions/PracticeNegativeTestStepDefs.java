package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PracticeNegativeTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class PracticeNegativeTestStepDefs {
    PracticeNegativeTestPage pntp=new PracticeNegativeTestPage();
    @When("username icin {string} kullanici adini gonderir")
    public void username_icin_kullanici_adini_gonderir(String username) {
        username= Faker.instance().name().username();
        //username faker'dan hazir bir name yolladim, faker faker new faker bypass edildi
        pntp.username.sendKeys(username);

    }
    @When("password icin {string} parolasini gonderir")
    public void password_icin_parolasini_gonderir(String password) {
        password=Faker.instance().internet().password();
        pntp.password.sendKeys(password);
    }
    @When("signine tiklar")
    public void signine_tiklar() {
        pntp.signinWithCredentials.click();
    }
    @Then("Authentication information not correct uyarisini dogrular")
    public void authentication_information_not_correct_uyarisini_dogrular() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(pntp.popUpMessage));
        Assert.assertTrue(pntp.popUpMessage.isDisplayed());
        //*[contains(text(), 'Authentication information not correct.')]
        //contains text() olayı tum web elementleri icinde, icerisinde text olarak
        //'şu' text i iceren locateleri bul diyor. bunu baska bir text icerigi ile aranan metni değistirerek te kullanabiliriz
        //basina not gelirse icermiyorsa seklinde kullanilir
        //*[not(contains(text(), 'Authentication information not correct.'))]
    }

    @When("login olmak icin sign in butonuna tiklar")
    public void loginOlmakIcinSignInButonunaTiklar() {
        ReusableMethods.waitForClickablility(pntp.signinSymbol,5);
        pntp.signinSymbol.click();
        pntp.signinButton.click();
    }
}
