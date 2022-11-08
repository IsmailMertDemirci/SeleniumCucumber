package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.*;

public class TutorialStepDefinitions {
    String telefonMarkalari = "";
    TutorialPage tutorialPage = new TutorialPage();

    @Given("kullanici tutorial sitesine gider")
    public void kullaniciTutorialSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorial"));
    }

    @Then("Phones & PDAs'a tiklayiniz")
    public void phonesPDAsATiklayiniz() {
        tutorialPage.phonesPDAs.click();
    }

    @And("Telefonlarin markalarini aliniz")
    public void telefonlarinMarkalariniAliniz() {
        for (WebElement w : tutorialPage.phoneList) {
            telefonMarkalari += w.getText();
        }
    }

    @And("Tum ogeleri sepete ekleyiniz")
    public void tumOgeleriSepeteEkleyiniz() throws InterruptedException {
        for (WebElement w : tutorialPage.addToCart) {
            w.click();
        }
        Thread.sleep(2000);
    }

    @And("Sepete tiklayiniz")
    public void sepeteTiklayiniz() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(tutorialPage.sepet).click().perform();
        Thread.sleep(2000);
    }

    @And("Sepetteki isimleri aliniz")
    public void sepettekiIsimleriAliniz() {
        for (WebElement w : tutorialPage.sepetList) {
            System.out.println(w.getText());
        }
    }

    @And("Sepetteki ve sayfadaki urunlerin dogru oldugunu karsilastiriniz")
    public void sepettekiVeSayfadakiUrunlerinDogruOldugunuKarsilastiriniz() throws InterruptedException {
        for (int i = 0; i < tutorialPage.sepetList.size(); i++) {
            Assert.assertTrue(telefonMarkalari.contains(tutorialPage.sepetList.get(i).getText()));
            Thread.sleep(1000);
        }
    }
}