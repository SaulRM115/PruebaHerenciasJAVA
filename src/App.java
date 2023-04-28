import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Creación de tres perros con diferentes edades y razas
        Perro perro1 = new Perro("Fido", 2, Perro.RAZA_LABRADOR);
        Perro perro2 = new Perro("Canela", 5, Perro.RAZA_PASTOR_ALEMAN);
        Perro perro3 = new Perro("Angelo", 5, Perro.RAZA_BULLDOG);
    

        // Imprimir los datos de cada perro
        System.out.println(perro1.getNombre() + " es un " + perro1.getRaza() + " de " + perro1.getEdad() + " años.");
        System.out.println(perro2.getNombre() + " es un " + perro2.getRaza() + " de " + perro2.getEdad() + " años.");
        System.out.println(perro3.getNombre() + " es un " + perro3.getRaza() + " de " + perro3.getEdad() + " años.");
    }
}
