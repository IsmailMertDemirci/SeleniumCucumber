package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PracticeAmazonStepDef {
    AmazonPage amazonPage=new AmazonPage();
    Actions actions=new Actions(Driver.getDriver());
    @When("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() throws InterruptedException {
    actions.moveToElement(amazonPage.helloYazisi).perform();
    Thread.sleep(1000);
    amazonPage.girisYap.click();
    }
    @When("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {
        Faker faker=new Faker();
        amazonPage.email.sendKeys(faker.internet().emailAddress());
    }
    @When("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigi_e_postanin_ekran_goruntusunu_alir() throws IOException {
        ReusableMethods.getScreenshotWebElement("email",amazonPage.email);
    }
    @When("continue'a tiklar")
    public void continue_a_tiklar() {
    amazonPage.devamEt.click();
    }
    @Then("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {
    Assert.assertTrue(amazonPage.thereWasProblem.isDisplayed());
    }
    @Then("Need help e tiklar")
    public void need_help_e_tiklar() {
    amazonPage.needHelp.click();
    }
    @Then("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {
    amazonPage.forgotYourPassword.click();
    }
    @Then("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
    Assert.assertTrue(amazonPage.passwordAssistance.isDisplayed());
    }
    @Then("Geri gider")
    public void geri_gider() {
    Driver.getDriver().navigate().back();
    Driver.getDriver().navigate().back();
    }
    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {
    amazonPage.createYourAmazon.click();
    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {
    Assert.assertTrue(amazonPage.createAccountYazisi.isDisplayed());
    }
}
