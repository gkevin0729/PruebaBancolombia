package prueba.bancolombia.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import java.util.Set;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambioPestana implements Interaction {
    public static CambioPestana cambioPestana(){
        return new CambioPestana();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<String> cambio = getDriver().getWindowHandles();

        for(String cambio2 : cambio){
            getDriver().switchTo().window(cambio2);
        }
    }
}
