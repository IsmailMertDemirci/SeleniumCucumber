package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.GooglePage;
import pages.TrendyolPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendyolStepDefinitions {
    TrendyolPage ty = new TrendyolPage();
    GooglePage google = new GooglePage();
    Actions actions = new Actions(Driver.getDriver());
    String tyHandle;
    String mhHandle;
    int tyShoes;
    int mhShoes;

    @Given("Google'a gidiniz")
    public void googleAGidiniz() {
        Driver.getDriver().get(ConfigReader.getProperty("google"));
        google.googleCerez.click();
    }

    @Then("trendyol'u aratiniz")
    public void trendyolUAratiniz() throws InterruptedException {
        actions.moveToElement(google.googleSearchBox).click().sendKeys("trendyol", Keys.ENTER).perform();
        Thread.sleep(1000);
    }

    @And("trendyol linkini bulup siteye gidiniz")
    public void trendyolLinkiniBulupSiteyeGidiniz() throws InterruptedException {
        ty.trenyolGoogleLinki.click();
        Thread.sleep(2000);
        tyHandle = Driver.getDriver().getWindowHandle();
    }

    @And("shoes aratiniz")
    public void shoesAratiniz() throws InterruptedException {
        actions.moveToElement(ty.trendyolSearchbox).click().sendKeys("shoes", Keys.ENTER).perform();
        Thread.sleep(3000);
    }

    @And("toplam urun sayisini aliniz")
    public void toplamUrunSayisiniAliniz() throws InterruptedException {
        actions.moveToElement(ty.trendyolShoesSayisi).click().perform();
        Thread.sleep(2000);
        String tyUrunsayisi = ty.trendyolShoesSayisi.getText();
        tyShoes = Integer.parseInt(tyUrunsayisi.replaceAll("[^0-9]", ""));
    }

    @And("yeni sekmede morhipo'ya gidiniz")
    public void yeniSekmedeMorhipoYaGidiniz() throws InterruptedException {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("morhipo"));
        mhHandle = Driver.getDriver().getWindowHandle();
    }

    @And("mh shoes aratiniz")
    public void mhShoesAratiniz() throws InterruptedException {
        actions.moveToElement(ty.morhipoSearchBox).click().sendKeys("shoes", Keys.ENTER).perform();
    }

    @And("mh toplam urun sayisini aliniz")
    public void mhToplamUrunSayisiniAliniz() throws InterruptedException {
        actions.moveToElement(ty.morhipoShoes).click().perform();
        Thread.sleep(2000);
        String mhUrunSayisi = ty.morhipoShoes.getText();
        mhShoes = Integer.parseInt(mhUrunSayisi.replaceAll("[^0-9]", ""));
    }

    @And("iki sitedeki topla makas sayisini karsilastiriniz")
    public void ikiSitedekiToplaMakasSayisiniKarsilastiriniz() {
        if (tyShoes > mhShoes) {
            System.out.println("Trendyoldaki urun sayisi daha fazla");
        } else {
            System.out.println("Morhipodaki urun sayisi daha fazla");
        }
    }

    @And("Once urun sayisi fazla olan siteyi kapatiniz")
    public void onceUrunSayisiFazlaOlanSiteyiKapatiniz() {
        if (tyShoes > mhShoes) {
            Driver.getDriver().switchTo().window(tyHandle).close();
        } else {
            Driver.getDriver().switchTo().window(mhHandle).close();
        }
    }

    @And("Sonra diger sayfayida kapatiniz")
    public void sonraDigerSayfayidaKapatiniz() throws InterruptedException {
        Thread.sleep(3000);
        Driver.quitDriver();
    }
}
