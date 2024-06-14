public class Normal {

    static String asientos;
    static int espacio;
    public Normal(String asientos, int espacio) {
        this.asientos = asientos;
        this.espacio = espacio;
    }

    public String getAsientos() {
        return asientos;
    }
    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
    public int getEspacio() {
        return espacio;
    }
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public static void imprimir() {
        System.out.println(asientos + " " + espacio);
    }
}
