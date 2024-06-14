public class Ruta {
    public static String Quito_Guayaquil;
    public static String Quito_Tulcan;
    public static String Quito_Puyo;
    public static String Quito_Riobamba;


    static String destino;
    String retorno;
    static double valor_pasaje;

    public Ruta(String destino, String retorno, double valor_pasaje) {
        this.destino = destino ;
        this.valor_pasaje = valor_pasaje;
    }

    public Ruta() {

    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor_pasaje() {
        return valor_pasaje;
    }
    public void setValor_pasaje(double valor_pasaje) {
        this.valor_pasaje = valor_pasaje;
    }

    public static void mostrarRuta() {
        System.out.println(destino);
        System.out.println(valor_pasaje);
    }


}


