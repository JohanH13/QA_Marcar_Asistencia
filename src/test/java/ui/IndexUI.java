package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class IndexUI extends PageObject {

    public static final Target BUTTON_PERFIL = Target.
            the("Input está el nombre del usuario").
            locatedBy("//span[@id='ctl00_lblNombreUsuarioMenu']");


    public static final Target BUTTON_CERRAR_SESION = Target.
            the("Salir Sesion").
            locatedBy("//a[@href='/marcacion/login.aspx']");


}
