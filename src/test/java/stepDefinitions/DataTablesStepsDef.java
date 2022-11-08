package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepsDef {
    DataTablesPage dT=new DataTablesPage();
    Actions actions=new Actions(Driver.getDriver());
    @Then("New butonuna basar")
    public void newButonunaBasar() {
        dT.newButonu.click();
    }

    @And("Kullanici first name {string} girer")
    public void kullaniciFirstNameGirer(String firstName) {
        dT.firstName.sendKeys(firstName);
    }

    @And("Kullanici last name {string} girer")
    public void kullaniciLastNameGirer(String lastName) {
        dT.lastName.sendKeys(lastName);
    }

    @And("Kullanici position {string} girer")
    public void kullaniciPositionGirer(String position) {
        dT.position.sendKeys(position);
    }

    @And("Kullanici office {string} girer")
    public void kullaniciOfficeGirer(String office) {
        dT.office.sendKeys(office);
    }

    @And("Kullanici extension {string} girer")
    public void kullaniciExtensionGirer(String extension) {
        dT.extn.sendKeys(extension);
    }

    @And("Kullanici start date {string}  girer")
    public void kullaniciStartDateGirer(String startDate) {
        dT.startDate.sendKeys(startDate);
    }

    @And("Kullanici salary {string} girer")
    public void kullaniciSalaryGirer(String salary) {
        dT.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dT.create.click();
    }

    @When("Kullanici {string} isim ile arama yapar")
    public void kullaniciIsimIleAramaYapar(String firstName) {
        actions.moveToElement(dT.search).click().sendKeys(firstName).perform();
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dT.aramaSonucIlkElement.getText().contains(firstName));
    }
}
