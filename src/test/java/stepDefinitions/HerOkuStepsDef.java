package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerOkuStepsDef {
    HerokuappPage herOku = new HerokuappPage();

    @And("Add Element butona basin")
    public void addElementButonaBasin() {
        herOku.addElementsButton.click();
    }

    @And("Delete butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        ReusableMethods.waitForClickablility(herOku.deleteButton, 10);
    }

    @Then("Delete butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(herOku.deleteButton.isDisplayed());
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herOku.deleteButton.click();
    }

    @Then("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {
        Assert.assertFalse(herOku.deleteButtonList.size() > 0);
    }
}
