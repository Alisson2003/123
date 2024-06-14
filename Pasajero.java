public class Pasajero {
    static String nombre;
     static String apellido;
     static String numCedula;
     static int edad;

    public Pasajero(String apellido, int edad, String nombre, String numCedula) {
        this.apellido = apellido;
        this.edad = edad;
        this.nombre = nombre ;
        this.numCedula = numCedula ;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }


    public static void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Cedula: " + numCedula);
    }
}
