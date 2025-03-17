package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI extends PageObject {

    public static final Target INPUT_TEXT_USER = Target.
            the("Input donde se ingresa el usuario").
            locatedBy("//input[@id='txtUsuario']");

    public static final Target INPUT_TEXT_PASSWORD = Target.
            the("Input donde se ingresa el password").
            locatedBy("//input[@id='txtContrasenia']");

    public static final Target BUTTON_INICIAR_SESION = Target.
            the("Button para Iniciar Sesion").
            locatedBy("//input[@id='btnIngresar']");
}
