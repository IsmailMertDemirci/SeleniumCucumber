package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TestPagePage;
import utilities.Driver;

public class TestPageStepsDef {
    TestPagePage testPage=new TestPagePage();
    Actions actions=new Actions(Driver.getDriver());
    int down32;
    int click;
    @And("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int sayi) {
        for (int i = 0; i <sayi ; i++) {
            testPage.clickButton.click();
        }
    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int sayi) {
        for (int i = 0; i <sayi ; i++) {
          actions.sendKeys(Keys.SPACE).perform();
        }
    }

    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {
        for (WebElement w:testPage.down32List) {
            down32+=Integer.parseInt(w.getText().replaceAll("[^0-9]",""));
        }
        System.out.println("Down daki 32 lerin toplami : "+down32);
    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {
        for (WebElement w:testPage.clickList) {
            click+=w.getText().length();
        }
        System.out.println("Click uzunluk : "+(down32-click));
    }

    @Then("Sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int sonuc) {
        Assert.assertEquals("mesah",sonuc,down32-click);
    }
}
