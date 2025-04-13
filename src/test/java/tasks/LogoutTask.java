package tasks;

import helpers.complementos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.IndexUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogoutTask implements Task {

    public LogoutTask() {
    }
    complementos comOBJ = new complementos();


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(IndexUI.BUTTON_PERFIL));
        comOBJ.delay(1);

        actor.attemptsTo(Click.on(IndexUI.BUTTON_CERRAR_SESION));
        comOBJ.delay(1);

    }

    public static LogoutTask salirsesion(){
        return instrumented(LogoutTask.class);
    }

}
