package prueba.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import prueba.bancolombia.interactions.CambioPestana;

import static prueba.bancolombia.userinterface.PaginaBancolombia.*;


public class NavegarPaginaBancolombia implements Task {

    public static Performable navegarBancolombia(){
        return Tasks.instrumented(NavegarPaginaBancolombia.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(LINK_NEGOCIO));
        actor.attemptsTo(Click.on(BTN_SOLUCIONNOFINANCIERAS));
        actor.attemptsTo(Click.on(BTN_HERRAMIENTAS));
        actor.attemptsTo(Click.on(BTN_FLECHADERECHA));
        actor.attemptsTo(Click.on(BTN_GESTIONARFINANZAS));



    }
}
