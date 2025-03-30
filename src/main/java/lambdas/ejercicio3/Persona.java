package lambdas.ejercicio3;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombre() {
        return this.nombre;
    }

    public String apellido() {
        return this.apellido;
    }

    public boolean empiezaCon(String letra) {
        if (this.nombre.startsWith(letra)) {
            return true;
        }
        return false;
    }

    public boolean nombrePar() {
        boolean esPar = this.nombre.length() % 2 == 0;
        return esPar;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
