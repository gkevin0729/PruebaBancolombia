package prueba.bancolombia.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import prueba.bancolombia.userinterface.PaginaGrupoBancolombia;


public class IngresarPagina implements Task {
    private PaginaGrupoBancolombia paginaGrupoBancolombia;

    public static Performable paginaGrupoBancolombia() {
        return Tasks.instrumented(IngresarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(paginaGrupoBancolombia));

    }
}
