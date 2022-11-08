package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class Demo_Guru_Tum_Veri {


    @And("Tablodaki {string} tum degerleri yazdirir")
    public void tablodakiTumDegerleriYazdirir(String istenen) {
        List<WebElement> baslikList = Driver.getDriver().findElements(By.xpath("//thead//tr//th"));
        System.out.println(istenen);
        int sayac = 1;
        for (WebElement w : baslikList) {
            if (w.getText().equals(istenen)) {
                List<WebElement> sutunList = Driver.getDriver().findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[" + sayac + "]"));
                for (WebElement each : sutunList) {
                    System.out.println(each.getText());
                }
            }
            sayac++;
        }
    }
}
