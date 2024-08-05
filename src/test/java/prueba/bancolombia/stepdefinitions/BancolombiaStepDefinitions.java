package prueba.bancolombia.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import prueba.bancolombia.tasks.IngresarPagina;
import prueba.bancolombia.tasks.NavegarGrupoBancolombia;
import prueba.bancolombia.tasks.NavegarPaginaBancolombia;


import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BancolombiaStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
        theActorCalled("Kevin");

    }
    @Dado("ingrese a la pagina de GrupoBancolombia")
    public void ingreseALaPaginaDeGrupoBancolombia() {
        theActorCalled("Kevin").wasAbleTo(IngresarPagina.paginaGrupoBancolombia());
    }
    @Dado("cambie de pestana a bancolombia persona")
    public void cambieDePestanaABancolombiaPersona() {
       theActorCalled("Kevin").wasAbleTo(NavegarGrupoBancolombia.navegar());
    }
    @Cuando("navego hasta la pantalla de conversion de tasas de intereses")
    public void navegoHastaLaPantallaDeConversionDeTasasDeIntereses() {
        theActorCalled("Kevin").wasAbleTo(NavegarPaginaBancolombia.navegarBancolombia());
    }
    @Cuando("realizo la conversion de interes de tasa nominal a efectiva")
    public void realizoLaConversionDeInteresDeTasaNominalAEfectiva() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("verifico que se refleje el valor del resultado")
    public void verificoQueSeReflejeElValorDelResultado() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    /*@Dado("ingrese a la pagina de bancolombia personas")
    public void ingreseALaPaginaDeBancolombiaPersona() {
        theActorCalled("kevin").wasAbleTo(IngresarPagina.paginaGrupoBancologia());
    }
    @Cuando("Navego hasta la pantalla de Convertidor de tasa de interes")
    public void navegoHastaLaPantallaDeConvertidorDeTasaDeInteres() {
        theActorCalled("kevin").wasAbleTo(NavegarBancolombia.navegar());
    }*/



}
