public class Perro extends Animal {
    // Constantes para las razas de perro
    public static final String RAZA_LABRADOR = "Labrador Retriever";
    public static final String RAZA_PASTOR_ALEMAN = "Pastor Alemán";
    public static final String RAZA_BULLDOG = "Bulldog";

    private String raza;

    // Constructor que inicializa los valores de los atributos
    public Perro(String nombre, int edad, String raza) {
        // Se llama al constructor de la clase padre Animal para inicializar los atributos heredados
        super(nombre, edad, "Perro");
        this.raza = raza;
    }

    // Getter para el atributo raza
    public String getRaza() {
        return raza;
    }

    // Setter para el atributo raza
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
