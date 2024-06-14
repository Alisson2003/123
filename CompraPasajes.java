public class CompraPasajes {
    private Pasajero pasajero;
    String fechaCompra;
    double valor;

    public CompraPasajes(String fechaCompra, Pasajero pasajero, double valor) {
        this.fechaCompra = fechaCompra;
        this.pasajero = pasajero;
        this.valor = valor;
    }

    public CompraPasajes() {
        fechaCompra = "25 de enero" ;
        System.out.println(fechaCompra);
        valor = 250;
        System.out.println(valor);

    }


    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void informacionCompra(){
        System.out.println(" Informacion de la compra ");
        System.out.println(" " );
        Pasajero.imprimir();
        System.out.println("Fecha de Compra: " + fechaCompra);
        System.out.println("Valor: " + valor);
    }
}
