package helpers;

public class complementos {

    public complementos() {
    }
    public void delay (long tiempo) {
        try {
            Thread.sleep(tiempo * 1000);
            System.out.println("Se aplica una espera de: " + tiempo+ " segundos");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
