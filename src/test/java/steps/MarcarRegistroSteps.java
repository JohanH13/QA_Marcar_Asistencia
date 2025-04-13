package steps;

import helpers.complementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.LogoutTask;
import tasks.LoguearTask;
import tasks.MarcarTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MarcarRegistroSteps {

    complementos comOBJ = new complementos();

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");

    }
    @Given("el usuario abre ingresa a la url {}")
    public void el_usuario_abre_ingresa_a_la_url(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
        getDriver().manage().window().maximize();
        System.out.println("LA url es:" + url);
        System.out.println("nombre del actor" + OnStage.theActorInTheSpotlight().getName());
        comOBJ.delay(1);
    }
    @When("el usuario inicia sesión con {} y {}")
    public void el_usuario_inicia_sesión_con_user_y_pass(String user, String password) {
        theActorInTheSpotlight().attemptsTo(LoguearTask.inicioSesion(user,password));
        comOBJ.delay(1);
    }
    @And("hace clic en el botón de asistencia de {}")
    public void hace_clic_en_el_botón_de_asistencia_de(String hora) {
        theActorInTheSpotlight().attemptsTo(MarcarTask.marcarRegistro());
        comOBJ.delay(1);
    }
    @Then("valida que la asistencia fue registrada correctamente")
    public void valida_que_la_asistencia_fue_registrada_correctamente() {

        comOBJ.delay(1);
    }
    @And("cierra sesión")
    public void cierra_sesión() {
        theActorInTheSpotlight().attemptsTo(LogoutTask.salirsesion());
        System.out.println("Salir_sesion");
        comOBJ.delay(1);
    }
}
