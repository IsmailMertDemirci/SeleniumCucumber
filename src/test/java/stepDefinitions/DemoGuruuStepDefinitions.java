package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class DemoGuruuStepDefinitions {
    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {

        List<WebElement> baslikList=Driver.getDriver().findElements(By.xpath("//thead//tr//th"));
        System.out.println(istenenSutun);
        int sayac=1;
        for (WebElement w:baslikList) {
            if (w.getText().equals(istenenSutun)){
               List<WebElement> sutunList=Driver.getDriver().findElements(By.xpath("//table[@class='dataTable']//tbody//tr/td["+sayac+"]"));
                for (WebElement each : sutunList) {
                    System.out.println(each.getText());
                }
            }
            sayac++;
        }
    }
}
