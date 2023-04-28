import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Creación de tres perros con diferentes edades y razas
        Perro perro1 = new Perro("Fido", 2, Perro.RAZA_LABRADOR);
    

        // Imprimir los datos de cada perro
        System.out.println(perro1.getNombre() + " es un " + perro1.getRaza() + " de " + perro1.getEdad() + " años.");
    }
}
