public class Bebida extends Plato {
    public Bebida(String nombre, double precio, String descripcion) {
        super(nombre, precio, descripcion);
    }

    @Override
    public String getTipo() {
        return "Bebida";
    }
}