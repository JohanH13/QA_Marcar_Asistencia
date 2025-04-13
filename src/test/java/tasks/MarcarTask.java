package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.IndexUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MarcarTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexUI.BUTTON_ENTRADA));
        //actor.attemptsTo(Click.on(IndexUI.BUTTON_INICIO_REFRIGERIO));
        //actor.attemptsTo(Click.on(IndexUI.BUTTON_FIN_REFRIGERIO));
        //actor.attemptsTo(Click.on(IndexUI.BUTTON_SALIDA));

    }

    public static MarcarTask marcarRegistro(){
        return instrumented(MarcarTask.class);
    }
}
