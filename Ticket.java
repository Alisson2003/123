public class Ticket {
    static String rutas;
    static double pasaje;

    public Ticket(double pasaje, String rutas) {
        this.pasaje = pasaje;
        this.rutas = rutas;
    }

    public double getPasaje() {
        return pasaje;
    }

    public void setPasaje(double pasaje) {
        this.pasaje = pasaje;
    }

    public String getRutas() {
        return rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }

    public static void imprimir() {
        System.out.println("Rutas: " + rutas);
        System.out.println("Pasaje: " + pasaje);
    }
}
