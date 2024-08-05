package prueba.bancolombia.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class PaginaBancolombia extends PageObject {
    public static final Target LINK_NEGOCIO = Target.the("Click en la seccion de negocio")
            .located(By.linkText("Negocios"));
    public static final Target BTN_SOLUCIONNOFINANCIERAS = Target.the("Click en soluciones financieras")
            .located(By.xpath("//li[@class='header-menu_item has-submenu'][2]"));
    public static final Target BTN_HERRAMIENTAS = Target.the("Click en link para ir a pagina de herramientas")
            .located(By.xpath("//a[@id='linkherramientas']"));
    public static final Target BTN_FLECHADERECHA = Target.the("Click en link en flecha derecha")
            .located(By.xpath("//*[@id='layoutContainers']/div/div[2]/div/div[6]/div/section/div[2]/div[1]/div/div/div/div/div[2]/button/i"));
    public static final Target BTN_GESTIONARFINANZAS = Target.the("Click en GESTIONAR FINANZAS")
            .located(By.xpath("*[@id='layoutContainers']/div/div[2]/div/div[6]/div/section/div[2]/div[1]/div/div/div/div/div[1]/div[7]/div[2]/a"));


    ////*[@id="layoutContainers"]/div/div[2]/div/div[6]/div/section/div[2]/div[1]/div/div/div/div/div[1]/div[7]/div[2]/a


}
