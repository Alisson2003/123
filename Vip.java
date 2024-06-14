public class Vip {
    static int espacio;
    String television;
    static String internet;
    static String serviExtra;
    static int maleta_extra;

    public Vip (int espacio, String internet, String maleta_extra, String serviExtra, String television) {
        this.espacio = espacio;
        this.internet = internet;
        this.maleta_extra = Integer.parseInt(maleta_extra);
        this.serviExtra = serviExtra;
        this.television = television;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getMaleta_extra() {
        return maleta_extra;
    }

    public void setMaleta_extra(String maleta_extra) {
        this.maleta_extra = Integer.parseInt("2" + maleta_extra);
    }

    public String getServiExtra() {
        return serviExtra;
    }

    public void setServiExtra(String serviExtra) {
        this.serviExtra = serviExtra;
    }

    public String getTelevision() {
        return television;
    }

    public void setTelevision(String television) {
        this.television = television;
    }
    public static void imprimir() {
        System.out.println("Espacio: " + espacio);
        System.out.println("Internet: " + internet);
        System.out.println("Maleta_extra: " + maleta_extra);
        System.out.println("ServiExtra: " + serviExtra);

    }
}
