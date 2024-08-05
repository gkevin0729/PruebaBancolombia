package prueba.bancolombia.userinterface;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.grupobancolombia.com/")
public class PaginaGrupoBancolombia extends PageObject {
    public static final Target LINK_BANCOLOMBIAPERSONAS = Target.the("Click en link para ir a pagina de bancolombia persona")
            .located(By.linkText("www.bancolombia.com"));

}
