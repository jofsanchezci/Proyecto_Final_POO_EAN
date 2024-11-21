public class Postre extends Plato {
    public Postre(String nombre, double precio, String descripcion) {
        super(nombre, precio, descripcion);
    }

    @Override
    public String getTipo() {
        return "Postre";
    }
}