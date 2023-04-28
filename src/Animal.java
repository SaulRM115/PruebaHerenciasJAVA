public class Animal {
    private String nombre;
    private int edad;
    private String especie;

    // Constructor que inicializa los valores de los atributos
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo edad
    public int getEdad() {
        return edad;
    }

    // Setter para el atributo edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para el atributo especie
    public String getEspecie() {
        return especie;
    }

    // Setter para el atributo especie
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
