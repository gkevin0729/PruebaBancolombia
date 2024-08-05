package prueba.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import prueba.bancolombia.interactions.CambioPestana;

import static prueba.bancolombia.userinterface.PaginaGrupoBancolombia.LINK_BANCOLOMBIAPERSONAS;

public class NavegarGrupoBancolombia implements Task {

    public static Performable navegar(){
        return Tasks.instrumented(NavegarGrupoBancolombia.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(LINK_BANCOLOMBIAPERSONAS));
        actor.attemptsTo(CambioPestana.cambioPestana());


    }


}

