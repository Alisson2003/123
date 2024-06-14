public class Main {
    public static void main(String[] args) {
        System.out.println("\nTransportes de Buses * El Buho *");

        CompraPasajes compraPasajes = new CompraPasajes( );
        CompraPasajes compraPasajes2 = new CompraPasajes( );
        Pasajero pasajero = new Pasajero("Luna",25,"Lis", "1751336932");




        Ticket.imprimir();
        System.out.println("\nInformcacion del pasajero");
        Pasajero.imprimir();
        Normal.imprimir();
        Vip.imprimir();
        Ruta.mostrarRuta();
        compraPasajes.informacionCompra();

    }

}