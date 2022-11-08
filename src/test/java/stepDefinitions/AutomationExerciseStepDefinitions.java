package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutomationExerciseStepDefinitions {
    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String istenilenUrl) {
        Driver.getDriver().get(istenilenUrl);
    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Automation"));
    }

    @And("Test Case buttonuna tiklayin")
    public void testCaseButtonunaTiklayin() {
        Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Test Cases')]")).click();
    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendirildiginiDogrulayin() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//b[contains(text(),'Test Cases')]")).isDisplayed());
    }

    @And("ilgili sayfanin ekran goruntusunu alin")
    public void ilgiliSayfaninEkranGoruntusunuAlin() throws IOException {
        ReusableMethods.getScreenshot("Test Case Page");
    }
}
