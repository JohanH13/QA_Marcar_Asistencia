package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoguearTask implements Task {

    private final String usuario;
    private final String password;

    public LoguearTask(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(LoginUI.INPUT_TEXT_USER));
        actor.attemptsTo(Enter.theValue(password).into(LoginUI.INPUT_TEXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginUI.BUTTON_INICIAR_SESION));
    }

    public static LoguearTask inicioSesion(String usuario, String password){
        return instrumented(LoguearTask.class, usuario, password);
    }
}
