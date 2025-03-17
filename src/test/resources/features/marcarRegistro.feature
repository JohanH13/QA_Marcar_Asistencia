@MarcarRegistro

  Feature: Marcar asistencia en distintos horarios
    Background: Validar que se marque el registro correctamente

    @ProcesoSiged
    Scenario Outline: Iniciar sesión y marcar asistencia en horario específico
      Given el usuario abre ingresa a la url https://app.canvia.com/marcacion/
      When el usuario inicia sesión con <usuario> y <password>
      And hace clic en el botón de asistencia de <hora>
      Then valida que la asistencia fue registrada correctamente
      And cierra sesión

      Examples:
        | usuario  | password  | hora   |
        | jhuallpa  | C1sc0.T0ky026   | 08:30  |